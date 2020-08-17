package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub9_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("9 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub9List = arrayListOf<String>()
        sub9List.add(("개화(외부)"))
        sub9List.add(("김포공항(내외부)_5, 9"))
        sub9List.add(("공항시장(외부)"))
        sub9List.add(("신방화(외부)"))
        sub9List.add(("마곡나루(내외부)"))
        sub9List.add(("양천향교(외부)"))
        sub9List.add(("가양(외부)"))
        sub9List.add(("증미(외부)"))
        sub9List.add(("등촌(외부)"))
        sub9List.add(("염창(외부)"))
        sub9List.add(("신목동(외부)"))
        sub9List.add(("선유도(외부)"))
        sub9List.add(("당산(내부)_2, 9"))
        sub9List.add(("국회의사당(내외부)"))
        sub9List.add(("여의도(내외부)_5, 9"))
        sub9List.add(("샛강(외부)"))
        sub9List.add(("노량진(내외부)_1, 9"))
        sub9List.add(("노들(외부)"))
        sub9List.add(("흑석(외부)"))
        sub9List.add(("동작(내외부)_4, 9"))
        sub9List.add(("구반포(외부)"))
        sub9List.add(("신반포(외부)"))
        sub9List.add(("고속터미널(내외부)_3, 7, 9"))
        sub9List.add(("사평(외부)"))
        sub9List.add(("신논현(외부)"))
        sub9List.add(("언주(외부)"))
        sub9List.add(("선정릉(외부)"))
        sub9List.add(("삼성중앙(외부)"))
        sub9List.add(("봉은사(외부)"))
        sub9List.add(("종합운동장(외부)_2, 9"))
        sub9List.add(("삼전(외부)"))
        sub9List.add(("석촌고분(외부)"))
        sub9List.add(("석촌(내외부)_8, 9"))
        sub9List.add(("송파나루(외부)"))
        sub9List.add(("한성백제(외부)"))
        sub9List.add(("올림픽 공원(내외부)_5, 9"))
        sub9List.add(("둔촌오륜(외부)"))
        sub9List.add(("중앙 보훈병원(외부)"))


        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub9List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub9List.contains(p0)) {
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
