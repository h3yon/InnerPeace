package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.innerpeace.F_Beer_view

class C_Mart_view : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val manager = GridLayoutManager(this@C_Mart_view, 2)

        val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "노브랜드 마리오아울렛점", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 벚꽃로 266\n 02-2067-2139\n " +
                        "평일 10:30~21:00, 매월 2,4째주 의무 휴업\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트메트로광명점", "#남/녀 화장실 구분 #장애인 편의시설",
                "광명사거리역\n 경기 광명시 오리로 970\n 02-2676-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 이수점", "#남/녀 화장실 구분 #장애인 편의시설",
                "이수역\n 서울 동작구 사당로 300 이수자이\n 02-595-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 서초점", "#남/녀 화장실 구분 #장애인 편의시설",
                "내방역\n 서울 서초구 서초대로38길 12\n 02-918-2500\n" +
                        "매일 10:00 - 23:30 매월 2, 4째주 일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "노브랜드 강남터미널점", "#정보없음",
                "고속버스터미널역\n 서울 서초구 신반포로 194 지하층 대형1호\n 02-537-8491\n " +
                        "매일 10:00 - 22:00 매월 2,4째주 일요일 휴뮤\n 정보없음\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 자양점", "#남/녀 화장실 구분 #장애인 편의시설",
                "건대역\n 서울 광진구 아차산로 272 이마트자양점\n 02-2024-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 면목점\n", "#남/녀 화장실 구분 #유아시설",
                "면목역\n 서울 중랑구 동일로 540\n 02-437-2080\n " +
                        "매일 10:00 - 24:00 \n 남/녀 화장실 구분\n 유아시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "하나로마트 농협청담점", "#정보없음",
                "강남구청역\n 서울 강남구 학동로 411\n 02-517-6642\n" +
                        "매일 09:00 - 21:00 \n 정보없음\n"

            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "코스트코코리아 상봉점", "#남/녀 화장실 구분",
                "상봉역\n 서울 중랑구 망우로 336\n 1899-9900\n " +
                        "매일 10:00 - 22:00 \n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 상봉점", "#정보없음",
                "상봉역\n 서울 중랑구 망우로 353 홈플러스상봉점\n 02-6922-8100\n " +
                        "매일 10:00 - 24:00 \n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 묵동점", "#남/녀 화장실 구분 #장애인 편의시설",
                "먹골역\n 서울 중랑구 동일로 932 묵동자이2단지\n 02-2083-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 월계점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "공릉역\n 서울 노원구 마들로3길 15 이마트월계점\n 02-2092-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n" +
                        " 장애인 편의시설\n"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.item_recyclerView)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, itemList){
            val intent = Intent(this, Detail_view::class.java)
            intent.putExtra(F_Beer_view.INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
}
