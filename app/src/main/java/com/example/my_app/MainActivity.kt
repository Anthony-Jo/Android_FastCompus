package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) /* 액티비티 생성시 1회 필요한 작업들 */ {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.srollview_13)  /*  화면을 그려주는 함수    */

        Log.d("life_cycle", "OnCreate")
    }
    override fun onStart() {
        super.onStart()

        Log.d("life_cycle", "onStart")
    }
    override fun onResume() {
        super.onResume()

        Log.d("life_cycle", "onResume")
    }
    override fun onPause() {
        super.onPause()

        Log.d("life_cycle", "onPause")
    }
    override fun onStop() {
        super.onStop()

        Log.d("life_cycle", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()

        Log.d("life_cycle", "onDestroy")
    }
}
