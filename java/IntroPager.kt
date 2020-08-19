@file:Suppress("DEPRECATION")

package com.project.innerpeace

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_intropager.*

class IntroPager : AppCompatActivity() {

    companion object {
        const val TAG: String = "로그"
    }

    private var pageItemList = ArrayList<PageItem>()
    private lateinit var introPagerAdapter: IntroPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intropager)

        previous_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem - 1
        }

        next_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem + 1
        }

        pageItemList.add(PageItem(R.color.colorAccent, R.drawable.ic_pager_item_1, "첫번째 페이지 "))
        pageItemList.add(PageItem(R.color.colorAccent, R.drawable.ic_pager_item_2, "두번째 페이지 "))
        pageItemList.add(PageItem(R.color.colorAccent, R.drawable.ic_pager_item_3, "세번째 페이지 "))

        introPagerAdapter = IntroPagerAdapter(pageItemList)

        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }

        // 상태바 없애기 (필수)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        // 뷰페이저에 설정
        my_intro_view_pager.apply {
            adapter = introPagerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL

            this.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
//                    supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.colorBlue)))
                    if(position == 2){
                        Handler().postDelayed({
                            val intent = Intent(this@IntroPager, GPS_view::class.java)
                            startActivity(intent)
                        }, 600)
                    }
                }
            })

            dots_indicator.setViewPager2(this)
        }
    }
}
