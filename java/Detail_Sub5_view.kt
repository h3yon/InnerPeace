package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub5_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub5List = ArrayList<SubForList>()
        sub5List.add(SubForList("방화"))
        sub5List.add(SubForList("개화산"))
        sub5List.add(SubForList("김포공항"))
        sub5List.add(SubForList("송정"))
        sub5List.add(SubForList("마곡"))
        sub5List.add(SubForList("발산"))
        sub5List.add(SubForList("우장산"))
        sub5List.add(SubForList("화곡"))
        sub5List.add(SubForList("까치산"))
        sub5List.add(SubForList("신정"))
        sub5List.add(SubForList("목동"))
        sub5List.add(SubForList("오목교"))
        sub5List.add(SubForList("양평"))
        sub5List.add(SubForList("영등포구청"))
        sub5List.add(SubForList("영등포시장"))
        sub5List.add(SubForList("신길"))
        sub5List.add(SubForList("여의도"))
        sub5List.add(SubForList("여의나루"))
        sub5List.add(SubForList("마포"))
        sub5List.add(SubForList("공덕"))
        sub5List.add(SubForList("애오개"))
        sub5List.add(SubForList("충정로"))
        sub5List.add(SubForList("서대문"))
        sub5List.add(SubForList("광화문"))
        sub5List.add(SubForList("종로3가"))
        sub5List.add(SubForList("을지로4가"))
        sub5List.add(SubForList("동대문역사문화공원"))
        sub5List.add(SubForList("청구"))
        sub5List.add(SubForList("신금호"))
        sub5List.add(SubForList("행당"))
        sub5List.add(SubForList("왕십리"))
        sub5List.add(SubForList("마장"))
        sub5List.add(SubForList("답십리"))
        sub5List.add(SubForList("장한평"))
        sub5List.add(SubForList("군자"))
        sub5List.add(SubForList("아차산"))
        sub5List.add(SubForList("광나루"))
        sub5List.add(SubForList("천호"))
        sub5List.add(SubForList("강동"))
        sub5List.add(SubForList("길동"))
        sub5List.add(SubForList("굽은다리"))
        sub5List.add(SubForList("명일"))
        sub5List.add(SubForList("고덕"))
        sub5List.add(SubForList("상일동"))
        sub5List.add(SubForList("둔촌동"))
        sub5List.add(SubForList("올림픽공원"))
        sub5List.add(SubForList("방이"))
        sub5List.add(SubForList("오금"))
        sub5List.add(SubForList("개롱"))
        sub5List.add(SubForList("거여"))
        sub5List.add(SubForList("마천"))

        val adapter = DetailSubAdapter(sub5List, LayoutInflater.from(this@Detail_Sub5_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub5_view)
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
