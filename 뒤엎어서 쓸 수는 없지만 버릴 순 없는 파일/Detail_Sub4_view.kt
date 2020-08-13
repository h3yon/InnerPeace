package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub4_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        toolbar_title.setText("4 호선")

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub4List = ArrayList<SubForList>()

        sub4List.add(SubForList("당고개"))
        sub4List.add(SubForList("상계"))
        sub4List.add(SubForList("노원"))
        sub4List.add(SubForList("창동"))
        sub4List.add(SubForList("쌍문"))
        sub4List.add(SubForList("수유"))
        sub4List.add(SubForList("미아"))
        sub4List.add(SubForList("미아사거리"))
        sub4List.add(SubForList("길음"))
        sub4List.add(SubForList("성신여대입구"))
        sub4List.add(SubForList("한성대입구"))
        sub4List.add(SubForList("혜화"))
        sub4List.add(SubForList("동대문"))
        sub4List.add(SubForList("동대문역사문화공원"))
        sub4List.add(SubForList("충무로"))
        sub4List.add(SubForList("명동"))
        sub4List.add(SubForList("회현"))
        sub4List.add(SubForList("서울역"))
        sub4List.add(SubForList("숙대입구"))
        sub4List.add(SubForList("신용산"))
        sub4List.add(SubForList("이촌"))
        sub4List.add(SubForList("동작"))
        sub4List.add(SubForList("총신대입구(이수)"))
        sub4List.add(SubForList("사당"))
        sub4List.add(SubForList("남태령"))
        sub4List.add(SubForList("선바위"))
        sub4List.add(SubForList("경마공원"))
        sub4List.add(SubForList("대공원"))
        sub4List.add(SubForList("과천"))
        sub4List.add(SubForList("정부과천청사"))
        sub4List.add(SubForList("과천지식정보단지"))
        sub4List.add(SubForList("인덕원"))
        sub4List.add(SubForList("평촌"))
        sub4List.add(SubForList("범계"))
        sub4List.add(SubForList("금정"))
        sub4List.add(SubForList("산본"))
        sub4List.add(SubForList("수락산"))
        sub4List.add(SubForList("당고개"))
        sub4List.add(SubForList("대야미"))
        sub4List.add(SubForList("반월"))
        sub4List.add(SubForList("상록수"))
        sub4List.add(SubForList("한대앞"))
        sub4List.add(SubForList("중앙"))
        sub4List.add(SubForList("고잔"))
        sub4List.add(SubForList("초지"))
        sub4List.add(SubForList("안산"))
        sub4List.add(SubForList("신길온천"))
        sub4List.add(SubForList("정왕"))
        sub4List.add(SubForList("오이도"))

        val adapter = DetailSubAdapter(sub4List, LayoutInflater.from(this@Detail_Sub4_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub4_view)
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
