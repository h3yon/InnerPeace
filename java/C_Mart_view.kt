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
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분",
                "동두천 \n 경기 동두천시 평화로2169번길 21 \n 031-830-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 민락로 195 \n 031-850-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "노브랜드", "#남/녀 화장실 구분",
                "덕정 \n 경기 양주시 화합로1402번길 9 \n 정보 없음" +
            "\n 매일 11:00~22:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분",
                "양주 \n 경기 양주시 평화로 1713 이마트 \n 031-860-0123" +
                        "\n 수요일 휴무 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "이문 \n 서울 동대문구 이문로 136 \n 02-959-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "월계 \n 서울 노원구 마들로3길 15 이마트월계점 \n 02-2092-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "창동 \n 서울 도봉구 노해로65길 4 창동E-MART \n 02-901-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분 #장애인편의시설",
                "청량리 \n 서울 동대문구 왕산로 214 \n 02-3298-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "노브랜드", "#남/녀 화장실 구분",
                "동대문 \n 서울 중구 장충단로 275 \n 02-2279-7943" +
                        "\n 매일 11:00~23:00 매월 2,4주 의무휴업 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "하모니마트", "#정보 없음 ",
                "종각역 \n 서울 종로구 인사동5길 38 1층 하모니마트 \n 02-739-5623" +
                        "\n 매일 08:00~24:00 \n 정보 없음"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스익스프레스", "#정보 없음",
                "동묘앞 \n 서울 종로구 종로 347 롯데캐슬 천지인 \n 02-743-8545" +
                        "\n 매일 10:00~24:00, 2,4번째 일요일 휴무 \n 정보 없음"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "청계천 \n 서울 중구 청계천로 400 이마트청계천점 \n 02-2290-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "용산 \n 서울 용산구 한강대로23길 55 이마트용산점 \n 02-2012-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데슈퍼", "#남/녀 화장실 구분",
                "원효로 \n 서울 용산구 백범로 341 리첸시아 용산B \n 02-711-5602" +
                        "\n 홈페이지 참조 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "영등포 \n 서울 영등포구 영중로 15 이마트영등포점 \n 02-3468-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "신도림 \n 서울 구로구 새말로 97 \n 02-6715-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "신도림 \n 서울 구로구 경인로 661 신도림1차푸르지오 \n 02-2618-2080" +
                        "\n 매일 10:00~24:00, 휴일은 홈페이지 참조 \n 남/녀 화장실 구분 \n 유아시설"
            )
        )

        val itemList1_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "부천 \n 경기 부천시 부천로 1-1 부천역지하도상가 \n 032-610-5123" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "중동 \n 경기 부천시 석천로 188 \n 032-718-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "부천 \n 경기 부천시 경인로 532 \n 032-610-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분",
                "송내 \n 서울 구로구 경인로 482 롯데마트구로점 \n 02-2639-2500" +
                        "\n 매일 10:00~23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "간석 \n 인천 남동구 경원대로 971 홈플러스간석점 \n 032-870-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트 동인천점", "#남/녀 화장실 구분 #장애인편의시설",
                "동인천 \n 인천 중구 인중로 134 \n 032-451-1234" +
                        "\n 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            )
        )

        val itemList1_6 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "홈플러스 금천점 ", "#남/녀 화장실 구분 #유아시설",
                "독산 \n 서울 금천구 시흥대로 391 삼성홈플러스 \n 02-890-8000" +
                        "\n 매일 10:00~24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스 시흥점", "#남/녀 화장실 구분",
                "금천구청 \n 서울 금천구 시흥대로 201 홈플러스시흥점 \n 02-895-2080" +
                        "\n 매일 10:00~24:00 휴일 홈페이지 참조 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #유아시설",
                "안양 \n 경기 안양시 동안구 관악대로 104 (주)리홈 안양이마트 \n 정보 없음 " +
                        "\n 매일 10:00~23:00 수요일 휴무 홈페이지 참조 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 권선구 세화로 134 롯데마트수원점 \n 031-8067-2500" +
                        "\n 매일 10:00~23:00 홈페이지 참조 \n 남/녀 화장실 구분"
            )
        )
        
        val itemList2_1 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "신도림 \n 서울 구로구 경인로 661 신도림1차푸르지오 \n 02-2618-2080" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "신도림 \n 서울 구로구 새말로 97 \n 02-6715-1234" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "구로 \n 서울 구로구 디지털로32길 43 이마트구로점 \n 02-2009-1212" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "하나로마트", "#남/녀 화장실 구분",
                "대림 \n 서울 구로구 도림로 90 \n 02-854-0376" +
                        "\n 평일 09:00 - 21:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList2_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분 #장애인편의시설",
                "서초 \n 서울 서초구 서초대로38길 12 \n 02-918-2500" +
                        "\n 매일 10:00 - 23:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "역삼 \n 서울 강남구 역삼로 310 이마트역삼점 \n 02-6908-1234" +
                        "\n 매일 10:00 - 23:30 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "GS수퍼마켓 낙성대점", "#정보 없음",
                "낙성대 \n 서울 관악구 봉천로 576 동아타운아파트 \n 02-2039-8215" +
                        "\n 홈페이지 참조 \n 정보 없음"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데슈퍼 남현점", "#남/녀 화장실 구분",
                "사당 \n 서울 관악구 남부순환로 2074 1층 \n 02-522-5603" +
                        "\n 홈페이지 참조 \n 정보 없음"
            )
        )

        val itemList2_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분",
                "잠실 \n 서울 송파구 올림픽로 240 \n 02-411-8025" +
                        "\n 매일 10:00 - 23:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분 #유아시설",
                "잠실 \n 서울 송파구 올림픽로35가길 16 홈플러스잠실점 \n 02-3468-8000" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데마트", "#남/녀 화장실 구분",
                "강변 \n 서울 광진구 광나루로56길 85 테크노마트 \n 02-3424-2500" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "건대입구 \n 서울 광진구 아차산로 272 이마트자양점 \n 02-2024-1234" +
                        "\n 일요일 휴무(홈페이지 참조) \n 남/녀 화장실 구분 \n 장애인편의시설 \n 중간규"
            )
        )

        val itemList2_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "노브랜드", "#남/녀 화장실 구분",
                "한양대 \n 서울 성동구 왕십리로 241 B1층 101호 \n 02-6454-6150" +
                        "\n 매일 10:30 - 21:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인편의시설",
                "왕십리 \n 서울 성동구 왕십리광장로 17 이마트왕십리점 \n 02-2200-1234" +
                        "\n 매일 10:00 - 23:30 둘째,넷째 일요일 휴무 \n 남/녀 화장실 구분 \n 장애인편의시설 \n 대규모"
            ),
            Image(R.mipmap.ic_launcher,
                "노브랜드", "#남/녀 화장실 구분",
                "동대문역사문화공원 \n 서울 중구 장충단로 275 \n 02-2279-7943" +
                        "\n 매일 11:00 - 23:00 둘째,넷째주 의무 휴업 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "롯데슈퍼", "#남/녀 화장실 구분",
                "왕십리 \n 서울 성동구 고산자로6길 40 레몬프라자 101, 102호 \n 02-2291-5601" +
                        "\n 정보 없음 \n 남/녀 화장실 구분 \n 중간규모"
            )
        )

        val itemList2_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "노브랜드", "#남/녀 화장실 구분",
                "신촌 \n 서울 서대문구 명물길 32 1층 \n 02-362-9560" +
                        "\n 매일 11:00 - 22:00 둘째,넷째주 의무 휴업 \n 정보 없음"
            ),
            Image(R.mipmap.ic_launcher,
                "이마트", "#남/녀 화장실 구분 #장애인 편의시설",
                "신촌 \n 서울 마포구 신촌로 94 그랜드플라자 \n 02-6288-1234" +
                        "\n 홈페이지 참조 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스", "#남/녀 화장실 구분",
                "합정 \n 서울 마포구 양화로 45 메세나폴리스 \n 02-6938-8800" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "홈플러스 영등포점", "#남/녀 화장실 구분 #유아시설",
                "문래 \n 서울 영등포구 당산로 42 홈플러스영등포점 \n 02-2165-8000" +
                        "\n 매일 10:00 - 24:00 \n 남/녀 화장실 구분 \n 유아시설"
            )
        )
        
         val itemList4_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 창동점", "#남/녀 화장실 구분 #장애인 편의시설",
                "창동역\n 서울 도봉구 노해로65길 4 창동E-MART\n 02-901-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 중계점", "#정보없음",
                "노원역\n 서울 노원구 노원로 330 롯데마트중계점\n 02-2092-2500\n " +
                        "매일 10:00 - 23:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "하나로마트 북서울농협본점", "#정보없음",
                "쌍문역\n 서울 도봉구 해등로 166\n 02-900-2101\n " +
                        "매일 09:00 - 21:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 삼양점", "#남/녀 화장실 구분",
                "미아역\n 서울 강북구 삼양로 247 삼양시장\n 02-2248-2500\n" +
                        "매일10:00 -23:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList4_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 서울역점", "#정보없음",
                "서울역\n 서울 중구 한강대로 405\n 02-390-2500\n " +
                        "매일 10:00 - 00:00 \n 정보없음\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 청계천점", "#남/녀 화장실 구분",
                "동대문역\n 서울 중구 청계천로 400 이마트청계천점\n 02-2290-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "하나로마트 서대문점", "#정보없음",
                "회현역\n 서울 중구 통일로 120\n 02-2080-6993\n " +
                        "평일 08:00 - 21:00 연중무휴\n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "하모니마트 남산점", "#정보없음",
                "회현역\n 서울 중구 퇴계로18길 30\n 02-771-2175\n" +
                        "매일 08:30 ~22:30\n 정보없음\n"

            )
        )

        val itemList4_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 용산점", "#남/녀 화장실 구분 #장애인 편의시설",
                "삼각지역\n 서울 용산구 한강대로23길 55 이마트용산점\n 02-2012-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 남현점", "#정보없음",
                "사당역\n 서울 관악구 과천대로 909 남현프라자\n 02-6948-8000\n " +
                        "매일 10:00 - 24:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 과천점", "#남/녀 화장실 구분 #장애인 편의시설",
                "과천역\n 경기 과천시 별양상가3로 11\n 02-6445-4123\n " +
                        "수요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 이수점", "#남/녀 화장실 구분 #장애인 편의시설",
                "이수역\n 서울 동작구 사당로 300 이수자이\n 02-595-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        
        
        

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
        
        val itemList6_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 목동점","#남/녀 화장실 구분 #장애인편의시설",
                "태릉입구\n 서울 중랑구 동일로 932 묵동자이2단지\n 02-2083-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스","#남/녀 화장실 구분",
                "신내\n 서울 중랑구 신내로 201 홈플러스서울신내점\n 02-2024-8000\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            )


        )
        val itemList6_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 월곡점\n","#남/녀 화장실 구분 #장애인편의시설",
                "월곡\n 서울 성북구 화랑로 76 홈플러스월곡점\n 02-3669-8000\n"
                        +"매일 10:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트","#남/녀 화장실 구분 #장애인편의시설",
                "동묘앞\t서울 중구 청계천로 400 이마트청계천점\t02-2290-1234\n" +
                         "일요일 휴무\n 남/녀 화장실 구분"
            )


        )

        val itemList6_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트","#남/녀 화장실 구분 #장애인편의시설",
                "공덕\n 서울 용산구 한강대로23길 55 이마트용산점\n 02-2012-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데프리미엄 푸드마켓","#남/녀 화장실 구분",
                "공덕\n 서울 마포구 마포대로 109\n 02-706-5601\n" +
                          "매일 10:00~23:00\n 남/녀 화장실 구분"
            )
        )

        val itemList6_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 합정점","#남/녀 화장실 구분",
                "합정\n 서울 마포구 양화로 45 메세나폴리스\n 02-6938-8800\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 월드컵점","#남/녀 화장실 구분 #장애인편의시설",
                "월드컵경기장\n 서울 마포구 월드컵로 240 월드컵주경기장\n 02-312-2080\n" +
                        "매일 10:00~24:00\n 남/녀 화장실 구분"
            )

        )

        val itemList6_5 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 ","#남/녀 화장실 구분 #장애인편의시설",
                "응암\n 서울 은평구 은평로 111 이마트은평점\n 02-380-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "킴스클럽nc백화점 ","#남/녀 화장실 구분 #장애인편의시설",
                "불광\n 서울 은평구 불광로 20\n 02-3417-2001\n" +
                        "정보없음\n 남/녀 화장실 구분"
            )
        )
        
        
        
        val itemList5_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 김포공항점", "#남/녀 화장실 구분",
                "김포공항\n 서울 강서구 하늘길 77 롯데백화점김포공항점 B2\n 02-6124-2500\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "킴스클럽 강서점", "#남/녀 화장실 구분",
                "발산\n 서울 강서구 강서로56길 17 NC백화점 강서점\n 02-2667-9149\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데슈퍼 우장산점", "#남/녀 화장실 구분",
                "우장산\n 서울 강서구 강서로 267 송화쇼핑센터\n 02-2064-5601\n " +
                        "매일 9:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스익스프레스 화곡점", "#정보없음",
                "화곡\n 서울 강서구 화곡로 153 광유빌딩\n 02-2065-8543\n" +
                        "매일 10:00~24:00\n 정보없음\n"

            )
        )

        val itemList5_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 목동점", "##남/녀 화장실 구분 #장애인 편의시설",
                "오목교\n 서울 양천구 오목로 299 이마트목동점\n 02-6923-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 양평점", "#남/녀 화장실 구분",
                "영등포구청\n 서울 영등포구 선유로 138\n 02-450-2500\n " +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 여의도점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "여의도\n 서울 양천구 오목로 299 이마트목동점\n 02-6923-1234\n " +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 마포공덕점", "#남/녀 화장실 구분 #장애인 편의시설",
                "공덕\n 서울 마포구 백범로 212 대우 월드마크마포\n 02-2197-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList5_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "하나로마트 서대문점", "#남/녀 화장실 구분",
                "서대문\n 서울 중구 통일로 120\n 02-2080-6993\n " +
                        "평일 8:00~21:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 익스프레스 광화문점", "#정보없음",
                "광화문\n 서울 종로구 새문안로 91 고려빌딩\n 02-737-9994\n " +
                        "매일 10:00~24:00\n 정보없음\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 행당역점", "#남/녀 화장실 구분",
                "행당\n 서울 성동구 행당로 84 행당 한진타운 종합상가\n 02-3395-2500\n" +
                        "매일 10:00~23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 왕십리점\n", "#남/녀 화장실 구분 #장애인 편의시설",
                "왕십리\n 서울 성동구 왕십리광장로 17 이마트왕십리점\n 02-2200-1234\n" +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            )
        )

        val itemList5_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 익스프레스 중곡점", "#정보없음",
                "군자\n 서울 광진구 능동로 314 공영빌딩\n 02-447-8545\n " +
                        "매일 10:00~24:00 2,4번째 일요일 휴무\n 정보없음\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트 천호점", "#남/녀 화장실 구분 #장애인 편의시설",
                "천호\n 서울 강동구 천호대로 1017 이마트천호점\n 02-2224-1234\n " +
                        "일요일 휴뮤\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "현대백화점 천호점", "#남/녀 화장실 구분",
                "천호\n 서울 강동구 천호대로 1005 현대백화점천호점\n 02-488-2233\n " +
                        "10:30~20:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스 익스프레스 거여점", "#정보없음",
                "거여\n 서울 송파구 오금로 512 거여역2차 쌍용아파트\n 02-3012-8545\n" +
                        "매일 10:00~24:00\n 정보없음\n"

            )
        )
        
        val itemList8_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "이마트 가든파이브점","#남/녀 화장실 구분 #장애인편의시설",
                "장지\n 서울 송파구 충민로 10 가든파이브툴\n 02-411-1235\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "롯데마트 잠실점","#남/녀 화장실 구분",
                "잠실\n 서울 송파구 올림픽로 240\n 02-411-8025\n" +
                        "매일 10:00 - 23:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "홈플러스","#남/녀 화장실 구분 #유아시설",
                "잠실\n 서울 송파구 올림픽로35가길 16 홈플러스잠실점\n 02-3468-8000\n" +
                        "매일 10:00 - 24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이마트","#남/녀 화장실 구분 #장애인 편의시설",
                "천호\n 서울 강동구 천호대로 1017 이마트천호점\n 02-2224-1234\n" +
                        "일요일 휴무\n 남/녀 화장실 구분"
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
