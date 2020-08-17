package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub7_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("7 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub7List = arrayListOf<String>()
        sub7List.add(("부평구청(내외부)"))
        sub7List.add(("굴포펀(외부)"))
        sub7List.add(("삼산체육관(외부)"))
        sub7List.add(("상동(외부)"))
        sub7List.add(("부천 시청(외부)"))
        sub7List.add(("신중동(외부)"))
        sub7List.add(("춘의(외부)"))
        sub7List.add(("부천 종합운동장(내외부)"))
        sub7List.add(("까치울(외부)"))
        sub7List.add(("온수(외부)_1, 7"))
        sub7List.add(("천왕(외부)"))
        sub7List.add(("광명 사거리(외부)"))
        sub7List.add(("철산(외부)"))
        sub7List.add(("가산 디지털단지(외부)_1, 7"))
        sub7List.add(("남구로(외부)"))
        sub7List.add(("대림(외부)_2, 7"))
        sub7List.add(("신풍(외부)"))
        sub7List.add(("보라매(외부)"))
        sub7List.add(("신대방 삼거리(외부)"))
        sub7List.add(("장승배기(외부)"))
        sub7List.add(("상도(외부)"))
        sub7List.add(("숭실대 입구(외부)"))
        sub7List.add(("남성(외부)"))
        sub7List.add(("총신대 입구(이수)(내외부)_4, 7"))
        sub7List.add(("내방(외부)"))
        sub7List.add(("고속 터미널(외부)_3, 7, 9"))
        sub7List.add(("반포(외부)"))
        sub7List.add(("논현(외부)"))
        sub7List.add(("학동(외부)"))
        sub7List.add(("강남구청(외부)"))
        sub7List.add(("청담(외부)"))
        sub7List.add(("뚝섬 유원지(내부)"))
        sub7List.add(("건대입구(내부)_2, 7"))
        sub7List.add(("어린이 대공원(외부)"))
        sub7List.add(("군자(외부)_5, 7"))
        sub7List.add(("중곡(외부)"))
        sub7List.add(("용마산(외부)"))
        sub7List.add(("사가정(외부)"))
        sub7List.add(("면목(외부)"))
        sub7List.add(("상봉(내부)"))
        sub7List.add(("중화(외부)"))
        sub7List.add(("먹골(외부)"))
        sub7List.add(("태릉입구(외부)_6, 7"))
        sub7List.add(("공릉(외부)"))
        sub7List.add(("하계(외부)"))
        sub7List.add(("중계(외부)"))
        sub7List.add(("노원(외부)_4, 7"))
        sub7List.add(("마들(외부)"))
        sub7List.add(("수락산(외부)"))
        sub7List.add(("도봉산(내외부)_1, 7"))
        sub7List.add(("장암(외부)"))

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub7List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub7List.contains(p0)) {
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
