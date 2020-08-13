package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_sub_view.*

class Detail_Sub1_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        toolbar_title.setText("1 호선")

        val sub1List = ArrayList<SubForList>()

        sub1List.add(SubForList("소요산"))
        sub1List.add(SubForList("동두천"))
        sub1List.add(SubForList("보산"))
        sub1List.add(SubForList("동두천 중앙"))
        sub1List.add(SubForList("지행"))
        sub1List.add(SubForList("덕정"))
        sub1List.add(SubForList("덕계"))
        sub1List.add(SubForList("양주"))
        sub1List.add(SubForList("녹양"))
        sub1List.add(SubForList("가능"))
        sub1List.add(SubForList("의정부"))
        sub1List.add(SubForList("회룡"))
        sub1List.add(SubForList("망월사"))
        sub1List.add(SubForList("도봉산"))
        sub1List.add(SubForList("도봉"))
        sub1List.add(SubForList("방학"))
        sub1List.add(SubForList("창동"))
        sub1List.add(SubForList("녹천"))
        sub1List.add(SubForList("월계"))
        sub1List.add(SubForList("광운대"))
        sub1List.add(SubForList("석계"))
        sub1List.add(SubForList("신이문"))
        sub1List.add(SubForList("외대앞"))
        sub1List.add(SubForList("회기"))
        sub1List.add(SubForList("청량리"))
        sub1List.add(SubForList("제기동"))
        sub1List.add(SubForList("신설동"))
        sub1List.add(SubForList("동묘앞"))
        sub1List.add(SubForList("동대문"))
        sub1List.add(SubForList("종로 5가"))
        sub1List.add(SubForList("종로 3가"))
        sub1List.add(SubForList("광화문"))
        sub1List.add(SubForList("종각"))
        sub1List.add(SubForList("시청"))
        sub1List.add(SubForList("을지로 입구"))
        sub1List.add(SubForList("서울역"))
        sub1List.add(SubForList("남영"))
        sub1List.add(SubForList("용산"))
        sub1List.add(SubForList("노량진"))
        sub1List.add(SubForList("대방"))
        sub1List.add(SubForList("신길"))
        sub1List.add(SubForList("영등포"))
        sub1List.add(SubForList("신도림"))
        sub1List.add(SubForList("구로"))
        sub1List.add(SubForList("구일"))
        sub1List.add(SubForList("개봉"))
        sub1List.add(SubForList("오류동"))
        sub1List.add(SubForList("온수"))
        sub1List.add(SubForList("역곡"))
        sub1List.add(SubForList("소사"))
        sub1List.add(SubForList("부천"))
        sub1List.add(SubForList("중동"))
        sub1List.add(SubForList("송내"))
        sub1List.add(SubForList("부개"))
        sub1List.add(SubForList("부평"))
        sub1List.add(SubForList("백운"))
        sub1List.add(SubForList("동암"))
        sub1List.add(SubForList("간석"))
        sub1List.add(SubForList("주안"))
        sub1List.add(SubForList("도화"))
        sub1List.add(SubForList("제물포"))
        sub1List.add(SubForList("도원"))
        sub1List.add(SubForList("동인천"))
        sub1List.add(SubForList("인천"))
        sub1List.add(SubForList("가산 디지털단지"))
        sub1List.add(SubForList("독산"))
        sub1List.add(SubForList("금천구청"))
        sub1List.add(SubForList("광명"))
        sub1List.add(SubForList("석수"))
        sub1List.add(SubForList("관악"))
        sub1List.add(SubForList("안양"))
        sub1List.add(SubForList("명학"))
        sub1List.add(SubForList("금정"))
        sub1List.add(SubForList("군포"))
        sub1List.add(SubForList("당정"))
        sub1List.add(SubForList("의왕"))
        sub1List.add(SubForList("성균관대"))
        sub1List.add(SubForList("화서"))
        sub1List.add(SubForList("수원"))
        sub1List.add(SubForList("세류"))
        sub1List.add(SubForList("병점"))
        sub1List.add(SubForList("서동탄"))
        sub1List.add(SubForList("세마"))
        sub1List.add(SubForList("오산대"))
        sub1List.add(SubForList("오산"))
        sub1List.add(SubForList("진위"))
        sub1List.add(SubForList("송탄"))
        sub1List.add(SubForList("서정리"))
        sub1List.add(SubForList("지제"))
        sub1List.add(SubForList("평택"))
        sub1List.add(SubForList("성환"))
        sub1List.add(SubForList("직산"))
        sub1List.add(SubForList("두정"))
        sub1List.add(SubForList("천안"))
        sub1List.add(SubForList("봉명"))
        sub1List.add(SubForList("쌍용"))
        sub1List.add(SubForList("아산"))
        sub1List.add(SubForList("배방"))
        sub1List.add(SubForList("온양 온천"))
        sub1List.add(SubForList("신창"))


        val adapter = DetailSubAdapter(sub1List, LayoutInflater.from(this@Detail_Sub1_view))
        sub_recycler_view.adapter = adapter
        sub_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Sub1_view)

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

class SubForList(val subwayText: String) {

}

class DetailSubAdapter(
    val subList: ArrayList<SubForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<DetailSubAdapter.ViewHolder>() {
    class ViewHolder(subwayView: View) : RecyclerView.ViewHolder(subwayView) {
        val subwayText: TextView

        init {
            subwayText = subwayView.findViewById(R.id.subway_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.detail_sub_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.subwayText.setText(subList.get(position).subwayText)
    }
}
