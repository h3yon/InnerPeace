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
        
               
         val itemList1_1 = listOf<Image>(
            Image(
                R.mipmap.one_1_1_mart,
                "롯데마트", "#남/녀 화장실 구분",
                "동두천 \n 경기 동두천시 평화로2169번길 21 \n 031-830-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_1_2_mart,
                "홈플러스", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 민락로 195 \n 031-850-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_1_3_mart,
                "노브랜드", "#남/녀 화장실 구분",
                "덕정 \n 경기 양주시 화합로1402번길 9 \n 정보 없음" +
                        "\n 매일 11:00~22:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_1_4_mart,
                "이마트", "#남/녀 화장실 구분",
                "양주 \n 경기 양주시 평화로 1713 이마트 \n 031-860-0123" +
                        "\n 수요일 휴무 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_2 = listOf<Image>(
            Image(
                R.mipmap.one_2_1_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "이문 \n 서울 동대문구 이문로 136 \n 02-959-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_2_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "월계 \n 서울 노원구 마들로3길 15 이마트월계점 \n 02-2092-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_2_3_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "창동 \n 서울 도봉구 노해로65길 4 창동E-MART \n 02-901-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_2_4_mart,
                "롯데마트", "#남/녀 화장실 구분 #장애인편의시설",
                "청량리 \n 서울 동대문구 왕산로 214 \n 02-3298-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_3 = listOf<Image>(
            Image(
                R.mipmap.one_3_1_mart,
                "노브랜드", "#남/녀 화장실 구분",
                "동대문 \n 서울 중구 장충단로 275 \n 02-2279-7943" +
                        "\n 매일 11:00~23:00 매월 2,4주 의무휴업 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_3_2_mart,
                "하모니마트", "#정보 없음 ",
                "종각 \n 서울 종로구 인사동5길 38 1층 하모니마트 \n 02-739-5623" +
                        "\n 매일 08:00~24:00 \n 정보 없음"
            ),
            Image(
                R.mipmap.one_3_3_mart,
                "홈플러스익스프레스", "#정보 없음",
                "동묘앞 \n 서울 종로구 종로 347 롯데캐슬 천지인 \n 02-743-8545" +
                        "\n 매일 10:00~24:00, 2,4번째 일요일 휴무 \n 정보 없음"
            ),
            Image(
                R.mipmap.one_3_4_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "청계천 \n 서울 중구 청계천로 400 이마트청계천점 \n 02-2290-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_4 = listOf<Image>(
            Image(
                R.mipmap.one_4_1_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "용산 \n 서울 용산구 한강대로23길 55 이마트용산점 \n 02-2012-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_4_2_mart,
                "롯데슈퍼", "#남/녀 화장실 구분",
                "원효로 \n 서울 용산구 백범로 341 리첸시아 용산B \n 02-711-5602" +
                        "\n 홈페이지 참조 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_4_3_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "영등포 \n 서울 영등포구 영중로 15 이마트영등포점 \n 02-3468-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_4_4_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "신도림 \n 서울 구로구 새말로 97 \n 02-6715-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_4_5_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "신도림 \n 서울 구로구 경인로 661 신도림1차푸르지오 \n 02-2618-2080" +
                        "\n 매일 10:00~24:00, 휴일은 홈페이지 참조 \n 남/녀 화장실 구분 \n 유아시설"
            )
        )

        val itemList1_5 = listOf<Image>(
            Image(
                R.mipmap.one_5_1_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "부천 \n 경기 부천시 부천로 1-1 부천역지하도상가 \n 032-610-5123" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_5_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "중동 \n 경기 부천시 석천로 188 \n 032-718-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.one_5_3_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "부천 \n 경기 부천시 경인로 532 \n 032-610-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.one_5_4_mart,
                "롯데마트", "#남/녀 화장실 구분",
                "송내 \n 서울 구로구 경인로 482 롯데마트구로점 \n 02-2639-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_5_5_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "간석 \n 인천 남동구 경원대로 971 홈플러스간석점 \n 032-870-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.one_5_6_mart,
                "이마트 동인천점", "#남/녀 화장실 구분 #장애인편의시설",
                "동인천 \n 인천 중구 인중로 134 \n 032-451-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_6 = listOf<Image>(
            Image(
                R.mipmap.one_6_1_mart,
                "홈플러스 금천점 ", "#남/녀 화장실 구분 #유아시설",
                "독산 \n 서울 금천구 시흥대로 391 삼성홈플러스 \n 02-890-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.one_6_2_mart,
                "홈플러스 시흥점", "#남/녀 화장실 구분",
                "금천구청 \n 서울 금천구 시흥대로 201 홈플러스시흥점 \n 02-895-2080" +
                        "\n 매일 10:00~24:00 휴일 홈페이지 참조 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.one_6_3_mart,
                "이마트", "#남/녀 화장실 구분 #유아시설",
                "안양 \n 경기 안양시 동안구 관악대로 104 (주)리홈 안양이마트 \n 정보 없음 " +
                        "\n 매일 10:00~23:00 수요일 휴무 홈페이지 참조 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.one_6_4_mart,
                "롯데마트", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 권선구 세화로 134 롯데마트수원점 \n 031-8067-2500" +
                        "\n 매일 10:00~23:00 홈페이지 참조 \n 남/녀 화장실 구분"
            )
        )

        val itemList2_1 = listOf<Image>(
            Image(
                R.mipmap.two_1_1_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "신도림 \n 서울 구로구 경인로 661 신도림1차푸르지오 \n 02-2618-2080" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.two_1_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "신도림 \n 서울 구로구 새말로 97 \n 02-6715-1234" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.two_1_3_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "구로 \n 서울 구로구 디지털로32길 43 이마트구로점 \n 02-2009-1212" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.two_1_4_mart,
                "하나로마트", "#남/녀 화장실 구분",
                "대림 \n 서울 구로구 도림로 90 \n 02-854-0376" +
                        "\n 평일 09:00 - 21:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList2_2 = listOf<Image>(
            Image(
                R.mipmap.two_2_1_mart,
                "롯데마트", "#남/녀 화장실 구분 #장애인편의시설",
                "서초 \n 서울 서초구 서초대로38길 12 \n 02-918-2500" +
                        "\n 매일 10:00 - 23:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.two_2_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "역삼 \n 서울 강남구 역삼로 310 이마트역삼점 \n 02-6908-1234" +
                        "\n 매일 10:00 - 23:30 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(
                R.mipmap.two_2_3_mart,
                "GS수퍼마켓 낙성대점", "#정보 없음",
                "낙성대 \n 서울 관악구 봉천로 576 동아타운아파트 \n 02-2039-8215" +
                        "\n 홈페이지 참조 \n 정보 없음"
            ),
            Image(
                R.mipmap.two_2_4_mart,
                "롯데슈퍼 남현점", "#남/녀 화장실 구분",
                "사당 \n 서울 관악구 남부순환로 2074 1층 \n 02-522-5603" +
                        "\n 홈페이지 참조 \n 정보 없음"
            )
        )

        val itemList2_3 = listOf<Image>(
            Image(
                R.mipmap.two_3_1_mart,
                "롯데마트", "#남/녀 화장실 구분",
                "잠실 \n 서울 송파구 올림픽로 240 \n 02-411-8025" +
                        "\n 매일 10:00 - 23:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.two_3_2_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "잠실 \n 서울 송파구 올림픽로35가길 16 홈플러스잠실점 \n 02-3468-8000" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(
                R.mipmap.two_3_3_mart,
                "롯데마트", "#남/녀 화장실 구분",
                "강변 \n 서울 광진구 광나루로56길 85 테크노마트 \n 02-3424-2500" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.two_3_4_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "건대입구 \n 서울 광진구 아차산로 272 이마트자양점 \n 02-2024-1234" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설 \n 중간규"
            )
        )

        val itemList2_4 = listOf<Image>(
            Image(
                R.mipmap.two_4_1_mart,
                "노브랜드", "#남/녀 화장실 구분",
                "한양대 \n 서울 성동구 왕십리로 241 B1층 101호 \n 02-6454-6150" +
                        "\n 매일 10:30 - 21:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.two_4_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "왕십리 \n 서울 성동구 왕십리광장로 17 이마트왕십리점 \n 02-2200-1234" +
                        "\n 매일 10:00 - 23:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설 \n 대규모"
            ),
            Image(
                R.mipmap.two_4_3_mart,
                "노브랜드", "#남/녀 화장실 구분",
                "동대문역사문화공원 \n 서울 중구 장충단로 275 \n 02-2279-7943" +
                        "\n 매일 11:00 - 23:00 둘째,넷째주 의무 휴업 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.two_4_4_mart,
                "롯데슈퍼", "#남/녀 화장실 구분",
                "왕십리 \n 서울 성동구 고산자로6길 40 레몬프라자 101, 102호 \n 02-2291-5601" +
                        "\n 정보 없음 \n 남/녀 화장실 구분 \n 중간규모"
            )
        )

        val itemList2_5 = listOf<Image>(
            Image(
                R.mipmap.two_5_1_mart,
                "노브랜드", "#남/녀 화장실 구분",
                "신촌 \n 서울 서대문구 명물길 32 1층 \n 02-362-9560" +
                        "\n 매일 11:00 - 22:00 둘째,넷째주 의무 휴업 \n 정보 없음"
            ),
            Image(
                R.mipmap.two_5_2_mart,
                "이마트", "#남/녀 화장실 구분 #장애인 편의시설",
                "신촌 \n 서울 마포구 신촌로 94 그랜드플라자 \n 02-6288-1234" +
                        "\n 홈페이지 참조 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(
                R.mipmap.two_5_3_mart,
                "홈플러스", "#남/녀 화장실 구분",
                "합정 \n 서울 마포구 양화로 45 메세나폴리스 \n 02-6938-8800" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.two_5_4_mart,
                "홈플러스 영등포점", "#남/녀 화장실 구분 #유아시설",
                "문래 \n 서울 영등포구 당산로 42 홈플러스영등포점 \n 02-2165-8000" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            )
        )

        val itemList3_1 = listOf<Image>(
            Image(
                R.mipmap.three_1_1_mart,
                "롯데마트 주엽점",
                "#남/녀 화장실 구분",
                "대화 \n 경기 고양시 일산서구 중앙로 1496 문촌마을" +
                        "\n 031-913-2500 \n  매일 10:00~23:00" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_1_2_mart,
                "홈플러스 일산점",
                "#남/녀 화장실 구분",
                "정발산 \n 경기 고양시 일산동구 중앙로1275번길 64 홈플러스 일산점" +
                        "\n 031-925-2080 \n 매일 10:00~24:00" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_1_3_mart,
                "롯데마트 은평점",
                "#남/녀 화장실 구분",
                "구파발 \n 서울 은평구 통일로 1050 롯데몰 은평점" +
                        "\n 02-2097-2500 \n 매일 10:00~24:00" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_1_4_mart,
                "킴스클럽 nc백화점 불광점",
                "#남/녀 화장실 구분",
                "불광 \n 서울 은평구 불광로 20" +
                        "\n 02-3417-2001 \n 월-목 오전10:30-오후9:00 금-일 오전10:30-오후10:00" +
                        "\n 남/녀 화장실 구분"
            )
        )

        val itemList3_2 = listOf<Image>(
            Image(
                R.mipmap.three_2_1_mart,
                "롯데백화점 본점",
                "#남/녀 화장실 구분",
                "경복궁 \n 서울 중구 남대문로 81" +
                        "\n 02-771-2500 \n 매일 10:30~20:00 (연장시 20:30)" +
                        "\n 남/녀 화장실 구분"
            )
        )

        val itemList3_3 = listOf<Image>(
            Image(
                R.mipmap.three_2_2_mart,
                "신세계백화점 본점",
                "#남/녀 화장실 구분",
                "종로3가 \n 서울 중구 소공로 63 신세계백화점본점" +
                        "\n 1588-1234 \n 매일 10:30~20:00 (연장시 20:30)" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_2_3_mart,
                "롯데슈퍼 신당점",
                "#남/녀 화장실 구분",
                "충무로 \n 서울 중구 다산로 56 남산정은스카이아파트" +
                        "\n 02-2232-5602 \n 매일 10:00~23:00 일요일 휴무" +
                        "\n 남/녀 화장실 구분"
            )
        )

        val itemList3_4 = listOf<Image>(
            Image(
                R.mipmap.three_3_1_mart,
                "현대백화점 압구정본점",
                "#남/녀 화장실 구분",
                "압구정 \n 서울 강남구 압구정로 165 현대백화점압구정본점" +
                        "\n 02-547-2233 \n 매일 10:30~20:00 (연장시 20:30)" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_3_2_mart,
                "킴스클럽 강남점",
                "#남/녀 화장실 구분",
                "잠원 \n 서울 서초구 잠원로 69 킴스클럽" +
                        "\n 02-530-5752 \n 매일 8:00~24:00 매월 둘째 넷째 일요일 휴무" +
                        "\n 남/녀 화장실 구분"
            )
        )

        val itemList3_5 = listOf<Image>(
            Image(
                R.mipmap.three_4_1_mart,
                "롯데마트 서초점",
                "#남/녀 화장실 구분",
                "교대 \n 서울 서초구 서초대로38길 12" +
                        "\n 02-918-2500 \n 매일 10:00~23:30 매월 둘째 넷째 일요일 휴무" +
                        "\n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(
                R.mipmap.three_4_2_mart,
                "롯데백화점 강남점",
                "#남/녀 화장실 구분",
                "도곡 \n 서울 강남구 도곡로 401 롯데백화점" +
                        "\n 02-531-2500 \n 매일 10:30~20:00" +
                        "\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.three_4_3_mart,
                "이마트 수서점",
                "#남/녀 화장실 구분",
                "수서 \n 서울 강남구 광평로 280 로즈데일빌딩" +
                        "\n 02-451-6123 \n 매일 10:00~23:00 일요일 휴무" +
                        "\n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(
                R.mipmap.three_4_4_mart,
                "롯데마트 송파점",
                "#남/녀 화장실 구분",
                "가락시장 \n 서울 송파구 중대로 80 롯데마트송파점" +
                        "\n 02-2295-2500 \n 매일 10:00~23:00" +
                        "\n 남/녀 화장실 구분"
            )
        )

        val itemList4_1 = listOf<Image>(
            Image(
                R.mipmap.four_1_1_mart,
                "이마트 창동점", "#남/녀 화장실 구분 #장애인 편의시설",
                "창동\n 서울 도봉구 노해로65길 4 창동E-MART\n 02-901-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.four_1_2_mart,
                "롯데마트 중계점", "#정보없음",
                "노원\n 서울 노원구 노원로 330 롯데마트중계점\n 02-2092-2500\n " +
                        "매일 10:00 - 23:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.four_1_3_mart,
                "하나로마트 북서울농협본점", "#정보없음",
                "쌍문\n 서울 도봉구 해등로 166\n 02-900-2101\n " +
                        "매일 09:00 - 21:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.four_1_4_mart,
                "롯데마트 삼양점", "#남/녀 화장실 구분",
                "미아\n 서울 강북구 삼양로 247 삼양시장\n 02-2248-2500\n" +
                        "매일10:00 -23:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList4_2 = listOf<Image>(
            Image(
                R.mipmap.four_2_1_mart,
                "롯데마트 서울역점", "#정보없음",
                "서울역\n 서울 중구 한강대로 405\n 02-390-2500\n " +
                        "매일 10:00 - 00:00 \n 정보없음\n"
            ),
            Image(
                R.mipmap.four_2_2_mart,
                "이마트 청계천점", "#남/녀 화장실 구분",
                "동대문\n 서울 중구 청계천로 400 이마트청계천점\n 02-2290-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.four_2_3_mart,
                "하나로마트 서대문점", "#정보없음",
                "회현\n 서울 중구 통일로 120\n 02-2080-6993\n " +
                        "평일 08:00 - 21:00 연중무휴\n 정보없음\n"

            ),
            Image(
                R.mipmap.four_2_4_mart,
                "하모니마트 남산점", "#정보없음",
                "회현\n 서울 중구 퇴계로18길 30\n 02-771-2175\n" +
                        "매일 08:30 ~22:30\n 정보없음\n"

            )
        )

        val itemList4_3 = listOf<Image>(
            Image(
                R.mipmap.four_3_1_mart,
                "이마트 용산점", "#남/녀 화장실 구분 #장애인 편의시설",
                "삼각지\n 서울 용산구 한강대로23길 55 이마트용산점\n 02-2012-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.four_3_2_mart,
                "홈플러스 남현점", "#정보없음",
                "사당\n 서울 관악구 과천대로 909 남현프라자\n 02-6948-8000\n " +
                        "매일 10:00 - 24:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.four_3_3_mart,
                "이마트 과천점", "#남/녀 화장실 구분 #장애인 편의시설",
                "과천\n 경기 과천시 별양상가3로 11\n 02-6445-4123\n " +
                        "수요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.four_3_4_mart,
                "이마트 이수점", "#남/녀 화장실 구분 #장애인 편의시설",
                "총신대입구(이수)\n 서울 동작구 사당로 300 이수자이\n 02-595-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList5_1 = listOf<Image>(
            Image(
                R.mipmap.five_1_1_mart,
                "롯데마트 김포공항점", "#남/녀 화장실 구분",
                "김포공항\n 서울 강서구 하늘길 77 롯데백화점김포공항점 B2\n 02-6124-2500\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.five_1_2_mart,
                "킴스클럽 강서점", "#남/녀 화장실 구분",
                "발산\n 서울 강서구 강서로56길 17 NC백화점 강서점\n 02-2667-9149\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.five_1_3_mart,
                "롯데슈퍼 우장산점", "#남/녀 화장실 구분",
                "우장산\n 서울 강서구 강서로 267 송화쇼핑센터\n 02-2064-5601\n " +
                        "매일 9:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.five_1_4_mart,
                "홈플러스익스프레스 화곡점", "#정보없음",
                "화곡\n 서울 강서구 화곡로 153 광유빌딩\n 02-2065-8543\n" +
                        "매일 10:00~24:00\n 정보없음\n"

            )
        )

        val itemList5_2 = listOf<Image>(
            Image(
                R.mipmap.five_2_1_mart,
                "이마트 목동점", "##남/녀 화장실 구분 #장애인 편의시설",
                "오목교\n 서울 양천구 오목로 299 이마트목동점\n 02-6923-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.five_2_2_mart,
                "롯데마트 양평점", "#남/녀 화장실 구분",
                "영등포구청\n 서울 영등포구 선유로 138\n 02-450-2500\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.five_2_3_mart,
                "이마트 여의도점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "여의도\n 서울 양천구 오목로 299 이마트목동점\n 02-6923-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.five_2_4_mart,
                "이마트 마포공덕점", "#남/녀 화장실 구분 #장애인 편의시설",
                "공덕\n 서울 마포구 백범로 212 대우 월드마크마포\n 02-2197-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList5_3 = listOf<Image>(
            Image(
                R.mipmap.five_3_1_mart,
                "하나로마트 서대문점", "#남/녀 화장실 구분",
                "서대문\n 서울 중구 통일로 120\n 02-2080-6993\n " +
                        "평일 8:00~21:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.five_3_2_mart,
                "홈플러스 익스프레스 광화문점", "#정보없음",
                "광화문\n 서울 종로구 새문안로 91 고려빌딩\n 02-737-9994\n " +
                        "매일 10:00~24:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.five_3_3_mart,
                "롯데마트 행당역점", "#남/녀 화장실 구분",
                "행당\n 서울 성동구 행당로 84 행당 한진타운 종합상가\n 02-3395-2500\n" +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.five_3_4_mart,
                "이마트 왕십리점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "왕십리\n 서울 성동구 왕십리광장로 17 이마트왕십리점\n 02-2200-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList5_4 = listOf<Image>(
            Image(
                R.mipmap.five_4_1_mart,
                "홈플러스 익스프레스 중곡점", "#정보없음",
                "군자\n 서울 광진구 능동로 314 공영빌딩\n 02-447-8545\n " +
                        "매일 10:00~24:00 2,4번째 일요일 휴무\n 정보없음\n"
            ),
            Image(
                R.mipmap.five_4_2_mart,
                "이마트 천호점", "#남/녀 화장실 구분 #장애인 편의시설",
                "천호\n 서울 강동구 천호대로 1017 이마트천호점\n 02-2224-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.five_4_3_mart,
                "현대백화점 천호점", "#남/녀 화장실 구분",
                "천호\n 서울 강동구 천호대로 1005 현대백화점천호점\n 02-488-2233\n " +
                        "10:30~20:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.five_4_4_mart,
                "홈플러스 익스프레스 거여점", "#정보없음",
                "거여\n 서울 송파구 오금로 512 거여역2차 쌍용아파트\n 02-3012-8545\n" +
                        "매일 10:00~24:00\n 정보없음\n"

            )
        )
        
        val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.seven_1_1_mart,
                "노브랜드 마리오아울렛점", "#남/녀 화장실 구분",
                "가산디지털단지\n 서울 금천구 벚꽃로 266\n 02-2067-2139\n " +
                        "평일 10:30~21:00, 매월 2,4째주 의무 휴업\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.seven_1_2_mart,
                "이마트메트로광명점", "#남/녀 화장실 구분 #장애인 편의시설",
                "광명사거리\n 경기 광명시 오리로 970\n 02-2676-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.seven_1_3_mart,
                "이마트 이수점", "#남/녀 화장실 구분 #장애인 편의시설",
                "총신대입구(이수)\n 서울 동작구 사당로 300 이수자이\n 02-595-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.seven_1_4_mart,
                "롯데마트 서초점", "#남/녀 화장실 구분 #장애인 편의시설",
                "내방\n 서울 서초구 서초대로38길 12\n 02-918-2500\n" +
                        "매일 10:00 - 23:30 매월 2, 4째주 일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.seven_2_1_mart,
                "노브랜드 강남터미널점", "#정보없음",
                "고속터미널\n 서울 서초구 신반포로 194 지하층 대형1호\n 02-537-8491\n " +
                        "매일 10:00 - 22:00 매월 2,4째주 일요일 휴뮤\n 정보없음\n"
            ),
            Image(
                R.mipmap.seven_2_2_mart,
                "이마트 자양점", "#남/녀 화장실 구분 #장애인 편의시설",
                "건대입구\n 서울 광진구 아차산로 272 이마트자양점\n 02-2024-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.seven_2_3_mart,
                "홈플러스 면목점\n", "#남/녀 화장실 구분 #유아시설",
                "면목\n 서울 중랑구 동일로 540\n 02-437-2080\n " +
                        "매일 10:00 - 24:00 \n 남/녀 화장실 구분\n 유아시설\n"

            ),
            Image(
                R.mipmap.seven_2_4_mart,
                "하나로마트 농협청담점", "#정보없음",
                "강남구청\n 서울 강남구 학동로 411\n 02-517-6642\n" +
                        "매일 09:00 - 21:00 \n 정보없음\n"

            )
        )
        
        val itemList6_1 = listOf<Image>(
            Image(
                R.mipmap.six_1_1_market,
                "이마트 목동점", "#남/녀 화장실 구분 #장애인편의시설",
                "태릉입구\n 서울 중랑구 동일로 932 묵동자이2단지\n 02-2083-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.six_1_2_market,
                "홈플러스", "#남/녀 화장실 구분",
                "신내\n 서울 중랑구 신내로 201 홈플러스서울신내점\n 02-2024-8000\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            )
        )
        
        val itemList6_2 = listOf<Image>(
            Image(
                R.mipmap.six_2_1_market,
                "홈플러스 월곡점\n", "#남/녀 화장실 구분 #장애인편의시설",
                "월곡\n 서울 성북구 화랑로 76 홈플러스월곡점\n 02-3669-8000\n"
                        + "매일 10:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.six_2_2_market,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "동묘앞\서울 중구 청계천로 400 이마트청계천점\t02-2290-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            )
        )

        val itemList6_3 = listOf<Image>(
            Image(
                R.mipmap.six_3_1_market,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "공덕\n 서울 용산구 한강대로23길 55 이마트용산점\n 02-2012-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.six_3_2_market,
                "롯데프리미엄 푸드마켓", "#남/녀 화장실 구분",
                "공덕\n 서울 마포구 마포대로 109\n 02-706-5601\n" +
                        "매일 10:00~23:00\n 남/녀 화장실 구분"
            )
        )

        val itemList6_4 = listOf<Image>(
            Image(
                R.mipmap.six_4_1_market,
                "홈플러스 합정점", "#남/녀 화장실 구분",
                "합정\n 서울 마포구 양화로 45 메세나폴리스\n 02-6938-8800\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.six_4_2_market,
                "홈플러스 월드컵점", "#남/녀 화장실 구분 #장애인편의시설",
                "월드컵경기장\n 서울 마포구 월드컵로 240 월드컵주경기장\n 02-312-2080\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            )
        )

        val itemList6_5 = listOf<Image>(
            Image(
                R.mipmap.six_5_1_market,
                "이마트 ", "#남/녀 화장실 구분 #장애인편의시설",
                "응암\n 서울 은평구 은평로 111 이마트은평점\n 02-380-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.six_5_2_market,
                "킴스클럽nc백화점 ", "#남/녀 화장실 구분 #장애인편의시설",
                "불광\n 서울 은평구 불광로 20\n 02-3417-2001\n" +
                        "정보없음\n 남/녀 화장실 구분"
            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.seven_3_1_mart,
                "코스트코코리아 상봉점", "#남/녀 화장실 구분",
                "상봉\n 서울 중랑구 망우로 336\n 1899-9900\n " +
                        "매일 10:00 - 22:00 \n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.seven_3_2_mart,
                "홈플러스 상봉점", "#정보없음",
                "상봉\n 서울 중랑구 망우로 353 홈플러스상봉점\n 02-6922-8100\n " +
                        "매일 10:00 - 24:00 \n 정보없음\n"

            ),
            Image(
                R.mipmap.seven_3_3_mart,
                "이마트 묵동점", "#남/녀 화장실 구분 #장애인 편의시설",
                "먹골\n 서울 중랑구 동일로 932 묵동자이2단지\n 02-2083-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.seven_3_4_mart,
                "이마트 월계점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "공릉\n 서울 노원구 마들로3길 15 이마트월계점\n 02-2092-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n" +
                        " 장애인 편의시설\n"

            )
        )


        val itemList8_1 = listOf<Image>(
            Image(
                R.mipmap.eight_1_1_mart,
                "이마트 가든파이브점", "#남/녀 화장실 구분 #장애인편의시설",
                "장지\n 서울 송파구 충민로 10 가든파이브툴\n 02-411-1235\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.eight_1_2_mart,
                "롯데마트 잠실점", "#남/녀 화장실 구분",
                "잠실\n 서울 송파구 올림픽로 240\n 02-411-8025\n" +
                        "매일 10:00 - 23:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.eight_1_3_mart,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "잠실\n 서울 송파구 올림픽로35가길 16 홈플러스잠실점\n 02-3468-8000\n" +
                        "매일 10:00 - 24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.eight_1_4_mart,
                "이마트", "#남/녀 화장실 구분 #장애인 편의시설",
                "천호\n 서울 강동구 천호대로 1017 이마트천호점\n 02-2224-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            )
        )
        
       
        val itemList9_1 = listOf<Image>(
            Image(
                R.mipmap.nine_1_1_mart,
                "롯데마트 김포공항점","#남/녀 화장실 구분",
                "김포공항\n 서울 강서구 하늘길 77 롯데백화점김포공항점 B2\n 02-6124-2500\n" +
                        "매일 10:00 - 23:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_1_2_mart,
                "노브랜드 강서마곡점","#정보없음",
                "마곡나루\n 서울 강서구 마곡서로 101\n 02-2667-0151\n" +
                        "매일 11:00 - 22:00 매주 2,4째주 일요일 휴무\n 정보없음"
            ),
            Image(
                R.mipmap.nine_1_3_mart,
                "이마트 가양점","#남/녀 화장실 구분 #장애인편의시설",
                "증미\n 서울 강서구 양천로 559 가양이마트\n 02-2101-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_1_4_mart,
                "홈플러스 가양점","#정보없음",
                "가양\n 서울 강서구 양천로 431 홈플러스가양점\n 02-2063-2080\n" +
                        "매일 10:00 - 24:00\n 정보없음"
            )


        )

        val itemList9_2 = listOf<Image>(
            Image(
                R.mipmap.nine_2_1_mart,
                "노브랜드 영등포여의도점","#남/녀 화장실 구분",
                "국회의사당\n 서울 영등포구 의사당대로 8 삼환까뮤빌딩 1층\n 02-786-7668\n" +
                        "매일 11:00 - 22:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_2_2_mart,
                "하나로마트 흑석점","#정보없음",
                "흑석\n 서울 동작구 서달로 150\n 02-813-7013\n" +
                        "매일 09:30 - 22:00\n 정보없음"
            ),
            Image(
                R.mipmap.nine_2_3_mart,
                "이마트 여의도점","#남/녀 화장실 구분 #장애인편의시설",
                "샛강\n 서울 영등포구 여의동로3길 10 여의도자이\n 02-2280-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_2_4_mart,
                "하나로마트 국회점","#정보없음",
                "국회의사당\n 서울 영등포구 의사당대로 1 (여의도동, 국회후생관 1층)\n 02-769-1882\n" +
                        "매일 09:00 - 19:00\n 정보없음"
            )


        )

        val itemList9_3 = listOf<Image>(
            Image(
                R.mipmap.nine_3_1_mart,
                "현대백화점 무역센터점","#남/녀 화장실 구분",
                "봉은사\n 서울 강남구 테헤란로 517\n 02-552-2233\n" +
                        "매일 10:30~20:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_3_2_mart,
                "노브랜드 강남터미널점","#정보없음",
                "고속터미널\n 서울 서초구 신반포로 194 지하층 대형1호\n 02-537-8491\n" +
                        "매일 10:00 - 22:00 매주 2,4째주 일요일 휴무\n 정보없음"
            ),
            Image(
                R.mipmap.nine_3_3_mart,
                "노브랜드 서울서초점","#남/녀 화장실 구분",
                "신논현\n 서울 서초구 서초대로73길 7\n 02-537-5827\n" +
                        "매일 11:00 - 22:00 매주 2,4째주 일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.nine_3_4_mart,
                "롯데마트 잠실점","#정보없음",
                "석촌고분\n 서울 송파구 올림픽로 240\n 02-411-8025\n" +
                        "매일 10:00 - 23:00\n 정보없음"
            )
        )
        
        var itemList = listOf<Image>()
        
         //      GPS_view에서의 사용자 입력 값을 inputString 변수에 전달받음
        val inputString = intent.getStringExtra("input")
        
        //1호선
        if (inputString == "소요산" || inputString == "동두천" || inputString == "보산"
            || inputString == "동두천중앙" || inputString == "지행" || inputString == "덕정"
            || inputString == "덕계" || inputString == "양주" || inputString == "녹양"
            || inputString == "가능" || inputString == "의정부" || inputString == "회룡"
            || inputString == "망월사" || inputString == "도봉산" || inputString == "도봉") {
            itemList = itemList1_1
        } else if (inputString == "방학" || inputString == "창동" || inputString == "녹천"
            || inputString == "월계" || inputString == "광운대" || inputString == "석계"
            || inputString == "신이문" || inputString == "외대앞" || inputString == "회기"
            || inputString == "청량리" || inputString == "제기동" || inputString == "신설동") {
            itemList = itemList1_2
        }
        else if (inputString == "동묘앞" || inputString == "동대문" || inputString == "종로5가"
            || inputString == "종로3가" || inputString == "종각") {
            itemList = itemList1_3
        }
        else if (inputString == "시청" || inputString == "서울역" || inputString == "남영"
            || inputString == "용산" || inputString == "노량진" || inputString == "대방"
            || inputString == "신길" || inputString == "영등포" || inputString == "신도림") {
            itemList = itemList1_4
        }
        else if (inputString == "구로" || inputString == "구일" || inputString == "개봉"
            || inputString == "오류동" || inputString == "온수" || inputString == "역곡"
            || inputString == "소사" || inputString == "부천" || inputString == "중동"
            || inputString == "송내" || inputString == "부개" || inputString == "부평"
            || inputString == "백운" || inputString == "동암" || inputString == "간석"
            || inputString == "주안" || inputString == "도화" || inputString == "제물포"
            || inputString == "도원" || inputString == "동인천" || inputString == "인천") {
            itemList = itemList1_5
        }
        else if (inputString == "가산디지털단지" || inputString == "독산" || inputString == "금천구청"
            || inputString == "광명" || inputString == "석수" || inputString == "관악"
            || inputString == "안양" || inputString == "명학" || inputString == "금정"
            || inputString == "군포" || inputString == "당정" || inputString == "의왕"
            || inputString == "성균관대" || inputString == "화서" || inputString == "수원"
            || inputString == "주안" || inputString == "도화" || inputString == "제물포"
            || inputString == "도원" || inputString == "세류" || inputString == "병점"
            || inputString == "서동탄" || inputString == "세류" || inputString == "병점"
            || inputString == "도원" || inputString == "세마" || inputString == "오산대"
            || inputString == "오산") {
            itemList = itemList1_6
        }
        
        //        2호선

        if (inputString == "까치산" || inputString == "신정네거리" || inputString == "양천구청" || inputString == "도림천"
            || inputString == "신도림" || inputString == "대림" || inputString == "구로디지털단지" || inputString == "신대방"
            || inputString == "신림"
        ) {
            itemList = itemList2_1
        } else if (inputString == "봉천" || inputString == "서울대입구" || inputString == "낙성대" || inputString == "사당"
            || inputString == "방배" || inputString == "서초" || inputString == "교대" || inputString == "강남"
            || inputString == "역삼" || inputString == "선릉"
        ) {
            itemList = itemList2_2
        } else if (inputString == "삼성" || inputString == "종합운동장" || inputString == "잠실새내" || inputString == "잠실"
            || inputString == "잠실나루" || inputString == "강변" || inputString == "구의" || inputString == "건대입구"
            || inputString == "성수" || inputString == "용답" || inputString == "신답" || inputString == "용두"
            || inputString == "신설동" || inputString == "뚝섬"
        ) {
            itemList = itemList2_3
        } else if (inputString == "한양대" || inputString == "왕십리" || inputString == "상왕십리" || inputString == "신당"
            || inputString == "동대문역사문화공원" || inputString == "을지로4가" || inputString == "을지로3가"
            || inputString == "을지로입구"
        ) {
            itemList = itemList2_4
        } else if (inputString == "시청" || inputString == "충정로" || inputString == "아현" || inputString == "이대"
            || inputString == "신촌" || inputString == "홍대입구" || inputString == "합정" || inputString == "당산"
            || inputString == "영등포구청" || inputString == "문래"
        ) {
            itemList = itemList2_5
        }

//        3호선

        if (inputString == "대화" || inputString == "주엽" || inputString == "정발산" || inputString == "마두"
            || inputString == "백석" || inputString == "대곡" || inputString == "화정" || inputString == "원당"
            || inputString == "원흥" || inputString == "삼송" || inputString == "지축" || inputString == "구파발"
            || inputString == "연신내" || inputString == "불광" || inputString == "녹번"
        ) {
            itemList = itemList3_1
        } else if (inputString == "홍제" || inputString == "무악재" || inputString == "독립문" || inputString == "경복궁" ||
            inputString == "안국"
        ) {
            itemList = itemList3_2
        } else if (inputString == "종로3가" || inputString == "을지로3가" || inputString == "충무로" ||
            inputString == "동대입구" || inputString == "약수"
        ) {
            itemList = itemList3_3
        } else if (inputString == "금호" || inputString == "옥수" || inputString == "압구정" ||
            inputString == "신사" || inputString == "잠원"
        ) {
            itemList = itemList3_4
        } else if (inputString == "고속터미널" || inputString == "교대" || inputString == "남부터미널" ||
            inputString == "양재" || inputString == "매봉" || inputString == "도곡" || inputString == "대치"
            || inputString == "학여울" || inputString == "대청" || inputString == "일원" || inputString == "수서"
            || inputString == "가락시장" || inputString == "경찰병원" || inputString == "오금"
        ) {
            itemList = itemList3_5
        }
        
        //4호선
        if(inputString =="당고개"|| inputString =="상계" ||inputString=="노원"
            ||inputString =="창동"||inputString =="쌍문"||inputString =="수유"||inputString =="미아"
            ||inputString =="미아사거리"){
            itemList = itemList4_1
        }
        else if(inputString =="길음"|| inputString =="성신여대입구"
            ||inputString=="한성대입구"||inputString =="혜화"
            ||inputString =="동대문"|| inputString =="동대문역사문화공원"
            ||inputString=="충무로"||inputString =="명동"||inputString =="회현"
            ||inputString =="서울역"||inputString =="숙대입구"){
            itemList = itemList4_2
        }
        else if(inputString =="삼각지"|| inputString =="신용산"
            ||inputString=="이촌"||inputString =="동작"
            || inputString =="총신대입구(이수)"|| inputString =="사당"
            ||inputString =="남태령"|| inputString =="선바위"
            ||inputString=="경마공원"||inputString =="대공원"
            || inputString =="대공원"|| inputString =="과천"
            ||inputString =="정부과천청사"||inputString =="인덕원"){
            itemList = itemList4_3
        } 
        
        
        //5호선
        if (inputString == "방화"|| inputString == "개화산"|| inputString == "김포공항"|| inputString == "송정"||
            inputString == "마곡"|| inputString == "발산"|| inputString == "우장산"|| inputString == "화곡"|| inputString == "까치산") {
            itemList = itemList5_1
        }
        else if (inputString == "신정"|| inputString == "목동"|| inputString == "오목교"|| inputString == "양평"||
            inputString == "영등포구청"|| inputString == "영등포시장"|| inputString == "신길"|| inputString == "여의도"||
            inputString == "여의나루샛강"|| inputString == "마포"|| inputString == "공덕") {
            itemList = itemList5_2
        }
        else if (inputString == "애오개"|| inputString == "충정로"|| inputString == "서대문"|| inputString == "광화문"||
            inputString == "종로3가"|| inputString == "을지로4가"|| inputString == "동대문역사문화공원"|| inputString == "청구"||
            inputString == "신금호"|| inputString == "행당"|| inputString == "왕십리") {
            itemList = itemList5_3
        }
        else if (inputString == "마장"|| inputString == "답십리"|| inputString == "장한평"|| inputString == "군자"||
            inputString == "아차산"|| inputString == "광나루"|| inputString == "천호"|| inputString == "강동"||
            inputString == "둔촌동"|| inputString == "올림픽공원"|| inputString == "방이"|| inputString == "오금"||
            inputString == "개롱"|| inputString == "거여"|| inputString == "마천") {
            itemList = itemList5_4
        }
        
//6호선        

        if(inputString =="신내"|| inputString =="봉화산" ||inputString=="화랑대"
            ||inputString =="태릉입구"||inputString =="석계"){
            itemList = itemList6_1
        }
        else if(inputString =="돌곶이"|| inputString =="상월곡" ||inputString=="월곡"
            ||inputString =="고려대"||inputString =="안암"||inputString =="보문"
            ||inputString =="창신"||inputString =="동묘앞"){
            itemList = itemList6_2
        }
        else if(inputString =="신당"|| inputString =="청구" ||inputString=="약수"
            ||inputString =="버티고개"||inputString =="한강진"||inputString =="이태원"
            ||inputString =="녹사평"||inputString =="삼각지"||inputString =="효창공원앞"
            ||inputString =="공덕"){
            itemList = itemList6_3
        }
        else if(inputString =="대흥"|| inputString =="광흥창" ||inputString=="성수"
            ||inputString =="합정"||inputString =="망원"||inputString =="마포구청"
            ||inputString =="월드컵경기장"||inputString =="디지털미디어시티"){
            itemList = itemList6_4
        }
        else if(inputString =="증산"|| inputString =="새절" ||inputString=="구산"
            ||inputString =="연신내"||inputString =="독바위"||inputString =="불광"
            ||inputString =="역촌"||inputString =="응암"){
            itemList = itemList6_5
        }




//7호선
        if(inputString =="천왕"|| inputString =="광명사거리" ||inputString=="가산디지털단지"
            ||inputString =="남구로"||inputString =="대림"||inputString =="신풍"||inputString =="보라매"
            ||inputString =="신대방 삼거리"||inputString =="장승배기"||inputString =="상도"||
            inputString =="숭실대 입구"||inputString =="남성"||
            inputString =="총신대입구(이수)"||inputString =="내방"){
            itemList = itemList7_1
        }
        else if(inputString =="고속터미널"
            ||inputString =="반포"||inputString =="논현"||inputString =="학동"||
            inputString =="강남구청"||inputString =="청담"||inputString =="뚝섬유원지"||inputString =="건대입구"||inputString =="어린이대공원"
            ||inputString =="군자"||inputString =="중곡"||inputString =="용마산"
            ||inputString =="사가정"||inputString =="면목"){
            itemList = itemList7_2
        }
        else if(inputString =="상봉"||inputString =="중화"||inputString =="먹골"
            ||inputString =="태릉입구"||inputString =="공릉"||inputString =="하계"
            ||inputString =="중계"||inputString =="노원"||inputString =="마들"
            ||inputString =="수락산"||inputString =="도봉산"||inputString =="장암"){
            itemList = itemList7_3
        }

//8호선
        if (inputString == "암사" || inputString == "천호" || inputString == "강동구청"
            || inputString == "몽촌포성" || inputString == "잠실" || inputString == "석촌"
            || inputString == "송파" || inputString == "가락시장" || inputString == "문정"
            || inputString == "장지" || inputString == "복정" || inputString == "산성"
            || inputString == "남한산성입구" || inputString == "단대오거리" || inputString == "신흥"
            || inputString == "수진" || inputString == "모란"
        ) {
            itemList = itemList8_1
        }

        //        9호선

        if (inputString == "개화" || inputString == "김포공항" || inputString == "공항시장" || inputString == "신방화"
            || inputString == "마곡나루" || inputString == "양천향교" || inputString == "가양" || inputString == "증미"
            || inputString == "등촌" || inputString == "염창" || inputString == "신목동" || inputString == "선유도"
            || inputString == "당산"
        ) {
            itemList = itemList9_1
        } else if (inputString == "국회의사당" || inputString == "여의도" || inputString == "샛강" ||
            inputString == "노량진" || inputString == "노들" || inputString == "흑석" || inputString == "동작"
            || inputString == "구반포" || inputString == "신반포"
        ) {
            itemList = itemList9_2
        } else if (inputString == "고속터미널" || inputString == "사평" || inputString == "신논현" ||
            inputString == "언주" || inputString == "선정릉" || inputString == "삼성중앙" || inputString == "봉은사"
            || inputString == "종합운동장" || inputString == "삼전" || inputString == "석촌고분" || inputString == "석촌" ||
            inputString == "송파나루" || inputString == "한성백제" || inputString == "올림픽공원" || inputString == "둔촌오륜"
            || inputString == "중앙보훈병원"
        ) {
            itemList = itemList9_3
        }
        
        
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
