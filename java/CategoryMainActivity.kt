package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.innerpeace.F_Beer_view

class CategoryMainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val manager = GridLayoutManager(this@CategoryMainActivity, 2)

        val itemList = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "Image 1",
                "#개방#청결",
                "#부가설명 \n 변기유형:좌변기 \n 남녀구분:O "
            ),
            Image(
                R.mipmap.ic_launcher,
                "Image 2",
                "설명입니다",
                "#내부#개방#ㅇㅇㅇㅇㅇ"
            ),
            Image(
                R.mipmap.ic_launcher,
                "Image 3",
                "설명입니다",
                "#내부#개방#ㅇㅇㅇㅇㅇ"
            ),
            Image(
                R.mipmap.ic_launcher,
                "Image 4",
                "설명입니다",
                "#내부#개방#ㅇㅇㅇㅇㅇ"
            ),
            Image(
                R.mipmap.ic_launcher,
                "Image 5",
                "설명입니다",
                "#내부#개방#ㅇㅇㅇㅇㅇ"
            ),
            Image(
                R.mipmap.ic_launcher,
                "Image 6",
                "설명입니다",
                "#내부#개방#ㅇㅇㅇㅇㅇ"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.item_recyclerView)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, itemList){
            val intent = Intent(this, Detail_view::class.java)
            intent.putExtra(F_Beer_view.INTENT_PARCELABLE, it)
            startActivity(intent)
        }
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