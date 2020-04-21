package com.example.librarypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseAcitivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {

    }

    override fun setValue() {

        Glide.with(mContext).load("https://pds.joins.com/news/component/htmlphoto_mmdata/201810/29/htm_2018102914510995660.jpeg").into(profileImg)



    }
}
