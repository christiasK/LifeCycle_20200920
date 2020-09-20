package com.example.lifecycle_20200920

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("메인화면", "실행됨")

        otherBtn.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    override fun onResume() {
        Log.d("메인화면", "화면 갱신")
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "화면 사라짐")
    }

    override fun onDestroy() {
        Log.d("메인화면", "종료됨")
        super.onDestroy()
    }
}