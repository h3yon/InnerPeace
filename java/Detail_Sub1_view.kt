package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub1_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("1 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub1List = arrayListOf<String>()
        sub1List.add(("소요산(외부)"))
        sub1List.add(("동두천(외부)"))
        sub1List.add(("보산(외부)"))
        sub1List.add(("동두천 중앙(외부)"))
        sub1List.add(("지행(외부)"))
        sub1List.add(("덕정(외부)"))
        sub1List.add(("덕계(외부)"))
        sub1List.add(("양주(외부)"))
        sub1List.add(("녹양(외부)"))
        sub1List.add(("가능(외부)"))
        sub1List.add(("의정부(외부)"))
        sub1List.add(("회룡(외부)"))
        sub1List.add(("망월사(내외부)"))
        sub1List.add(("도봉산(외부)_1, 7"))
        sub1List.add(("도봉(내외부)"))
        sub1List.add(("방학(내부)"))
        sub1List.add(("창동(없음)_1, 4"))
        sub1List.add(("녹천(내부)"))
        sub1List.add(("월계(내외부)"))
        sub1List.add(("광운대(외부)"))
        sub1List.add(("석계(내부)_1, 6"))
        sub1List.add(("신이문(내외부)"))
        sub1List.add(("외대앞(내부)"))
        sub1List.add(("회기(외부)"))
        sub1List.add(("청량리(외부)"))
        sub1List.add(("제기동(외부)"))
        sub1List.add(("신설동(외부)_1, 2"))
        sub1List.add(("동묘앞(내외부)_1, 6"))
        sub1List.add(("동대문(외부)_1, 4"))
        sub1List.add(("종로 5가(외부)"))
        sub1List.add(("종로 3가(내외부)_1, 3, 5"))
        sub1List.add(("종각(외부)"))
        sub1List.add(("시청(외부)_1, 2"))
        sub1List.add(("서울역(외부)_1, 4"))
        sub1List.add(("남영(내부)"))
        sub1List.add(("용산(내외부)"))
        sub1List.add(("노량진(외부)_1, 9"))
        sub1List.add(("대방(내부)"))
        sub1List.add(("신길(외부)_1, 5"))
        sub1List.add(("영등포(내외부)"))
        sub1List.add(("신도림(내부)_1, 2"))
        sub1List.add(("구로(내외부)"))
        sub1List.add(("구일(내외부)"))
        sub1List.add(("개봉(외부)"))
        sub1List.add(("오류동(외부)"))
        sub1List.add(("온수(외부)_1, 7"))
        sub1List.add(("역곡(외부)"))
        sub1List.add(("소사(외부)"))
        sub1List.add(("부천(외부)"))
        sub1List.add(("중동(외부)"))
        sub1List.add(("송내(외부)"))
        sub1List.add(("부개(외부)"))
        sub1List.add(("부평(내외부)"))
        sub1List.add(("백운(외부)"))
        sub1List.add(("동암(외부)"))
        sub1List.add(("간석(내부)"))
        sub1List.add(("주안(내외부)"))
        sub1List.add(("도화(외부)"))
        sub1List.add(("제물포(외부)"))
        sub1List.add(("도원(내부)"))
        sub1List.add(("동인천(외부)"))
        sub1List.add(("인천(외부)"))
        sub1List.add(("가산 디지털단지(외부)_1, 7"))
        sub1List.add(("독산(외부)"))
        sub1List.add(("금천구청(외부)"))
        sub1List.add(("광명(외부)"))
        sub1List.add(("석수(내외부)"))
        sub1List.add(("관악(내외부)"))
        sub1List.add(("안양(외부)"))
        sub1List.add(("명학(내외부)"))
        sub1List.add(("금정(외부)_1, 4"))
        sub1List.add(("군포(외부)"))
        sub1List.add(("당정(외부)"))
        sub1List.add(("의왕(외부)"))
        sub1List.add(("성균관대(외부)"))
        sub1List.add(("화서(내부)"))
        sub1List.add(("수원(내외부)"))
        sub1List.add(("세류(외부)"))
        sub1List.add(("병점(외부)"))
        sub1List.add(("서동탄(외부)"))
        sub1List.add(("세마(외부)"))
        sub1List.add(("오산대(외부)"))
        sub1List.add(("오산(외부)"))
        sub1List.add(("진위(외부)"))
        sub1List.add(("송탄(외부)"))
        sub1List.add(("서정리(외부)"))
        sub1List.add(("지제(외부)"))
        sub1List.add(("평택(외부)"))
        sub1List.add(("성환(외부)"))
        sub1List.add(("직산(외부)"))
        sub1List.add(("두정(외부)"))
        sub1List.add(("천안(외부)"))
        sub1List.add(("봉명(외부)"))
        sub1List.add(("쌍용(외부)"))
        sub1List.add(("아산(외부)"))
        sub1List.add(("배방(외부)"))
        sub1List.add(("온양 온천(외부)"))
        sub1List.add(("신창(외부)"))



        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub1List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub1List.contains(p0)) {
                    adapter.filter.filter(p0)
                } else {
                    Toast.makeText(applicationContext, "Item not found", Toast.LENGTH_LONG).show()
                }
                return false
            }

            override fun onQueryTextChange(p0: String): Boolean {
                adapter.filter.filter(p0)
                return false
            }

        })
    }
}

