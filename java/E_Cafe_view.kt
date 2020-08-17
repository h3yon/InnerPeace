package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.innerpeace.F_Beer_view

class E_Cafe_view : AppCompatActivity() {

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

        val manager = GridLayoutManager(this@E_Cafe_view, 2)

         val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "구뜨커피", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 가산디지털1로 181\n 02-6281-6003\n " +
                        "주말 11:00 - 17:00 평일 08:00 - 20:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "블루조커피", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 광명로 889\n 02-2688-6232\n " +
                        "매일 07:00 - 03:00 연중무휴, 주말/공휴일은 새벽2:30까지\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "더디저트랩", "#남/녀 화장실 구분 #장애인 편의시설",
                "장승배기역\n 서울 동작구 장승배기로10길 100\n 070-7723-2300\n " +
                        "매일 13:00 - 20:00매주 화요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "코너빈커피", "#남/녀 화장실 구분",
                "장승배기역\n 서울 동작구 장승배기로 96-2\n 070-8782-5406\n " +
                        "평일, 토요일 10:00 - 23:00 일요일 휴무\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "담장옆에국화꽃 파미에점", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 사평대로 205\n 02-591-1157\n " +
                        "매일 10:00 - 23:001월1일, 명절당일 휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "더 커피 컴퍼니", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 서초중앙로29길 16\n 070-7756-3016\n " +
                        "매일 09:00 - 21:30연중무휴\n, 주말/공휴일은 새벽2:30까지\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "미미미가든카페", "#남/녀 화장실 구분",
                "청담역점\n 서울 강남구 도산대로 417\n 02-514-8765\n " +
                        "매일 10:00 - 01:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "PS Café Cheongdam", "#남/녀 화장실 구분",
                "청담역점\n 서울 강남구 도산대로49길 9\n 070-7772-7797\n " +
                        "월~목요일 11:00 - 21:30, 금요일 11:00 - 22:00 토요일 10:00 - 22:00 일요일 10:00 - 21:30\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "카페성수", "#남/녀 화장실 구분",
                "뚝섬역\n 서울 성동구 서울숲4길 13\n 02-465-1077\n " +
                        "매일 10:00 - 22:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "블루보틀 성수 카페", "#남/녀 화장실 구분",
                "뚝섬역\n 서울 성동구 아차산로 7\n 02-6212-6998\n " +
                        "매일 08:00 - 20:00\n, 주말/공휴일은 새벽2:30까지\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "카페 아르무아", "#남/녀 화장실 구분",
                "건대입구역\n 서울 광진구 동일로22길 117-27\n 02-463-9981\n " +
                        "매일 11:00 - 23:00\n 남/녀 화장실 구분\n "

            ),
            Image(
                R.mipmap.ic_launcher,
                "랑데자뷰 건대점", "#남/녀 화장실 구분",
                "건대입구역\n 서울 광진구 아차산로31길 3\n 070-7718-3088\n " +
                        "매일 11:30 - 23:30\n 남/녀 화장실 구분\n"

            )
        )


        val itemList7_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "꼼카페", "#남/녀 화장실 구분",
                "먹골역\n 서울 노원구 공릉로32길 5\n 02-977-9366\n " +
                        "매일 10:00 - 22:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "감각", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로 77\n 070-7576-4177\n " +
                        "주말 11:00 - 23:00 평일 11:00 - 23:00\n, 주말/공휴일은 새벽2:30까지\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "플로레스테이블", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로5길 12\n 02-931-9312\n " +
                        "매일 11:00 - 22:00 월요일 휴무\n 남/녀 화장실 구분\n "

            ),
            Image(
                R.mipmap.ic_launcher,
                "처음커피", "#남/녀 화장실 구분",
                "수락산역\n 서울 노원구 동일로 1693-6\n 02-935-6700\n " +
                        "매일 11:30 - 23:30\n 남/녀 화장실 구분\n"

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
