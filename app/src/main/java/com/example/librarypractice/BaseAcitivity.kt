package com.example.librarypractice

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseAcitivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValue()



    }



