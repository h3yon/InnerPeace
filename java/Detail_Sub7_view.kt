package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub7_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub7List = ArrayList<SubForList>()

        sub7List.add(SubForList("부평구청"))
        sub7List.add(SubForList("굴포펀"))
        sub7List.add(SubForList("삼산체육관"))
        sub7List.add(SubForList("상동"))
        sub7List.add(SubForList("부천 시청"))
        sub7List.add(SubForList("신중동"))
        sub7List.add(SubForList("춘의"))
        sub7List.add(SubForList("부천 종합운동장"))
        sub7List.add(SubForList("까치울"))
        sub7List.add(SubForList("온수"))
        sub7List.add(SubForList("천왕"))
        sub7List.add(SubForList("광명 사거리"))
        sub7List.add(SubForList("철산"))
        sub7List.add(SubForList("가산 디지털단지"))
        sub7List.add(SubForList("남구로"))
        sub7List.add(SubForList("대림"))
        sub7List.add(SubForList("신풍"))
        sub7List.add(SubForList("보라매"))
        sub7List.add(SubForList("신대방 삼거리"))
        sub7List.add(SubForList("장승배기"))
        sub7List.add(SubForList("상도"))
        sub7List.add(SubForList("숭실대 입구"))
        sub7List.add(SubForList("남성"))
        sub7List.add(SubForList("총신대 입구(이수)"))
        sub7List.add(SubForList("내방"))
        sub7List.add(SubForList("고속 터미널"))
        sub7List.add(SubForList("반포"))
        sub7List.add(SubForList("논현"))
        sub7List.add(SubForList("학동"))
        sub7List.add(SubForList("강남구청"))
        sub7List.add(SubForList("청담"))
        sub7List.add(SubForList("뚝섬 유원지"))
        sub7List.add(SubForList("건대입구"))
        sub7List.add(SubForList("어린이 대공원"))
        sub7List.add(SubForList("군자"))
        sub7List.add(SubForList("중곡"))
        sub7List.add(SubForList("용마산"))
        sub7List.add(SubForList("사가정"))
        sub7List.add(SubForList("면목"))
        sub7List.add(SubForList("상봉"))
        sub7List.add(SubForList("중화"))
        sub7List.add(SubForList("먹골"))
        sub7List.add(SubForList("태릉입구"))
        sub7List.add(SubForList("공릉"))
        sub7List.add(SubForList("하계"))
        sub7List.add(SubForList("중계"))
        sub7List.add(SubForList("노원"))
        sub7List.add(SubForList("마들"))
        sub7List.add(SubForList("수락산"))
        sub7List.add(SubForList("도봉산"))
        sub7List.add(SubForList("장암"))

        val adapter = DetailSubAdapter(sub7List, LayoutInflater.from(this@Detail_Sub7_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub7_view)
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
