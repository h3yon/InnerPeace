package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subway_search_view.*

class Detail_Sub3_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subway_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("3 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub3List = ArrayList<String>()
        sub3List.add(("대화(외부)"))
        sub3List.add(("주엽(외부)"))
        sub3List.add(("정발산(외부)"))
        sub3List.add(("마두(외부)"))
        sub3List.add(("백석(외부)"))
        sub3List.add(("대곡(내부)"))
        sub3List.add(("화정(외부)"))
        sub3List.add(("원당(외부)"))
        sub3List.add(("원흥(외부)"))
        sub3List.add(("삼송(외부)"))
        sub3List.add(("지축(내부)"))
        sub3List.add(("구파발(외부)"))
        sub3List.add(("연신내(내외부)_3, 6"))
        sub3List.add(("불광(외부)_3, 6"))
        sub3List.add(("녹번(외부)"))
        sub3List.add(("홍제(외부)"))
        sub3List.add(("무악재(내부)"))
        sub3List.add(("독립문(내부)"))
        sub3List.add(("경복궁(내부)"))
        sub3List.add(("안국(외부)"))
        sub3List.add(("종로3가(내부)_1, 3, 5"))
        sub3List.add(("을지로3가(내부)_2, 3"))
        sub3List.add(("충무로(내부)_3, 4"))
        sub3List.add(("동대입구(내부)"))
        sub3List.add(("약수(내부)_3, 6"))
        sub3List.add(("금호(내부)"))
        sub3List.add(("옥수(내외부)"))
        sub3List.add(("압구정(외부)"))
        sub3List.add(("신사(외부)"))
        sub3List.add(("잠원(내부)"))
        sub3List.add(("고속터미널(내외부)_3, 7, 9"))
        sub3List.add(("교대(외부)_2, 3"))
        sub3List.add(("남부터미널(내부)"))
        sub3List.add(("양재(내부)"))
        sub3List.add(("매봉(외부)"))
        sub3List.add(("도곡(외부)"))
        sub3List.add(("대치(내부)"))
        sub3List.add(("학여울(외부)"))
        sub3List.add(("대청(내부)"))
        sub3List.add(("일원(외부)"))
        sub3List.add(("수서(내부)"))
        sub3List.add(("가락시장(내외부)"))
        sub3List.add(("경찰병원(내부)"))
        sub3List.add(("오금(내외부)_3, 5"))

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub3List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub3List.contains(p0)) {
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
