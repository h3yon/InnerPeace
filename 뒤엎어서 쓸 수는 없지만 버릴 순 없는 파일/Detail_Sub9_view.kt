package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub9_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("9 호선")

        val sub9List = ArrayList<SubForList>()

        sub9List.add(SubForList("개화"))
        sub9List.add(SubForList("김포공항"))
        sub9List.add(SubForList("공항시장"))
        sub9List.add(SubForList("신방화"))
        sub9List.add(SubForList("마곡나루"))
        sub9List.add(SubForList("양천향교"))
        sub9List.add(SubForList("가양"))
        sub9List.add(SubForList("증미"))
        sub9List.add(SubForList("등촌"))
        sub9List.add(SubForList("염창"))
        sub9List.add(SubForList("신목동"))
        sub9List.add(SubForList("선유도"))
        sub9List.add(SubForList("당산"))
        sub9List.add(SubForList("국회의사당"))
        sub9List.add(SubForList("여의도"))
        sub9List.add(SubForList("샛강"))
        sub9List.add(SubForList("노량진"))
        sub9List.add(SubForList("노들"))
        sub9List.add(SubForList("흑석"))
        sub9List.add(SubForList("동작"))
        sub9List.add(SubForList("구반포"))
        sub9List.add(SubForList("신반포"))
        sub9List.add(SubForList("고속터미널"))
        sub9List.add(SubForList("사평"))
        sub9List.add(SubForList("신논현"))
        sub9List.add(SubForList("언주"))
        sub9List.add(SubForList("선정릉"))
        sub9List.add(SubForList("삼성중앙"))
        sub9List.add(SubForList("봉은사"))
        sub9List.add(SubForList("종합운동장"))
        sub9List.add(SubForList("삼전"))
        sub9List.add(SubForList("석촌고분"))
        sub9List.add(SubForList("석촌"))
        sub9List.add(SubForList("송파나루"))
        sub9List.add(SubForList("한성백제"))
        sub9List.add(SubForList("올림픽 공원"))
        sub9List.add(SubForList("둔촌오륜"))
        sub9List.add(SubForList("중앙 보훈병원"))

        val adapter = DetailSubAdapter(sub9List, LayoutInflater.from(this@Detail_Sub9_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub9_view)

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
