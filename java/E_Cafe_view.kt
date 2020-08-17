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
        
        val itemList1_1 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "카페 아를", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 동일로 204 \n 031-837-1717" +
                        "\n 매일 10:00 - 24:00연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "파크프리베", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 동일로192번길 28-27 \n 031-873-9200" +
                        "\n 매일 10:00 - 23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "슈바벤", "#남/녀 화장실 구분 #장애인 편의시설",
                "도봉 \n 서울 도봉구 방학로3길 6 \n 02-2088-0776" +
                        "\n 매일 10:00 - 22:00 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "아띠 카페", "#남/녀 화장실 구분",
                "덕계 \n 경기 양주시 평화로1475번길 219 \n 010-9325-8037" +
                        "\n 매일 09:00 - 21:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "와겐커피", "#남/녀 화장실 구분",
                "방학 \n 서울 도봉구 도봉로150마길 15 \n 02-2277-3001" +
                        "\n 매일 09:00 - 01:00연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "카페마마스", "#남/녀 화장실 구분",
                "월계 \n 서울 노원구 마들로3길 15 \n 02-977-1240" +
                        "\n 매일 10:00 - 22:00(Last Order 21:30) ( 둘째주, 넷째주 일요일 휴점) \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "커피베이", "#남/녀 화장실 구분",
                "월계 \n 서울 노원구 월계로 370 희성프라자 \n 02-977-8891" +
                        "\n 매일 08:30 - 22:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "964커피로스터리", "#남/녀 화장실 구분",
                "회기 \n 서울 동대문구 망우로21길 63 \n 02-6325-0964" +
                        "\n 매일 10:00 - 22:30 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "제이히든하우스", "#남/녀 화장실 구분",
                "동대문 \n 서울 종로구 종로 269-4 \n 02-744-1915" +
                        "\n 매일 12:30 - 16:30 휴무 인스타그램 확인 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "차차 티클럽", "#남/녀 화장실 구분",
                "동대문 \n 서울 종로구 종로46가길 13 \n 070-7755-4758" +
                        "\n 매일 13:00 ~ 22:00 월요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "밀크홀1937", "#남/녀 화장실 구분",
                "종각 \n 서울 종로구 종로 86-1 \n 070-8801-1937" +
                        "\n 매일 07:30 - 22:30 연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "등선재", "#남/녀 화장실 구분",
                "종로3가 \n 서울 종로구 돈화문로9길 26-1 \n 02-3665-6600" +
                        "\n 매일 11:00 - 22:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "카페마마스", "#남/녀 화장실 구분",
                "시청 \n 서울 중구 무교로 16 체육회관 \n 02-318-1230" +
                        "\n 매일 10:30 - 20:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "투썸플레이스", "#남/녀 화장실 구분",
                "시청 \n 서울 중구 무교로 6 \n 02-778-5611" +
                        "\n 매일 07:00 - 23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "식물학", "#남/녀 화장실 구분 #건물 내부 ",
                "용산 \n 서울 용산구 한강대로23길 55 용산역 4층 \n 02-2012-0434" +
                        "\n 매일 10:30 - 22:30 연중휴무 \n 남/녀 화장실 구분 \n 건물 내부 "
            ),
            Image(R.mipmap.ic_launcher,
                "오월의종", "#남/녀 화장실 구분",
                "영등포 \n 서울 영등포구 영중로 15 타임스퀘어 \n 02-2636-3801" +
                        "\n 매일 10:30 - 22:30 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "할리스커피", "#남/녀 화장실 구분",
                "구로 \n 서울 구로구 새말로 18-29 \n 02-862-3216" +
                        "\n 매일 08:00 - 22:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "투썸플레이스", "#남/녀 화장실 구분",
                "개봉 \n 서울 구로구 남부순환로97길 20-1 \n 02-2618-8133" +
                        "\n 매일 09:00 - 23:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "feelin", "#남/녀 화장실 구분",
                "부천 \n 경기 부천시 부천로39번길 43 \n 010-8301-8842" +
                        "\n 매일 10:00 - 22:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "카페리프", "#내부 #남녀공용 ",
                "부천 \n 경기 부천시 부천로54번길 30 1층 카페리프 \n 010-9916-2101" +
                        "\n 매일 11:30 - 22:30 \n 내부 \n 남녀공용 "
            )
        )


        val itemList1_6 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "카페 휄리스", "#남/녀 화장실 구분",
                "인천 \n 인천 중구 홍예문로 56 \n 032-777-6991" +
                        "\n 매일 12:00 - 20:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "우물옆그집", "#남/녀 화장실 구분",
                "인천 \n 인천 중구 동화마을길 49 \n 032-772-5545" +
                        "\n 평일 09:00 - 19:00 매월 첫째,셋째주 수요일 휴무, 주말 09:00 - 21:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "포그커피", "#남/녀 화장실 구분",
                "부평 \n 인천 부평구 광장로4번길 8 1층 \n 032-502-0830" +
                        "\n 매일 11:00 - 22:30 매주 월요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "빌리엔젤", "#남/녀 화장실 구분",
                "부평 \n 인천 부평구 경원대로 1370 1~3층 \n 032-362-8900" +
                        "\n 매일 11:00 - 23:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_7 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "탐앤탐스", "#건물 내부",
                "가산디지털단지 \n 서울 금천구 벚꽃로 298 1층 114호 \n 02-2083-5565" +
                        "\n 평일 07:00 - 01:00 주말 11:00 - 00:00 \n 건물 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "커피더캠프", "#건물 내부",
                "가산디지털단지 \n 서울 금천구 벚꽃로 298 1층 126호 \n 02-2083-5858" +
                        "\n 평일 07:00 - 22:00 \n 건물 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "필커피", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 팔달구 덕영대로935번길 10 \n 010-9345-5876" +
                        "\n 매일 12:00 - 22:00 휴무 인스타 공지 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이즘이즘", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 팔달구 고화로9번길 13 지하1층 \n 010-6794-6749" +
                        "\n 평일 12:00 - 22:00 주말 13:00 - 23:00 수요일 휴무 \n 남/녀 화장실 구분"
            )
        )

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
