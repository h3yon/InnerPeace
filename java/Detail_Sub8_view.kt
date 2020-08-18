package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.subway_search_view.*

class Detail_Sub8_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subway_search_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("8 호선")

        val search = findViewById<SearchView>(R.id.searchView)
        search.background = null
        val listView = findViewById<ListView>(R.id.searchList)

        val sub8List = arrayListOf<String>()
        sub8List.add(("암사(외부)"))
        sub8List.add(("천호(외부)_5,8"))
        sub8List.add(("강동구청(외부)"))
        sub8List.add(("몽촌포성(외부)"))
        sub8List.add(("잠실(외부)_2,8"))
        sub8List.add(("석촌(외부)_8,9"))
        sub8List.add(("송파(외부)"))
        sub8List.add(("가락시장(외부)_3,8"))
        sub8List.add(("문정(외부)"))
        sub8List.add(("장지(외부)"))
        sub8List.add(("복정(외부)_8,분당"))
        sub8List.add(("산성(외부)"))
        sub8List.add(("남한산성입구(외부)"))
        sub8List.add(("단대오거리(외부)"))
        sub8List.add(("신흥(외부)"))
        sub8List.add(("수진(외부)"))
        sub8List.add(("모란(외부)_8,분당"))


        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1, sub8List
        )

        listView.adapter = adapter
//        names.setTextColor(Color.BLACK)

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String): Boolean {
                search.clearFocus()
                if (sub8List.contains(p0)) {
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
