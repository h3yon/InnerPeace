package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub2_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("2 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub2List = arrayListOf<String>()
        sub2List.add(("까치산(외부)_2,5"))
        sub2List.add(("신정네거리(외부)"))
        sub2List.add(("양천구청(내부)"))
        sub2List.add(("도림천(외부)"))
        sub2List.add(("신도림(외부)_1,2"))
        sub2List.add(("대림(내부)_2,7"))
        sub2List.add(("구로디지털단지(내부)"))
        sub2List.add(("신대방(내부)"))
        sub2List.add(("신림(내부)"))
        sub2List.add(("봉천(외부)"))
        sub2List.add(("서울대입구(외부)"))
        sub2List.add(("낙성대(외부)"))
        sub2List.add(("사당(외부)_2,4"))
        sub2List.add(("방배(외부)"))
        sub2List.add(("서초(외부)"))
        sub2List.add(("교대(외부)_2,3"))
        sub2List.add(("강남(내/외부)_2,신분당"))
        sub2List.add(("역삼(외부)"))
        sub2List.add(("선릉(외부)_2,분당"))
        sub2List.add(("삼성(외부)"))
        sub2List.add(("종합운동장(외부)_2,9"))
        sub2List.add(("잠실새내(외부)"))
        sub2List.add(("잠실(외부)_2,8"))
        sub2List.add(("잠실나루(외부)"))
        sub2List.add(("강변(외부)"))
        sub2List.add(("구의(외부)"))
        sub2List.add(("건대입구(내부)_2,7"))
        sub2List.add(("성수(외부)"))
        sub2List.add(("용답(외부)"))
        sub2List.add(("신답(내/외부)"))
        sub2List.add(("용두(내/외부)"))
        sub2List.add(("신설동(외부)_1,2,우이신설"))
        sub2List.add(("뚝섬(외부)"))
        sub2List.add(("한양대(외부)"))
        sub2List.add(("왕십리(내/외부)_2,5,분당,경의중앙"))
        sub2List.add(("상왕십리(외부)"))
        sub2List.add(("신당(외부)_2,6"))
        sub2List.add(("동대문역사문화공원(내/외부)_2,4,5"))
        sub2List.add(("을지로4가(외부),2_5"))
        sub2List.add(("을지로3가(외부)_2,3"))
        sub2List.add(("을지로입구(외부)"))
        sub2List.add(("시청(내/외부)_1,2"))
        sub2List.add(("충정로(외부)_2,5"))
        sub2List.add(("아현(외부)"))
        sub2List.add(("이대(외부)"))
        sub2List.add(("신촌(외부)"))
        sub2List.add(("홍대입구(외부)_공항,경의중앙"))
        sub2List.add(("합정(외부)_2,6"))
        sub2List.add(("당산(내부)_2,9"))
        sub2List.add(("영등포구청(내부)_2,5"))
        sub2List.add(("문래(외부)"))



        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub2List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub2List.contains(p0)) {
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


