package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subway_search_view.*

class Detail_Sub5_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subway_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("5 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub5List = arrayListOf<String>()
        sub5List.add(("방화(외부)"))
        sub5List.add(("개화산(외부)"))
        sub5List.add(("김포공항(외부)_5, 9"))
        sub5List.add(("송정(외부)"))
        sub5List.add(("마곡(외부)"))
        sub5List.add(("발산(외부)"))
        sub5List.add(("우장산(외부)"))
        sub5List.add(("화곡(외부)"))
        sub5List.add(("까치산(외부)_2, 5"))
        sub5List.add(("신정(내부)"))
        sub5List.add(("목동(외부)"))
        sub5List.add(("오목교(외부)"))
        sub5List.add(("양평(내부)"))
        sub5List.add(("영등포구청(외부)_2, 5"))
        sub5List.add(("영등포시장(외부)"))
        sub5List.add(("신길(외부)_1, 5"))
        sub5List.add(("여의도(외부)_5, 9"))
        sub5List.add(("여의나루(외부)"))
        sub5List.add(("마포(외부)"))
        sub5List.add(("공덕(외부)_5, 6"))
        sub5List.add(("애오개(외부)"))
        sub5List.add(("충정로(외부)_2, 5"))
        sub5List.add(("서대문(외부)"))
        sub5List.add(("광화문(외부)"))
        sub5List.add(("종로3가(내부)_1, 3, 5"))
        sub5List.add(("을지로4가(외부)_2, 5"))
        sub5List.add(("동대문역사문화공원(외부)_2, 4, 5"))
        sub5List.add(("청구(외부)_5, 6"))
        sub5List.add(("신금호(외부)"))
        sub5List.add(("행당(외부)"))
        sub5List.add(("왕십리(내외부)_2, 5"))
        sub5List.add(("마장(외부)"))
        sub5List.add(("답십리(외부)"))
        sub5List.add(("장한평(외부)"))
        sub5List.add(("군자(외부)_5, 7"))
        sub5List.add(("아차산(외부)"))
        sub5List.add(("광나루(외부)"))
        sub5List.add(("천호(외부)_5, 8"))
        sub5List.add(("강동(외부)"))
        sub5List.add(("길동(외부)"))
        sub5List.add(("굽은다리(외부)"))
        sub5List.add(("명일(외부)"))
        sub5List.add(("고덕(외부)"))
        sub5List.add(("상일동(외부)"))
        sub5List.add(("미사(내외부)"))
        sub5List.add(("하남풍산(외부)"))
        sub5List.add(("둔촌동(외부)"))
        sub5List.add(("올림픽공원(외부)_5, 9"))
        sub5List.add(("방이(외부)"))
        sub5List.add(("오금(내부)_3, 5"))
        sub5List.add(("개롱(외부)"))
        sub5List.add(("거여(외부)"))
        sub5List.add(("마천(외부)"))

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub5List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub5List.contains(p0)) {
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
