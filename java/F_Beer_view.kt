package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class F_Beer_view : AppCompatActivity() {

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

        val manager = GridLayoutManager(this@F_Beer_view, 2)

       val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "스튜디오레이크", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 디지털로 210\n 010-2520-9864\n " +
                        "월, 토요일 18:00 - 00:00 화~목요일 18:00 - 00:30 금요일 18:00 - 01:00 일요일 휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "비어마켓낭만가", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 오리로985번길 1\n 010-7163-2154\n " +
                        "매일 17:00 - 04:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "아맛나슈퍼 광명사거리점", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 오리로985번길 6\n 02-2066-3684\n " +
                        "매일 17:00 - 05:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "프렌밀리", "#남/녀 화장실 구분",
                "장승배기역\n 서울 동작구 양녕로 271\n 010-3200-4660\n " +
                        "일~목요일 18:00 - 01:00 금~토요일 18:00 - 02:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "신사펍", "#남/녀 화장실 구분",
                "이수역\n 서울 동작구 동작대로 129\n 010-4849-1571\n " +
                        "매일 18:00 - 02:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "하얀집호프", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 신반포로 189\n 02-594-9719\n " +
                        "평일 15:30 - 01:00, 토요일 15:30 - 01:00, 일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "모보 바", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 신반포로 176\n 02-6282-6739\n " +
                        "매일 18:00 - 01:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "보테가 라운지", "#남/녀 화장실 구분",
                "청담역\n 서울 강남구 도산대로 502\n 02-3446-5555\n " +
                        "월~목요일 20:00 - 02:00 금~토요일 20:00 - 04:00 일요일 휴무\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "어메이징브루잉컴퍼니", "#남/녀 화장실 구분",
                "뚝섬역\n 서울 성동구 성수일로4길 4\n 02-465-5208\n " +
                        "평일 18:00 - 01:00 토요일 16:00 - 01:00 일요일 16:00 - 24:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "MIXX LOUNGE BAR", "#남/녀 화장실 구분",
                "건대입구역\n 서울 광진구 동일로24길 102\n 02-498-8259\n " +
                        "매일 18:00 - 04:00 연중무휴\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "일레븐 라운지", "#남/녀 화장실 구분 #장애인 편의시설",
                "건대입구역\n 서울 광진구 동일로 172\n 02-498-2211\n " +
                        "매일 18:00 - 02:00 매일 18:00 - 01:00 금요일 20:00 - 02:00 토요일 20:00 - 02:00\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "포차다락", "#남/녀 화장실 구분",
                "사가정역\n 서울 중랑구 면목로 336\n 010-4165-2314\n " +
                        "일~목요일 18:00 - 05:00 금,토 요일 아침 6시까지 영업\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "라온", "#남/녀 화장실 구분",
                "태릉입구역\n 서울 중랑구 동일로 932\n 02-3296-0045\n " +
                        "매일 18:00 - 02:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "하토상의술방", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로3길 10\n 02-938-2252\n " +
                        "매일 16:30 - 02:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "시오코", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로5길 26\n 02-936-5001\n " +
                        "매일 17:00 - 04:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "시골막걸리", "#남/녀 화장실 구분",
                "수락산역\n 서울 노원구 동일로 1530\n 02-931-9080\n " +
                        "매일 15:30 - 01:30 일요일12시마감\n 남/녀 화장실 구분\n"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.item_recyclerView)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, itemList){
            val intent = Intent(this, Detail_view::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
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
