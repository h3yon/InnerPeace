package com.project.innerpeace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class Detail_view : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val image = intent.getParcelableExtra<Image>(CategoryMainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.detail_image)
        val imgTitle = findViewById<TextView>(R.id.detail_image_title)
        val imgDesc = findViewById<TextView>(R.id.detail_image_desc)

        imgSrc.setImageResource(image!!.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
//
//        val featureList = ArrayList<FeatureForList>()
//        featureList.add(FeatureForList("변기 유형 : 좌변기"))
//        featureList.add(FeatureForList("남녀 구분 : O"))
//        featureList.add(FeatureForList("여성안심 : O"))
//        featureList.add(FeatureForList("보안 : 비밀번호 필요(직원문의)"))
//        featureList.add(FeatureForList("장애인 화장실 : O"))
//        featureList.add(FeatureForList("위생용품 자판기 : X"))
//
//        val detail_recyclerView = findViewById<RecyclerView>(R.id.detail_recyclerview)
//        val adapter = DetailAdapter(featureList, LayoutInflater.from(this@DetailActivity))
//        detail_recyclerView.setHasFixedSize(true)
//        detail_recyclerview.adapter = adapter
//        detail_recyclerview.layoutManager = LinearLayoutManager(this@DetailActivity)
//    }
//}
//
////화장실 특징 나타낼 때 아이콘도 함께 나타낼 경우 수정 필요
//class FeatureForList(val featureText: String) {
//
//}
//
//class DetailAdapter(
//    private val featureList: ArrayList<FeatureForList>,
//    private val inflater: LayoutInflater
//) : RecyclerView.Adapter<DetailAdapter.ViewHolder>() {
//    class ViewHolder(featureView: View) : RecyclerView.ViewHolder(featureView) {
//        val featureText: TextView
//
//        init {
//            featureText = featureView.findViewById(R.id.detail_image_desc)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = inflater.inflate(R.layout.detail_feature_item, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return featureList.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.featureText.setText(featureList.get(position).featureText)
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
