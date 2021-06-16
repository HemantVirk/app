package com.example.a6packin30days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun beginner(view: View){
        Toast.makeText(this, "Beginner Plan Selected", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,Beginner::class.java)
        startActivity(intent)
    }
    fun intermediate(view: View){
        Toast.makeText(this, "Intermediate Plan Selected", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,Intermediate::class.java)
        startActivity(intent)
    }
    fun advance(view: View){
        Toast.makeText(this, "Advance Plan Selected", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,Advance::class.java)
        startActivity(intent)
    }
}