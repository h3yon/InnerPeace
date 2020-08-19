package com.project.innerpeace


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.naver.maps.geometry.LatLng
import com.naver.maps.geometry.LatLngBounds
import com.naver.maps.map.*
import com.naver.maps.map.overlay.Marker
import com.naver.maps.map.util.FusedLocationSource
import com.naver.maps.map.util.MarkerIcons
import kotlinx.android.synthetic.main.activity_g_p_s_view.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class GPS_view : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var locationSource: FusedLocationSource
    private lateinit var naverMap: NaverMap
    private var gpsTracker: GpsTracker? = null
    var markersPosition = Vector<LatLng>()
    var activeMarkers = Vector<Marker>()
    var myLatitude: Double = 0.0
    var myLongitude: Double = 0.0
    private lateinit var database: DatabaseReference
    var publicToilet_lat = ArrayList<String>()
    var publicToilet_lng = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g_p_s_view)

        //서버에서 api정보 받아오기
        database = FirebaseDatabase.getInstance().getReference()
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values to update the UI

                var DATA : Any?
                var td: Map<String, String>?
                for (i in 0..4542){
                    DATA = dataSnapshot.child("DATA/" + (i+1).toString()).getValue()
                    td = DATA as HashMap<String, String>?
                    publicToilet_lat.add(td?.get("y_wgs").toString() )
                    publicToilet_lng.add(td?.get("x_wgs").toString() )
                }
                for (i in 0 until publicToilet_lat.size){
                    markersPosition.add(LatLng(publicToilet_lat[i].toDouble(),publicToilet_lng[i].toDouble()))
                }


            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
            }
        }
        database.addValueEventListener(postListener)



        //ToolBar
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //내 현재위치 좌표
        gpsTracker = GpsTracker(this@GPS_view)
        this.myLatitude = gpsTracker!!.latitude
        this.myLongitude = gpsTracker!!.longitude


        //네이버 지도 객체 불러오기
        val fm = supportFragmentManager
        val mapFragment = fm.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                fm.beginTransaction().add(R.id.map_fragment, it).commit()
            }
        val mapFragment2 = fm.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                fm.beginTransaction().add(R.id.map_fragment, it).commit()
            }
        mapFragment.getMapAsync(this)

        //현재위치 가져오기 -> 네이버 tracker용
        locationSource =
            FusedLocationSource(this, GPS_view.LOCATION_PERMISSION_REQUEST_CODE)


        //검색버튼 누르면 화면전환
        search_button.setOnClickListener {
            val inputString = station_text.text.toString()

            if (inputString == "") {
                Toast.makeText(this@GPS_view, "역 이름을 입력해주세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@GPS_view, HomeViewActivity::class.java)
                intent.putExtra("input", inputString)
                startActivity(intent)
            }

        }

        emergency_button.setOnClickListener {
            //긴급버튼 누르면..
            mapFragment2.getMapAsync(this)
            // 카메라 이동 되면 호출 되는 이벤트
            naverMap.addOnCameraChangeListener { reason, animated ->
                freeActiveMarkers()
                val currentPosition = getCurrentPosition(naverMap)
                // 정의된 마커위치들중 가시거리 내에있는것들만 마커 생성
                for (markerPosition in markersPosition) {
                    if (!withinSightMarker(
                            currentPosition,
                            markerPosition!!
                        )
                    ) {
                        continue
                    } //카메라 가시거리 안에 없으면 continue
                    val marker = Marker()
                    marker.position = markerPosition!!
                    marker.icon = MarkerIcons.BLACK
                    marker.map = naverMap
                    activeMarkers.add(marker)

                }
            }
        }
    }

    // 지도상에 표시되고있는 마커들 지도에서 삭제
    fun freeActiveMarkers() {
        if (activeMarkers == null) {
            activeMarkers = Vector<Marker>()
            return
        }
        for (activeMarker in activeMarkers) {
            activeMarker.map = null
        }
        activeMarkers = Vector<Marker>()
    }


    // 현재 카메라가 보고있는 위치를 알려주는 함수
    open fun getCurrentPosition(naverMap: NaverMap): LatLng {
        val cameraPosition = naverMap.cameraPosition
        return LatLng(cameraPosition.target.latitude, cameraPosition.target.longitude)
    }

    //마커가 가시거리 안에 있는지 확인하는 함수
    val REFERANCE_LAT_X3 = 1 / 109.958489129649955
    val REFERANCE_LNG_X3 = 1 / 88.74
    open fun withinSightMarker(currentPosition: LatLng, markerPosition: LatLng ): Boolean {
        val withinSightMarkerLat: Boolean =
            Math.abs(currentPosition.latitude - markerPosition.latitude) <= REFERANCE_LAT_X3
        val withinSightMarkerLng: Boolean =
            Math.abs(currentPosition.longitude - markerPosition.longitude) <= REFERANCE_LNG_X3
        return withinSightMarkerLat && withinSightMarkerLng
    }



    //위치정보 허가 여부 판단하는 함수
    open override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (locationSource.onRequestPermissionsResult(
                requestCode, permissions,
                grantResults
            )
        ) {

            if (!locationSource.isActivated) { // 권한 거부됨
                naverMap.locationTrackingMode = LocationTrackingMode.None
//                Log.d("map_permit","권한 거부됨")
            }
            return
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    companion object{
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1000
    }

    //ToolBar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            android.R.id.home -> {
                finish()
                return true
            }
            
            //추가
            R.id.mypage_button->{
                startActivity(Intent(this,MyPage::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }


    //지도 준비되면 호출되는 함수
    override fun onMapReady(naverMap: NaverMap) {
        this.naverMap = naverMap
        Log.d("life", "onMapReady")
        // 카메라 초기 위치 설정
        val initialPosition = LatLng(myLatitude, myLongitude)
        val cameraUpdate: CameraUpdate = CameraUpdate.scrollTo(initialPosition)
        naverMap.moveCamera(cameraUpdate)

        //현재위치(파란 동그라미) 보이게 하기
        var locationOverlay = naverMap.locationOverlay
        locationOverlay.isVisible = true    //오버레이 보이게 하기
        naverMap.locationSource = locationSource
        naverMap.locationTrackingMode = LocationTrackingMode.Follow     //현재위치 추적모드

        naverMap.extent = LatLngBounds( LatLng(myLatitude-0.003, myLongitude-0.003),LatLng(myLatitude+0.003, myLongitude+0.003))

    }


}
