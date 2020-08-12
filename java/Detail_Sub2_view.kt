package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail__food1.*
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub2_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub2List = ArrayList<SubForList>()

        sub2List.add(SubForList("까치산"))
        sub2List.add(SubForList("신정네거리"))
        sub2List.add(SubForList("양천구청"))
        sub2List.add(SubForList("도림천"))
        sub2List.add(SubForList("신도림"))
        sub2List.add(SubForList("대림"))
        sub2List.add(SubForList("구로디지털단지"))
        sub2List.add(SubForList("신대방"))
        sub2List.add(SubForList("신림"))
        sub2List.add(SubForList("봉천"))
        sub2List.add(SubForList("서울대입구"))
        sub2List.add(SubForList("낙성대"))
        sub2List.add(SubForList("사당"))
        sub2List.add(SubForList("방배"))
        sub2List.add(SubForList("서초"))
        sub2List.add(SubForList("교대"))
        sub2List.add(SubForList("강남"))
        sub2List.add(SubForList("역삼"))
        sub2List.add(SubForList("선릉"))
        sub2List.add(SubForList("삼성"))
        sub2List.add(SubForList("종합운동장"))
        sub2List.add(SubForList("잠실새내"))
        sub2List.add(SubForList("잠실"))
        sub2List.add(SubForList("잠실나루"))
        sub2List.add(SubForList("강변"))
        sub2List.add(SubForList("구의"))
        sub2List.add(SubForList("건대입구"))
        sub2List.add(SubForList("성수"))
        sub2List.add(SubForList("용답"))
        sub2List.add(SubForList("신답"))
        sub2List.add(SubForList("용두"))
        sub2List.add(SubForList("신설동"))
        sub2List.add(SubForList("뚝섬"))
        sub2List.add(SubForList("한양대"))
        sub2List.add(SubForList("왕십리"))
        sub2List.add(SubForList("상왕십리"))
        sub2List.add(SubForList("신당"))
        sub2List.add(SubForList("동대문역사문화공원"))
        sub2List.add(SubForList("을지로4가"))
        sub2List.add(SubForList("을지로3가"))
        sub2List.add(SubForList("을지로입구"))
        sub2List.add(SubForList("시청"))
        sub2List.add(SubForList("충정로"))
        sub2List.add(SubForList("아현"))
        sub2List.add(SubForList("이대"))
        sub2List.add(SubForList("신촌"))
        sub2List.add(SubForList("홍대입구"))
        sub2List.add(SubForList("합정"))
        sub2List.add(SubForList("당산"))
        sub2List.add(SubForList("영등포구청"))
        sub2List.add(SubForList("문래"))

        val adapter = DetailSubAdapter(sub2List, LayoutInflater.from(this@Detail_Sub2_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub2_view)

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




