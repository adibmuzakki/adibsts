package com.example.adibsts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val Intent = Intent ( this, MainActivity::class.java)
            startActivity(Intent)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent ( this, MainActivity3::class.java)
            startActivity(intent2)
        }
    }
}