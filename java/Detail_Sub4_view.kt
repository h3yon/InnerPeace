package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subway_search_view.*

class Detail_Sub4_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subway_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("4 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub4List = arrayListOf<String>()
        sub4List.add(("당고개(외부)"))
        sub4List.add(("상계(내부)"))
        sub4List.add(("노원(내부)_4,7"))
        sub4List.add(("창동(내/외부)_1,4"))
        sub4List.add(("쌍문(외부)"))
        sub4List.add(("수유(외부)"))
        sub4List.add(("미아(외부)"))
        sub4List.add(("미아사거리(외부)"))
        sub4List.add(("길음(외부)"))
        sub4List.add(("성신여대입구(내부)_4,우이신설"))
        sub4List.add(("한성대입구(외부)"))
        sub4List.add(("혜화(외부)"))
        sub4List.add(("동대문(내/외부)_1,4"))
        sub4List.add(("동대문역사문화공원(외부)"))
        sub4List.add(("충무로(내부)_3,4"))
        sub4List.add(("명동(내부)"))
        sub4List.add(("회현(내부)"))
        sub4List.add(("서울역(외부)_1,4,공항,경의중앙"))
        sub4List.add(("숙대입구(외부)"))
        sub4List.add(("삼각지(내부)_4,6"))
        sub4List.add(("신용산(외부)"))
        sub4List.add(("이촌(내부)_4,경의중앙"))
        sub4List.add(("동작(내부)_4,9"))
        sub4List.add(("총신대입구(이수)(내부)_4,7"))
        sub4List.add(("사당(내/외부)_2,4"))
        sub4List.add(("남태령(내부)"))
        sub4List.add(("선바위(외부)"))
        sub4List.add(("경마공원(외부)"))
        sub4List.add(("대공원(외부)"))
        sub4List.add(("과천(내부)"))
        sub4List.add(("정부과천청사(내부)"))
        sub4List.add(("인덕원(외부)"))
        sub4List.add(("평촌(외부)"))
        sub4List.add(("범계(외부)"))
        sub4List.add(("금정(내/외부)_1,4"))
        sub4List.add(("산본(외부)"))
        sub4List.add(("수락산(외부)"))
        sub4List.add(("대야미(외부)"))
        sub4List.add(("반월(외부)"))
        sub4List.add(("상록수(내/외부)"))
        sub4List.add(("한대앞(내부)"))
        sub4List.add(("중앙(내부)"))
        sub4List.add(("고잔(내부)"))
        sub4List.add(("초지(내부)_4,서해"))
        sub4List.add(("안산(외부)"))
        sub4List.add(("신길온천(외부)"))
        sub4List.add(("정왕(외부)"))
        sub4List.add(("오이도(외부)_4,수인"))

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub4List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub4List.contains(p0)) {
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
