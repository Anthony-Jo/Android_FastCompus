package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.a04_01_calculator.*

class A04_01_calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a04_01_calculator)

        var num1: Int = 0
        var num2: Int = 0
        var temp: Int = 0


        fun input (tmp: Int): Int {
            var result: Int = 0

            if ( result == 0 ) {
                result = tmp
            }
            else if ( (result != 0) && (result <= 9) ) {
                result *= 10
                result += temp
            }
            else if ( (result > 9) && (result <= 99) ) {
                result *= 10
                result += temp
            }
            else if ( (result > 99) && (result <= 999) ) {
                result *= 10
                result += temp
            }
            else {

            }
            temp = 0
            return result
        }

        fun which_number() {
            if (num1 == 0) {
                num1 = input(temp)
            }
            else if ( (num1 != 0) && (num2 == 0) ) {
                num2 = input(temp)
            }
            else {

            }
        }

        key_one.setOnClickListener {

        }
        key_two.setOnClickListener {
        }
        key_three.setOnClickListener {
        }
        key_four.setOnClickListener {
        }
        key_five.setOnClickListener {
        }
        key_six.setOnClickListener {
        }
        key_seven.setOnClickListener {
        }
        key_eight.setOnClickListener {
        }
        key_nine.setOnClickListener {
        }
        key_zero.setOnClickListener {
        }
        key_plus.setOnClickListener {
        }
        key_minus.setOnClickListener {
        }
        key_multiplication.setOnClickListener {
        }
        key_divide.setOnClickListener {
        }
        key_equal.setOnClickListener {
        }
    }
}
