package com.project.innerpeace

import android.app.Activity
import android.content.Intent
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

        val adapter = SubwayAdapter(
            subwayList = subwayList,
            inflater = LayoutInflater.from(this@B_Sub_view),
            activity = this
        )
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
    val inflater: LayoutInflater,
    val activity: Activity
) : RecyclerView.Adapter<SubwayAdapter.ViewHolder>() {
    inner class ViewHolder(subwayView: View) : RecyclerView.ViewHolder(subwayView) {
        val subwayText: TextView

        init {
            subwayText = subwayView.findViewById(R.id.subway)
            subwayView.setOnClickListener {
               if (subwayText.text == "1 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub1_view::class.java))
                } else if (subwayText.text == "2 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub2_view::class.java))
                } else if (subwayText.text == "3 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub3_view::class.java))
                } else if (subwayText.text == "4 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub4_view::class.java))
                } else if (subwayText.text == "5 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub5_view::class.java))
                } else if (subwayText.text == "6 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub6_view::class.java))
                } else if (subwayText.text == "7 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub7_view::class.java))
                } else if (subwayText.text == "8 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub8_view::class.java))
                } else if (subwayText.text == "9 호선") {
                    activity.startActivity(Intent(activity, Detail_Sub9_view::class.java))
                }

            }
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

