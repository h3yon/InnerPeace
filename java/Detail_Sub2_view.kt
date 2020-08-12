package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail__food1.*

class Detail_Sub2_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b__sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub2List = ArrayList<Sub2ForList>()
        sub2List.add(Sub2ForList("까치산"))
        sub2List.add(Sub2ForList("신정네거리"))
        sub2List.add(Sub2ForList("양천구청"))
        sub2List.add(Sub2ForList("도림천"))
        sub2List.add(Sub2ForList("신도림"))
        sub2List.add(Sub2ForList("대림"))
        sub2List.add(Sub2ForList("구로디지털단지"))
        sub2List.add(Sub2ForList("신대방"))
        sub2List.add(Sub2ForList("신림"))
        sub2List.add(Sub2ForList("봉천"))
        sub2List.add(Sub2ForList("서울대입구"))
        sub2List.add(Sub2ForList("낙성대"))
        sub2List.add(Sub2ForList("사당"))
        sub2List.add(Sub2ForList("방배"))
        sub2List.add(Sub2ForList("서초"))
        sub2List.add(Sub2ForList("교대"))
        sub2List.add(Sub2ForList("강남"))
        sub2List.add(Sub2ForList("역삼"))
        sub2List.add(Sub2ForList("선릉"))
        sub2List.add(Sub2ForList("삼성"))
        sub2List.add(Sub2ForList("종합운동장"))
        sub2List.add(Sub2ForList("잠실새내"))
        sub2List.add(Sub2ForList("잠실"))
        sub2List.add(Sub2ForList("잠실나루"))
        sub2List.add(Sub2ForList("강변"))
        sub2List.add(Sub2ForList("구의"))
        sub2List.add(Sub2ForList("건대입구"))
        sub2List.add(Sub2ForList("성수"))
        sub2List.add(Sub2ForList("용답"))
        sub2List.add(Sub2ForList("신답"))
        sub2List.add(Sub2ForList("용두"))
        sub2List.add(Sub2ForList("신설동"))
        sub2List.add(Sub2ForList("뚝섬"))
        sub2List.add(Sub2ForList("한양대"))
        sub2List.add(Sub2ForList("왕십리"))
        sub2List.add(Sub2ForList("상왕십리"))
        sub2List.add(Sub2ForList("신당"))
        sub2List.add(Sub2ForList("동대문역사문화공원"))
        sub2List.add(Sub2ForList("을지로4가"))
        sub2List.add(Sub2ForList("을지로3가"))
        sub2List.add(Sub2ForList("을지로입구"))
        sub2List.add(Sub2ForList("시청"))
        sub2List.add(Sub2ForList("충정로"))
        sub2List.add(Sub2ForList("아현"))
        sub2List.add(Sub2ForList("이대"))
        sub2List.add(Sub2ForList("신촌"))
        sub2List.add(Sub2ForList("홍대입구"))
        sub2List.add(Sub2ForList("합정"))
        sub2List.add(Sub2ForList("당산"))
        sub2List.add(Sub2ForList("영등포구청"))
        sub2List.add(Sub2ForList("문래"))

        val adapter = Sub2Adapter(sub2List, LayoutInflater.from(this@Detail_Sub2_view))
        food_recycler_view.adapter = adapter
        food_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub2_view)

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

class Sub2ForList(val sub2Text: String) {

}

class Sub2Adapter(
    val sub2List: ArrayList<Sub2ForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<Sub2Adapter.ViewHolder>() {
    class ViewHolder(sub2View: View) : RecyclerView.ViewHolder(sub2View) {
        val sub2Text: TextView

        init {
            sub2Text = sub2View.findViewById(R.id.sub2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.sub2_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sub2List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.sub2Text.setText(sub2List.get(position).sub2Text)
    }
}


