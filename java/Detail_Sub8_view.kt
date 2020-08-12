package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub8_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub8List = ArrayList<SubForList>()

        sub8List.add(SubForList("암사"))
        sub8List.add(SubForList("천호"))
        sub8List.add(SubForList("강동구청"))
        sub8List.add(SubForList("몽촌포성"))
        sub8List.add(SubForList("잠실"))
        sub8List.add(SubForList("석촌"))
        sub8List.add(SubForList("송파"))
        sub8List.add(SubForList("가락시장"))
        sub8List.add(SubForList("문정"))
        sub8List.add(SubForList("장지"))
        sub8List.add(SubForList("복정"))
        sub8List.add(SubForList("산성"))
        sub8List.add(SubForList("남한산성 입구"))
        sub8List.add(SubForList("단대오거리"))
        sub8List.add(SubForList("신흥"))
        sub8List.add(SubForList("수진"))
        sub8List.add(SubForList("모란"))

        val adapter = DetailSubAdapter(sub8List, LayoutInflater.from(this@Detail_Sub8_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub8_view)
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
