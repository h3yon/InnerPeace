package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail__all1.*

class Detail_Beer1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__all1)

        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val featureList = ArrayList<FeatureForList>()
        featureList.add(FeatureForList("변기 유형 : 좌변기"))
        featureList.add(FeatureForList("남녀 구분 : O"))
        featureList.add(FeatureForList("여성안심 : O"))
        featureList.add(FeatureForList("보안 : 비밀번호 필요(직원문의)"))
        featureList.add(FeatureForList("장애인 화장실 : O"))
        featureList.add(FeatureForList("위생용품 자판기 : X"))


        val adapter = Adapter(featureList, LayoutInflater.from(this@Detail_Beer1))
        all_recycler_view.adapter = adapter
        all_recycler_view.layoutManager = LinearLayoutManager(this@Detail_Beer1)
    }
}

//화장실 특징 나타낼 때 아이콘도 함께 나타낼 경우 수정 필요
class FeatureForList(val featureText: String) {

}

class Adapter(
    val featureList: ArrayList<FeatureForList>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(featureView: View) : RecyclerView.ViewHolder(featureView) {
        val featureText: TextView

        init {
            featureText = featureView.findViewById(R.id.all_feature)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.detail_all1_feature_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return featureList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.featureText.setText(featureList.get(position).featureText)
    }
}