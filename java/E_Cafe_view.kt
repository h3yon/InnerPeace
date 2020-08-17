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
        
        val itemList2_1 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "셀렉토커피", "#남/녀 화장실 구분",
                "양천구청 \n 서울 양천구 목동동로 53 동문굿모닝탑Ⅰ \n 02-2062-1859" +
                        "\n 평일 09:00 - 22:30 주말 10:00 - 22:00 토요일 10:00 - 22:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "4 Lines Coffee", "#남/녀 화장실 구분 #장애인 편의시설",
                "신림 \n 서울 관악구 관천로 44 1층 101호 \n 070-8982-0109" +
                        "\n 매일 11:00 - 23:00 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "에버애프터", "#내부 #남녀공용 ",
                "신도림 \n 서울 구로구 새말로18길 36-10 지하 \n 070-7543-1098" +
                        "\n 평일 14:00 - 23:00 토요일 14:00 - 21:00 일요일 휴무 \n 내부 \n 남녀공용"
            ),
            Image(R.mipmap.ic_launcher,
                "데이즈앤데이즈", "#남/녀 화장실 구분",
                "구로디지털단지 \n 서울 관악구 시흥대로 578 광안빌딩 2층 \n 02-869-0077" +
                        "\n 매일 09:00 - 24:00 월요일 12:00 - 23:00 \n 남/녀 화장실 구분"
            )
        )
        val itemList2_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "오후의 과일", "#남녀공용 #내부",
                "서울대입구 \n 서울 관악구 관악로14길 15 \n 02-877-5700" +
                        "\n 매일 11:00 - 23:00 연중무휴 \n 남녀공용 \n 내부 \n 1칸"
            ),
            Image(R.mipmap.ic_launcher,
                "황홀경", "#남녀공용 #내부",
                "서울대입구 \n 서울 관악구 관악로14길 37 B1 황홀경 \n 02-6449-7362" +
                        "\n 매일 12:00 - 22:30  \n 남녀공용 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "헬무트커피", "#남녀공용 #내부",
                "사당 \n 서울 서초구 방배천로6길 3-10 헬무트커피 \n 070-7776-3748" +
                        "\n 매일 11:00 - 22:30 일요일은 30분 조기마감 \n 남녀공용 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "빌즈 강남 ", "#남/녀 화장실 구분 #장애인 편의시설",
                "역삼 \n 서울 강남구 테헤란로 142 아크플레이스 2층 \n 02-568-1353" +
                        "\n 매일 09:00 - 22:00 \n 남/녀 화장실 구분 \n #장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "세드라", "#남/녀 화장실 구분",
                "선릉 \n 서울 강남구 역삼로67길 15 \n 02-6349-7171" +
                        "\n 매일 11:30 - 18:00 월요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "시티갤러리카페", "#백화점 화장실",
                "강남 \n 서울 강남구 역삼로7길 22 \n 02-566-1743" +
                        "\n 평일 07:00 - 23:00 주말 09:00 23:00 일요일은 1시간 조기마감 \n 백화점 화장실"
            )

        )
        val itemList2_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "스템커피", "#남/녀 화장실 구분",
                "삼성 \n 서울 강남구 영동대로 513 지하 2층 \n 070-4880-2781" +
                        "\n 매일 11:30 - 21:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "에잇비돌체", "#남/녀 화장실 구분 #장애인 편의시설",
                "잠실 \n 서울 송파구 올림픽로 265 지하1층 잠실광장 5-1 \n 02-424-8822" +
                        "\n 매일 07:00 - 22:00 \n 남/녀 화장실 구분 \n 장애인 편의시설"
            ),
            Image(R.mipmap.ic_launcher,
                "킹스커피", "#남/녀 화장실 구분 #2칸",
                "건대입구 \n 서울 광진구 동일로22길 119 \n 02-6448-7266" +
                        "\n 매일 11:00 - 23:30 \n 남/녀 화장실 구분 \n 2칸 "
            ),
            Image(R.mipmap.ic_launcher,
                "daughter", "#남/녀 화장실 구분",
                "건대입구 \n 서울 광진구 아차산로31길 40 \n 02-464-0559" +
                        "\n 평일 12:00 - 23:30 주말 11:00 - 23:00 \n 남/녀 화장실 구분"
            )
        )
        val itemList2_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "갈십리", "#남/녀 화장실 구분",
                "왕십리 \n 서울 성동구 마조로 15-11 갈십리 \n 010-9034-3939" +
                        "\n 매일 11:00 - 23:00 연중무휴 휴일은 인스타 공지 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "uu coffee", "#남/녀 화장실 구분",
                "왕십리 \n 서울 성동구 마조로11길 7 \n 02-2298-9688" +
                        "\n 매일 11:00 - 23:59 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "호랑이", "#실외 #남녀공용 ",
                "을지로4가 \n 서울 중구 을지로 157 주 \n 02-2269-5880" +
                        "\n 매일 11:00 - 21:00 \n 실외 \n 남녀공용"
            ),
            Image(R.mipmap.ic_launcher,
                "아씨에뜨앤", "#내부 #남녀공용",
                "을지로3가 \n 서울 중구 을지로12길 29 4층 아씨에뜨앤 \n 02-2269-5859" +
                        "\n 매일 12:00 - 20:00 월요일 휴무, 일요일 18시까지 영업 \n 내부 \n 남녀공용"
            )
        )
        val itemList2_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "더하우스1932", "#남/녀 화장실 구분 #내부",
                "충정로 \n 서울 중구 만리재로35길 5 \n 02-365-1932" +
                        "\n 매일 10:00 - 22:00 일요일 11:00 - 19:00 \n 남/녀 화장실 구분 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "카페아늑", "#내부",
                "이대 \n 서울 서대문구 이화여대7길 27-4 \n 010-5393-7456" +
                        "\n 매일 11:00 - 22:00 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "작당모의", "#남녀공용 #내부",
                "홍대 \n 서울 마포구 동교로32길 19 2층 \n 070-8838-3815" +
                        "\n 매일 12:30 - 21:30 \n 남녀공용 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "팔오팔", "#남녀공용 #내부",
                "홍대 \n 서울 마포구 홍익로 3-30 \n 02-332-8580" +
                        "\n 매일 10:00 - 23:00 \n 남녀공용 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "키쉬미뇽", "#남녀공용 #내부",
                "합정 \n 서울 마포구 양화로6길 35 \n 02-333-3466" +
                        "\n 평일 09:30 - 00:00(주말01:00) \n 남/녀 화장실 구분 \n내부 \n1칸"
            ),
            Image(R.mipmap.ic_launcher,
                "카페드레이프", "#남/녀 화장실 구분 ",
                "영등포구청 \n 서울 영등포구 양산로 146 \n 02-6014-0608" +
                        "\n 매일 11:00 - 22:00 \n 남/녀 화장실 구분"
            )
        )
        
              val itemList4_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "물레", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 노해로81길 12-20 상계동 331-8 지하 1층\n 02-2091-1005\n " +
                        "일~목 11:00 - 00:00 금~토 11:00 - 01:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "감각", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로 77 상계동 337\n 070-7576-4177\n " +
                        "주말 11:00 - 23:00 평일 11:00 - 23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "폴드커피", "#남/녀 화장실 구분",
                "미아삼거리\n 서울 성북구 종암로 214-3 하월곡동 133\n 02-912-9946\n " +
                        "평일 11:00 - 22:00 토요일 11:00 - 22:00  일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "카페1976", "#남/녀 화장실 구분",
                "미아삼거리\n 서울 성북구 도봉로 1 길음동 22-1 1976\n 02-989-8613\n " +
                        "평일 08:00 - 22:00 토요일 09:00 - 22:00 일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "쌍문동커피", "#남/녀 화장실 구분",
                "쌍문역\n 서울 도봉구 도봉로116길 5 창동 658-49\n 010-7405-0707\n " +
                        "주말 11:00 - 23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "시드누아 노원본점", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로 84 상계동 341-5 큐비스트빌딩 1층 시드누아커피\n 02-938-9559\n " +
                        "매일 11:00 - 24:00 금,토 마감 01:00\n 남/녀 화장실 구분\n"

            )




        )


        val itemList4_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "제이히든하우스", "#남/녀 화장실 구분",
                "혜화역\n 서울 종로구 종로 269-4 종로6가 94\n 02-744-1915\n " +
                        "주말 13:00 - 19:00 평일 12:30 - 18:30\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "쁘디렌 대학로점", "#남/녀 화장실 구분",
                "혜화역\n 서울 종로구 동숭길 \n 02-766-0149\n " +
                        "매일 11:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "루틴", "#남/녀 화장실 구분",
                "성신여대역\n 서울 성북구 보문로34가길 6\n 02-6489-4589\n " +
                        "매일 11:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "숑디 인 오하라", "#남/녀 화장실 구분",
                "성신여대역\n 서울 성북구 보문로30길 80\n 010-9108-0232\n " +
                        "일요일 12:00 - 22:00 매일 12:00 - 23:00\n 남/녀 화장실 구분\n"

            )
        )


        val itemList4_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "적당", "#남/녀 화장실 구분",
                "명동역\n 서울 중구 을지로 29\n 070-7543-8928\n " +
                        "매일 10:00 - 21:30\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "커피한약방", "#남/녀 화장실 구분",
                "명동역\n 서울 중구 삼일대로12길 16-6\n 070-4148-4242\n " +
                        "토, 일 ,공휴일 11:00 - 21:00 평일 09:00 - 22:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "엔와이84.8", "#남/녀 화장실 구분",
                "숙대입구역\n 서울 용산구 한강대로 268\n 02-790-9103\n " +
                        "주말 10:00 - 21:00 평일 10:00 - 23:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "수진나의앞지마", "#남/녀 화장실 구분",
                "충무로역\n 서울 중구 퇴계로49길 24\n 02-2272-8007\n " +
                        "매일 07:00 - 22:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList4_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "인바이티드", "#남/녀 화장실 구분",
                "이수역\n 서울 용산구 한강대로52길 41\n 02-794-3332\n " +
                        "매일 11:00 - 21:00 월요일 휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "카페아뜰리에", "#남/녀 화장실 구분",
                "사당역\n 서울 서초구 방배천로4길 48\n 02-523-1312\n " +
                        "평일 11:10 - 23:00 주말 12:00 - 22:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "피클피클", "#남/녀 화장실 구분",
                "숙대입구역\n 서울 용산구 신흥로 95\n 02-2088-3702\n " +
                        "월~일요일 12:00 - 21:00, 토요일 12:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "뉴오리진 동부이촌점", "#남/녀 화장실 구분",
                "이촌역\n 서울 용산구 이촌로 208\n 02-6272-6527\n " +
                        "매일 09:00 - 22:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList4_5 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "파크프리베", "#남/녀 화장실 구분",
                "수락산역\n 경기 의정부시 동일로192번길 28-27\n 031-873-9200\n " +
                        "매일 10:00 - 23:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "오크힐커피", "#남/녀 화장실 구분",
                "수락산역\n 경기 의정부시 동일로150번길 114\n 031-877-3654\n " +
                        "매일 10:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "마이알레", "#남/녀 화장실 구분",
                "과천역\n 경기 과천시 삼부골3로 17\n 02-3445-1794\n " +
                        "월~일요일 12:00 - 21:00, 토요일 12:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "보메비체", "#남/녀 화장실 구분",
                "평촌역\n 경기 안양시 동안구 평촌대로 221\n 031-421-5479\n " +
                        "월요일 00:00 - 24:00 화~금요일 11:00 - 23:00 주말 11:00 - 23:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList4_6 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "우린", "#남/녀 화장실 구분",
                "안산역\n 경기 안산시 단원구 풍전로 37-9\n 031-495-6005\n " +
                        "평일 07:00 - 19:00 토요일 07:00 - 17:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "카페 에임", "#남/녀 화장실 구분",
                "중앙역\n 경기 안산시 단원구 고잔로 88\n 031-362-4915\n " +
                        "주말 11:00 - 22:00 평일 10:00 - 22:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "카페데이먼스", "#남/녀 화장실 구분",
                "중앙역\n 경기 안산시 단원구 이삭6길 2\n 010-7523-1901\n " +
                        "평일 10:30 - 22:30 주말 10:30 - 22:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "꽃담", "#남/녀 화장실 구분",
                "정왕역\n 경기 시흥시 중심상가4길 10\n 031-491-8870\n " +
                        "월~토요일 10:00 - 22:00 일요일:예약가능\n 남/녀 화장실 구분\n"

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
                        "매일 08:00 - 20:00 주말/공휴일은 새벽2:30까지\n 남/녀 화장실 구분\n"

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
        
        val itemList6_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "봉화산커피","#남/녀 화장실 구분",
                "봉화산\n 서울 중랑구 신내로 225 디아뜨갤러리\n 010-8961-3285\n" +
                        "매일 08:00 - 23:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "키웨스트커피 화랑대역점","#남/녀 화장실 구분",
                "화랑대\n 서울 노원구 노원로1길 67 대덕프라자\n 02-977-6055\n" +
                        "매일 08:30~00:00 연중무휴\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "달보드레카페","#남/녀 화장실 구분",
                "화랑대\n 서울 중랑구 신내로25가길 2 달보드레카페\n 010-5446-3740\n" +
                        "정보없음\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "카페드미셸","#남/녀 화장실 구분",
                "태릉입구\n 서울 노원구 화랑로 441 미라쉘 1,2층\n 02-971-1100\n" +
                        " 매일 10:00 - 23:30\n 남/녀 화장실 구분"
            )
        )
        val itemList6_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "셀렉토커피 돌곶이역스타점","#남/녀 화장실 구분",
                "돌곶이\n 서울 성북구 화랑로 248 장위뉴타워 1층\n 010-2474-4292\n" +
                        " 토요일 08:30~23:00 연중무휴\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "랭스터디카페","#남/녀 화장실 구분",
                "안암\n 서울 성북구 고려대로24길 55 3층\n 02-926-3001\n" +
                        " 매일 00:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "이디야 보문역점","#남/녀 화장실 구분",
                "보문\n 서울 성북구 보문로 111\n 02-928-0788\n" +
                        " 평일 08:00 - 24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "투썸플레이스\n","#남/녀 화장실 구분",
                "동묘앞\n 서울 종로구 종로 335 1층 투썸플레이스 동묘앞역점\n 02-741-8511\n " +
                        "매일 07:30~23:00\n 남/녀 화장실 구분"
            )


        )

        val itemList6_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "더피터커피","#남/녀 화장실 구분",
                "신당\n 서울 중구 퇴계로 411 더피터커피\n 010-2302-5026\n" +
                        " 토요일 11:00~21:30 일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "그라운드125","#남/녀 화장실 구분",
                "약수\n 서울 중구 동호로14길 7 비에스빌딩 2층\n 02-2252-1250\n" +
                        "평일 08:00 - 22:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "할리스커피","#남/녀 화장실 구분",
                "이태원\n 서울 용산구 이태원로 179 해밀톤관광호텔\n 02-749-8752\n" +
                        "매일 00:00~24:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "리틀파르크","#남/녀 화장실 구분",
                "효창공원앞\n 서울 용산구 효창원로64길 6 일진빌딩 1층\n 070-4115-5104\n" +
                        "평일 09:00~21:00 매주 화요일 휴무\n 남/녀 화장실 구분"
            )
        )

        val itemList6_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "오펠레","#남/녀 화장실 구분",
                "대흥\n 서울 마포구 독막로 291-5\n 02-707-2712\n" +
                        "평일 11:30~22:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "랑데자뷰 상수점","#남/녀 화장실 구분",
                "상수\n 서울 마포구 와우산로13길 49 랑데자뷰 상수점\n 070-4255-5656\n" +
                        "매일 12:00~23:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "헬로굿바이","#남/녀 화장실 구분",
                "합정\n 서울 마포구 동교로12길 41\n 02-336-3020\n" +
                        "매일 10:00~18:00\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "82년생 김민경","#남/녀 화장실 구분",
                "디지털미디어시티\n 서울 마포구 매봉산로 80 파크엠 1층 \n 02-308-1982\n " +
                        "평일 09:00~23:00\n 남/녀 화장실 구분"
            )
        )

        val itemList6_5 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "카페겸","#남/녀 화장실 구분",
                "증산\n 서울 서대문구 증가로 264 2층\n 02-375-1400\n "
                        + "매일 10:30~00:00 주문마감 23:30\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "커피오름","#남/녀 화장실 구분",
                "증산\n 서울 서대문구 증가로 264 2층\n 02-375-1400\n" +
                        "매일 10:30~00:00 주문마감 23:30\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "단고당","#남/녀 화장실 구분",
                "연신내\n 서울 은평구 연서로26길 3-17\n 02-6015-1985\n" +
                        "매일 11:00~23:30\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "카페라또","#남/녀 화장실 구분",
                "연신내\n 서울 은평구 통일로 708-8\n 02-384-5466\n" +
                        "토요일 10:00~21:30\n 남/녀 화장실 구분"
            )
        )
        
        val itemList8_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "tiili(틸리)","#외부",
                "천호\n 서울 강동구 천호옛12길 15 1층\n 010-6652-6066\n "
                        + "주말 12:00 - 21:00 평일 휴무는 인스타그램 참조 필요\n 외부"
            ),
            Image(
                R.mipmap.ic_launcher,
                "티에드","#남/녀 화장실 구분",
                "천호\n 서울 강동구 천호대로157길 52 2층, 3층\n 02-475-0011\n" +
                        "매일 11:30 - 01:00\n 남/녀 화장실 구분, 내부"
            ),
            Image(
                R.mipmap.ic_launcher,
                "피치그레이","#남/녀 화장실 구분",
                "석촌\n 서울 송파구 가락로21길 14-1 1층 피치그레이\n 02-412-2726\n" +
                        "매일 11:00 - 21:00 연중무휴\n 남/녀 화장실 구분, 외부"
            ),
            Image(
                R.mipmap.ic_launcher,
                "페이지","#남/녀 화장실 구분",
                "문정\n 서울 송파구 동남로4길 35 자양빌딩 101호\n 02-402-3702\n" +
                        "매일 10:00 - 22:30\n 남/녀 화장실 구분"
            )
        )

        val itemList8_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "TENNOTE","#남녀공용",
                "복정\n 경기 성남시 수정구 위례서일로1길 21-10\n 031-721-2110\n "
                        + "매일 10:00 - 22:00\n 남녀공용, 내부"
            ),
            Image(
                R.mipmap.ic_launcher,
                "소녀다방","#남녀공용",
                "복정\n 경기 성남시 수정구 위례서일로3길 14-5 1층 소녀다방\n 정보없음\n" +
                        "매일 11:00 - 21:00 연중무휴\n 남녀공용, 내부"
            ),
            Image(
                R.mipmap.ic_launcher,
                "예나파이","#남/녀 화장실 구분 #장애인 편의시설",
                "신흥\n 경기 성남시 수정구 공원로 322 신동아파라디움\n 031-733-0419\n" +
                        "매일 08:00 - 22:00 일요일 휴무\n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "코지하우스","#남/녀 화장실 구분",
                "모란\n 경기 성남시 중원구 광명로 4 아트팰리스 상가 2층\n 031-757-3175\n" +
                        "매일 11:00 - 23:00(일요일 07:00)\n 남/녀 화장실 구분"
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
