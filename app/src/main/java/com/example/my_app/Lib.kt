package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_lib.*

class Lib : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)

        Glide.with(this@Lib)
            .load("https://pds.joins.com/news/component/htmlphoto_mmdata/201504/02/htm_20150402112253563.jpg")
            .centerCrop()
            .into(glide)

        Glide.with(this@Lib)
            .load("https://pds.joins.com/news/component/htmlphoto_mmdata/201504/02/htm_20150402112253563.jpg")
            .into(glide2)
    }
}