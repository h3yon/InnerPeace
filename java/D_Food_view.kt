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
        
        val itemList1_1 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "소요산신흥", "#남/녀 화장실 구분",
                "소요산 \n 경기 동두천시 평화로2910번길 57 \n 031-865-1106" +
                        "\n 매일 10:00 - 21:00연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "경양카츠", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 평화로 553 \n 031-848-7169" +
                        "\n 매일 11:30 - 21:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "카페 아를", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 동일로 204 \n 031-837-1717" +
                        "\n 매일 10:00 - 24:00연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "아리랑갈비", "#남/녀 화장실 구분",
                "동두천 \n 경기 동두천시 평화로2261번길 36 \n 031-868-2435" +
                        "\n 매일 10:00 - 22:30연중무휴 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "메이다이닝", "#남/녀 화장실 구분",
                "도봉 \n 서울 도봉구 도봉로169길 208 \n 02-955-7722" +
                        "\n 매일 11:30 - 22:00연중무휴 \n 남/녀 화장실 구분 \n 유아시설(놀이방)"
            ),
            Image(R.mipmap.ic_launcher,
                "쿠우쿠우", "#남/녀 화장실 구분",
                "덕계 \n 경기 양주시 평화로 1440 \n 031-866-6274" +
                        "\n 매일 11:00 - 22:00매주 화요일 휴무 \n 남/녀 화장실 구분 \n 유아시설(놀이방), 장애인 편의시설"
            )
        )

        val itemList1_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "김가네김밥", "#남/녀 화장실 구분",
                "광운대 \n 서울 노원구 광운로 20 \n 02-941-7446" +
                        "\n 평일 09:00 - 20:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "애슐리퀸즈", "#남/녀 화장실 구분",
                "월계 \n 서울 노원구 마들로3길 15 \n 02-6408-1031" +
                        "\n 매일 11:00 - 21:30매달 둘째, 넷째주 일요일 휴무, 샐러드바 마감 21시 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "롤링파스타", "#남/녀 화장실 구분",
                "월계 \n 서울 노원구 마들로3길 15 \n 02-975-8933" +
                        "\n 02-975-8933 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "홍곱창", "#외부 #남/녀 화장실 구분",
                "회기 \n 서울 동대문구 회기로25길 60 \n 02-3295-1187" +
                        "\n 매일 14:00 - 23:30 일요일 휴무 \n 외부 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "본고향맛집", "#남/녀 화장실 구분",
                "동묘앞 \n 서울 종로구 지봉로 16 동암빌딩 \n 02-2234-3392" +
                        "\n 매일 00:00 - 24:00연중무휴 월요일 00:00~10:00까지 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "박가네 빈대떡", "#남/녀 화장실 구분",
                "종로5가 \n 서울 종로구 종로32길 7 \n 02-2264-0847" +
                        "\n 매일 08:00 - 22:30 연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "미도인", "#남/녀 화장실 구분",
                "종각 \n 서울 종로구 종로 51 종로타워 지하2층 미도인 \n 02-720-5097" +
                        "\n 매일 11:30 - 21:30매달 재료소진시 조기마감 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "바비레드", "#남/녀 화장실 구분",
                "종각 \n 서울 종로구 종로 51 종로타워 지하 2층 211호 \n 02-736-1517" +
                        "\n 매일 11:30 - 22:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "만족오향족발", "#남/녀 화장실 구분",
                "시청 \n 서울 중구 서소문로 134-7 \n 02-753-4755" +
                        "\n 02-753-4755 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "더미 ", "#남/녀 화장실 구분 #장애인 편의시설",
                "시청 \n 서울 중구 남대문로9길 40 센터플레이스 3층 더미 \n 02-319-5551" +
                        "\n 평일 11:30 - 22:00 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "유즈라멘", "#남/녀 화장실 구분",
                "서울 \n 서울 중구 만리재로 217 \n 070-4177-0365" +
                        "\n 매일 11:00 - 21:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "스카이 비치", "#남/녀 화장실 구분",
                "용산 \n 서울 용산구 청파로20길 95 스카이킹덤 34F 스카이비치 \n 02-2223-7970" +
                        "\n 매일 18:00 - 22:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "노량해전", "#남/녀 화장실 구분 #장애인 편의시설",
                "노량진 \n 서울 동작구 노들로 674 노량진수산시장신건물1층 남1문좌측 활어2호3호4호 \n 010-8300-0225" +
                        "\n 매일 09:00(주말은08:00) - 24:00연중무휴 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            )
        )

        val itemList1_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "구로역포장마차", "#남/녀 화장실 구분",
                "구로 \n 서울 구로구 새말로 17 3층 구로역포장마차 \n 02-855-1714" +
                        "\n 매일 16:00 - 04:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "밤새먹소", "#남/녀 화장실 구분",
                "구로 \n 서울 구로구 경인로 572 구로동스타팰리스 1층 113-117호 \n 02-2068-7637" +
                        "\n 매일 11:00 - 23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "부즈인부스", "#남/녀 화장실 구분",
                "부천 \n 경기 부천시 부천로39번길 37 1층 부즈인부스 \n 070-8778-8570" +
                        "\n 매일 12:00 - 22:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "감성철판 믹스그리들", "#남/녀 화장실 구분",
                "부천 \n 경기 부천시 부천로3번길 48 피노키오상가 4층 438호 \n 010-7136-6731" +
                        "\n 평일 17:00 - 00:30, 주말 17:00 - 02:00, 월요일 휴무 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_6 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "휄리스", "#남/녀 화장실 구분",
                "인천 \n 인천 중구 홍예문로 56 \n 032-777-6992" +
                        "\n 화요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "루스트플레이스 숭의점", "#남/녀 화장실 구분",
                "도원 \n 인천 미추홀구 석정로 51 홈플러스 숭의점 식품코너 B2층 루스트 플레이스 \n 032-881-9004" +
                        "\n 매일 10:00 - 22:00둘째, 넷째주 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "뚝배기이탈리아", "#건물 내부",
                "부평 \n 인천 부평구 광장로4번길 11 5층 \n 032-505-5330" +
                        "\n 매일 11:00 - 22:00 \n 건물 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "534라비아", "#남/녀 화장실 구분",
                "부평 \n 인천 부평구 광장로4번길 8 \n 032-529-2756" +
                        "\n 매일 17:00 - 22:00 매주 월요일 휴무 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_7 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "투뿔205", "#남/녀 화장실 구분",
                "가산디지털단지 \n 서울 금천구 디지털로9길 99 스타밸리 1층 \n 02-858-9816" +
                        "\n 매일 10:30 - 22:30 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "육감만족", "#남/녀 화장실 구분",
                "가산디지털단지 \n 서울 금천구 가산디지털1로 168 우림라이온스밸리 A동 2층 216호 \n 02-2026-4545" +
                        "\n 평일 12:00 - 22:30 주말 12:00 - 21:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "낙원타코", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 권선구 세화로 134 \n 031-8066-1890" +
                        "\n 매일 10:30 - 22:00 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "육풍", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 팔달구 향교로 40 \n 031-207-6333" +
                        "\n 매일 11:30 - 01:00 \n 남/녀 화장실 구분"
            )
        )

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

