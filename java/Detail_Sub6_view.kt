package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub6_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("6 호선")

        val sub6List = ArrayList<SubForList>()

        sub6List.add(SubForList("응암"))
        sub6List.add(SubForList("역촌"))
        sub6List.add(SubForList("불광"))
        sub6List.add(SubForList("독바위"))
        sub6List.add(SubForList("연신내"))
        sub6List.add(SubForList("구산"))
        sub6List.add(SubForList("새절"))
        sub6List.add(SubForList("증산"))
        sub6List.add(SubForList("디지털 미디어시티"))
        sub6List.add(SubForList("월드컵경기장"))
        sub6List.add(SubForList("마포구청"))
        sub6List.add(SubForList("망원"))
        sub6List.add(SubForList("합정"))
        sub6List.add(SubForList("성수"))
        sub6List.add(SubForList("광흥창"))
        sub6List.add(SubForList("대흥"))
        sub6List.add(SubForList("공덕"))
        sub6List.add(SubForList("효창 공원앞"))
        sub6List.add(SubForList("삼각지"))
        sub6List.add(SubForList("녹사평"))
        sub6List.add(SubForList("이태원"))
        sub6List.add(SubForList("한강진"))
        sub6List.add(SubForList("버티고개"))
        sub6List.add(SubForList("약수"))
        sub6List.add(SubForList("청구"))
        sub6List.add(SubForList("신당"))
        sub6List.add(SubForList("동묘앞"))
        sub6List.add(SubForList("창신"))
        sub6List.add(SubForList("보문"))
        sub6List.add(SubForList("안암"))
        sub6List.add(SubForList("고려대"))
        sub6List.add(SubForList("월곡"))
        sub6List.add(SubForList("상월곡"))
        sub6List.add(SubForList("돌곶이"))
        sub6List.add(SubForList("석계"))
        sub6List.add(SubForList("태릉입구"))
        sub6List.add(SubForList("화랑대"))
        sub6List.add(SubForList("봉화산"))
        sub6List.add(SubForList("신내"))

        val adapter = DetailSubAdapter(sub6List, LayoutInflater.from(this@Detail_Sub6_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub6_view)
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
