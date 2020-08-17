package com.project.innerpeace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        btn_login_view.setOnClickListener {
            startActivity(Intent(this,Login_view::class.java))
            finish()
        }
    }
}

