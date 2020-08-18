package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subway_search_view.*

class Detail_Sub6_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subway_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("6 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub6List = arrayListOf<String>()
        sub6List.add(("응암(외부)"))
        sub6List.add(("역촌(외부)"))
        sub6List.add(("불광(외부)_3,6"))
        sub6List.add(("독바위(외부)"))
        sub6List.add(("연신내(외부)_3,6"))
        sub6List.add(("구산(외부)"))
        sub6List.add(("새절(외부)"))
        sub6List.add(("증산(외부)"))
        sub6List.add(("디지털미디어시티(내/외부)_6,공항,경의중앙"))
        sub6List.add(("월드컵경기장(내/외부)"))
        sub6List.add(("마포구청(외부)"))
        sub6List.add(("망원(외부)"))
        sub6List.add(("합정(외부)_2,6"))
        sub6List.add(("성수(외부)"))
        sub6List.add(("광흥창(외부)"))
        sub6List.add(("대흥(외부)"))
        sub6List.add(("공덕(내부)_5,6,공항,경의중앙"))
        sub6List.add(("효창공원앞(외부)_6,경의중앙"))
        sub6List.add(("삼각지(내부)_4,6"))
        sub6List.add(("녹사평(외부)"))
        sub6List.add(("이태원(외부)"))
        sub6List.add(("한강진(외부)"))
        sub6List.add(("버티고개(외부)"))
        sub6List.add(("약수(외부)_3,6"))
        sub6List.add(("청구(외부)_5,6"))
        sub6List.add(("신당(외부)_2,6"))
        sub6List.add(("동묘앞(외부)_1,6"))
        sub6List.add(("창신(내부)"))
        sub6List.add(("보문(외부)_6,우이신설"))
        sub6List.add(("안암(내/외부)"))
        sub6List.add(("고려대(내부)"))
        sub6List.add(("월곡(외부)"))
        sub6List.add(("상월곡(외부)"))
        sub6List.add(("돌곶이(외부)"))
        sub6List.add(("석계(내/외부)_1,6"))
        sub6List.add(("태릉입구(외부)_6,7"))
        sub6List.add(("화랑대(외부)"))
        sub6List.add(("봉화산(외부)"))
        sub6List.add(("신내(외부)_6,경춘"))




        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub6List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub6List.contains(p0)) {
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
