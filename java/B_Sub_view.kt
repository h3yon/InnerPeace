package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail__food1.*

class B_Sub_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b__sub_view)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val subwayList = ArrayList<SubwayForList>()
        for (i in 1 until 10) {
            subwayList.add(SubwayForList("" + i + " 호선"))
        }

        val adapter = SubwayAdapter(subwayList, LayoutInflater.from(this@B_Sub_view))
        food_recycler_view.adapter = adapter
        food_recycler_view.layoutManager = LinearLayoutManager(this@B_Sub_view)

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

class SubwayForList(val subwayText: String) {

}

class SubwayAdapter(
    val subwayList: ArrayList<SubwayForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<SubwayAdapter.ViewHolder>() {
    class ViewHolder(subwayView: View) : RecyclerView.ViewHolder(subwayView) {
        val subwayText: TextView

        init {
            subwayText = subwayView.findViewById(R.id.subway)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.subway_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subwayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.subwayText.setText(subwayList.get(position).subwayText)
    }
}

