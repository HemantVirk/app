package com.example.a6packin30days

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_beginner.*

class Beginner : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginner)
    }
    fun back(view: View){

        val back = Intent(this,MainActivity::class.java)
        startActivity(back)
    }
    fun refresh(){

    }
}