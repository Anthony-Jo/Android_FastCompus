package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass", "$data")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onStart")

        val fragmentOne : FragmentOne = FragmentOne()
        // 프라그먼트에 data 삽입 방법
        val bundle : Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener {
            /*  fragment를 동적으로 작동   */
            val fragmentManager : FragmentManager = supportFragmentManager
            /*  Transaction
            *   작업의 단위 -> 시작과 끝이 있다. */
            val fragmentTransaction = fragmentManager.beginTransaction()    /*  start   */
            /*  replace/add */
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()                                   /*  end */
            /*  commit: 시간 될 때 끝냄 (좀 더 안정적)
             *  commitnow: 지금 당장 끝냄
             *  commitAllowingStateLoss: 커밋이 안 될 수도 있음
             */
        }
        button2.setOnClickListener {
            //val fragmentOne: FragmentOne = FragmentOne()
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            /*  프라그 먼트의 remove/detach   */
            fragmentTransaction.commit()
        }
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