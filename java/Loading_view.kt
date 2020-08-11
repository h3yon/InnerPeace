package com.project.innerpeace


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler

class Loading_view : AppCompatActivity() {
    private val SPLASH_TIME_OUT : Long = 3000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_view)


        Handler().postDelayed({
            startActivity(Intent(this,GPS_view::class.java))

            finish()



        }, SPLASH_TIME_OUT)








    }







}