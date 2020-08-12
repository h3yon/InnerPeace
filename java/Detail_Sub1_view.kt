package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail__sub1_view.*

class Detail_Sub1_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__sub1_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val sub1List = ArrayList<Sub1ForList>()
        sub1List.add(Sub1ForList("소요산"))
        sub1List.add(Sub1ForList("동두천"))
        sub1List.add(Sub1ForList("보산"))
        sub1List.add(Sub1ForList("동두천 중앙"))
        sub1List.add(Sub1ForList("지행"))
        sub1List.add(Sub1ForList("덕정"))
        sub1List.add(Sub1ForList("덕계"))
        sub1List.add(Sub1ForList("양주"))
        sub1List.add(Sub1ForList("녹양"))
        sub1List.add(Sub1ForList("가능"))
        sub1List.add(Sub1ForList("의정부"))
        sub1List.add(Sub1ForList("회룡"))
        sub1List.add(Sub1ForList("망월사"))
        sub1List.add(Sub1ForList("도봉산"))
        sub1List.add(Sub1ForList("도봉"))
        sub1List.add(Sub1ForList("방학"))
        sub1List.add(Sub1ForList("창동"))
        sub1List.add(Sub1ForList("녹천"))
        sub1List.add(Sub1ForList("월계"))
        sub1List.add(Sub1ForList("광운대"))
        sub1List.add(Sub1ForList("석계"))
        sub1List.add(Sub1ForList("신이문"))
        sub1List.add(Sub1ForList("외대앞"))
        sub1List.add(Sub1ForList("회기"))
        sub1List.add(Sub1ForList("청량리"))
        sub1List.add(Sub1ForList("제기동"))
        sub1List.add(Sub1ForList("신설동"))
        sub1List.add(Sub1ForList("동묘앞"))
        sub1List.add(Sub1ForList("동대문"))
        sub1List.add(Sub1ForList("종로 5가"))
        sub1List.add(Sub1ForList("종로 3가"))
        sub1List.add(Sub1ForList("광화문"))
        sub1List.add(Sub1ForList("종각"))
        sub1List.add(Sub1ForList("시청"))
        sub1List.add(Sub1ForList("을지로 입구"))
        sub1List.add(Sub1ForList("서울역"))
        sub1List.add(Sub1ForList("남영"))
        sub1List.add(Sub1ForList("용산"))
        sub1List.add(Sub1ForList("노량진"))
        sub1List.add(Sub1ForList("대방"))
        sub1List.add(Sub1ForList("신길"))
        sub1List.add(Sub1ForList("영등포"))
        sub1List.add(Sub1ForList("신도림"))
        sub1List.add(Sub1ForList("구로"))
        sub1List.add(Sub1ForList("구일"))
        sub1List.add(Sub1ForList("개봉"))
        sub1List.add(Sub1ForList("오류동"))
        sub1List.add(Sub1ForList("온수"))
        sub1List.add(Sub1ForList("역곡"))
        sub1List.add(Sub1ForList("소사"))
        sub1List.add(Sub1ForList("부천"))
        sub1List.add(Sub1ForList("중동"))
        sub1List.add(Sub1ForList("송내"))
        sub1List.add(Sub1ForList("부개"))
        sub1List.add(Sub1ForList("부평"))
        sub1List.add(Sub1ForList("백운"))
        sub1List.add(Sub1ForList("동암"))
        sub1List.add(Sub1ForList("간석"))
        sub1List.add(Sub1ForList("주안"))
        sub1List.add(Sub1ForList("도화"))
        sub1List.add(Sub1ForList("제물포"))
        sub1List.add(Sub1ForList("도원"))
        sub1List.add(Sub1ForList("동인천"))
        sub1List.add(Sub1ForList("인천"))
        sub1List.add(Sub1ForList("가산 디지털단지"))
        sub1List.add(Sub1ForList("독산"))
        sub1List.add(Sub1ForList("금천구청"))
        sub1List.add(Sub1ForList("광명"))
        sub1List.add(Sub1ForList("석수"))
        sub1List.add(Sub1ForList("관악"))
        sub1List.add(Sub1ForList("안양"))
        sub1List.add(Sub1ForList("명학"))
        sub1List.add(Sub1ForList("금정"))
        sub1List.add(Sub1ForList("군포"))
        sub1List.add(Sub1ForList("당정"))
        sub1List.add(Sub1ForList("의왕"))
        sub1List.add(Sub1ForList("성균관대"))
        sub1List.add(Sub1ForList("화서"))
        sub1List.add(Sub1ForList("수원"))
        sub1List.add(Sub1ForList("세류"))
        sub1List.add(Sub1ForList("병점"))
        sub1List.add(Sub1ForList("서동탄"))
        sub1List.add(Sub1ForList("세마"))
        sub1List.add(Sub1ForList("오산대"))
        sub1List.add(Sub1ForList("오산"))
        sub1List.add(Sub1ForList("진위"))
        sub1List.add(Sub1ForList("송탄"))
        sub1List.add(Sub1ForList("서정리"))
        sub1List.add(Sub1ForList("지제"))
        sub1List.add(Sub1ForList("평택"))
        sub1List.add(Sub1ForList("성환"))
        sub1List.add(Sub1ForList("직산"))
        sub1List.add(Sub1ForList("두정"))
        sub1List.add(Sub1ForList("천안"))
        sub1List.add(Sub1ForList("봉명"))
        sub1List.add(Sub1ForList("쌍용"))
        sub1List.add(Sub1ForList("아산"))
        sub1List.add(Sub1ForList("배방"))
        sub1List.add(Sub1ForList("온양 온천"))
        sub1List.add(Sub1ForList("신창"))


        val adapter = SubwayAdapter(sub1List, LayoutInflater.from(this@Detail_Sub1_view))
        food_recycler_view.adapter = adapter
        food_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub1_view)

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

class Sub1ForList(val subwayText: String) {

}

class SubwayAdapter(
    val sub1List: ArrayList<Sub1ForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<SubwayAdapter.ViewHolder>() {
    class ViewHolder(subwayView: View) : RecyclerView.ViewHolder(subwayView) {
        val subwayText: TextView

        init {
            subwayText = subwayView.findViewById(R.id.subway)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.sub1_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sub1List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.subwayText.setText(sub1List.get(position).subwayText)
    }
}