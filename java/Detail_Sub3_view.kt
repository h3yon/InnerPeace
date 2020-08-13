package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub3_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        toolbar_title.setText("3 호선")

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub3List = ArrayList<SubForList>()
        sub3List.add(SubForList("대화"))
        sub3List.add(SubForList("주엽"))
        sub3List.add(SubForList("정발산"))
        sub3List.add(SubForList("마두"))
        sub3List.add(SubForList("백석"))
        sub3List.add(SubForList("대곡"))
        sub3List.add(SubForList("화정"))
        sub3List.add(SubForList("원당"))
        sub3List.add(SubForList("원흥"))
        sub3List.add(SubForList("삼송"))
        sub3List.add(SubForList("지축"))
        sub3List.add(SubForList("구파발"))
        sub3List.add(SubForList("연신내"))
        sub3List.add(SubForList("불광"))
        sub3List.add(SubForList("녹번"))
        sub3List.add(SubForList("홍제"))
        sub3List.add(SubForList("무악재"))
        sub3List.add(SubForList("독립문"))
        sub3List.add(SubForList("경복궁"))
        sub3List.add(SubForList("안국"))
        sub3List.add(SubForList("종로3가"))
        sub3List.add(SubForList("을지로3가"))
        sub3List.add(SubForList("충무로"))
        sub3List.add(SubForList("동대입구"))
        sub3List.add(SubForList("약수"))
        sub3List.add(SubForList("금호"))
        sub3List.add(SubForList("옥수"))
        sub3List.add(SubForList("압구정"))
        sub3List.add(SubForList("신사"))
        sub3List.add(SubForList("잠원"))
        sub3List.add(SubForList("고속터미널"))
        sub3List.add(SubForList("교대"))
        sub3List.add(SubForList("남부터미널"))
        sub3List.add(SubForList("양재"))
        sub3List.add(SubForList("매봉"))
        sub3List.add(SubForList("도곡"))
        sub3List.add(SubForList("대치"))
        sub3List.add(SubForList("학여울"))
        sub3List.add(SubForList("대청"))
        sub3List.add(SubForList("일원"))
        sub3List.add(SubForList("수서"))
        sub3List.add(SubForList("가락시장"))
        sub3List.add(SubForList("경찰병원"))
        sub3List.add(SubForList("오금"))

        val adapter = DetailSubAdapter(sub3List, LayoutInflater.from(this@Detail_Sub3_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub3_view)

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
