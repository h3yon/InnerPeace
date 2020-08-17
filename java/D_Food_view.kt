package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.innerpeace.F_Beer_view

class D_Food_view : AppCompatActivity() {

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

        val manager = GridLayoutManager(this@D_Food_view, 2)

        val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "가산물갈비 & 백년불고기", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 가산디지털1로 128\n 010-9581-8981\n " +
                        "주말 11:30 - 22:00 매일 11:30 - 22:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "스톤 504", "#남/녀 화장실 구분",
                "숭실대입구역\n 서울 동작구 상도로61길 54\n 02-6401-0504\n " +
                        "매일 11:00 - 24:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "뻥쟁이네 광명사거리역점", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 광명로893번길 4\n 02-2625-5803\n " +
                        "매일 14:00 - 01:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "아들내미떡볶이", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 오리로964번길 22-1\n 02-6368-5876\n " +
                        "매일 09:30 - 10:00매주 화요일 휴무\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "서민준밀밭", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 가산디지털1로 128\n 010-9581-8981\n " +
                        "주말 11:30 - 22:00 매일 11:30 - 22:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "텍사스데브라질 센트럴시티점", "#남/녀 화장실 구분 #장애인 편의시설\n",
                "이수역\n 서울 동작구 동작대로27길 20-4\n 02-522-0045\n " +
                        "매일 11:00 - 22:005월~9월휴무일없음10월~4월매주일요일휴무\n 남/녀 화장실 구분\n 장애인 편의시설"

            ),
            Image(
                R.mipmap.ic_launcher,
                "서관면옥 교대본점", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 서초대로56길 11\n 02-521-9945\n " +
                        "매일 11:30 - 15:00, 17:00 - 21:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "호무랑", "#남/녀 화장실 구분",
                "강남구청역\n 서울 강남구 도산대로 442\n 02-6947-1279\n" +
                        "매일 11:30 - 16:00 매일 17:30 - 22:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "다로베", "#남/녀 화장실 구분",
                "뚝섬역\n 서울 성동구 서울숲길 48\n 02-499-3666\n " +
                        "주말 11:30 - 16:00 주말 17:00 - 22:00 평일 12:00 - 15:00 평일 17:00 - 22:00 월요일 12:00 - 22:00매월 첫번째 월요일 정기휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "로니로티 건대점", "#남/녀 화장실 구분 #장애인 편의시설\n",
                "건대입구역\n 서울 광진구 아차산로 225\n 02-498-7999\n " +
                        "매일 11:30 - 15:30, 16:30 - 22:30\n 남/녀 화장실 구분\n 장애인 편의시설"

            ),
            Image(
                R.mipmap.ic_launcher,
                "최신족발", "#남/녀 화장실 구분",
                "건대입구역\n 서울 광진구 아차산로29길 63\n 02-466-3988\n " +
                        "주말 12:00 - 02:00 평일 12:00 - 02:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "진아구 사가정점", "#남/녀 화장실 구분",
                "사가정역\n 서울 중랑구 사가정로 361\n 02-433-1049\n" +
                        "매일 11:30 - 23:30\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "애그머니", "#남/녀 화장실 구분",
                "태릉입구역\n 서울 노원구 화랑로 421\n 02-977-2999\n " +
                        "매일 11:30 - 15:00 매일 17:00 - 20:30 매주 월요일 휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "제일콩집", "#남/녀 화장실 구분",
                "태릉입구역\n 서울 노원구 동일로174길 37-8\n 02-972-7016\n " +
                        "매일 09:30 - 21:00 명절 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "제임스키친", "#남/녀 화장실 구분",
                "건대입구역\n 서울 노원구 노해로81길 12-26\n 02-952-4748\n " +
                        "평일 11:00 - 22:00 토요일 11:00 - 22:00 일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "다마식당\n", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로5길 31\n 02-935-8883\n" +
                        "매일 12:00 - 01:00\n 남/녀 화장실 구분\n"

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

