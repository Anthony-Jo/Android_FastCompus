package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_linstener.*  /*  xml import  */

class Linstener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linstener)

        /*  view를 액티비티로 가져오는 방법 */
        //hello
        //val textView : TextView = findViewById(R.id.hello)

        /*  1. 람다방식 */
        hello.setOnClickListener {
            Log.d("Click", "Click")
        }

        /*  2. 익명함수 방식  */
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("Click", "Click")
            }
        })

        /*  3. 이름이 필요한 경우 (click) 가장 마지막이 적용된다.   */
        val click = object: View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("Click", "Click")
                hello.setText("Goodbye")
                image.setImageResource(R.drawable.company_logo)
                number += 10
                Log.d("number", "$number")

            }
        }
        hello.setOnClickListener(click)


        /*  View 조작 */
        /*  setText */
        /*  setImageResource    */




    }
}