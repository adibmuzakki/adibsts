package com.example.adibsts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent ( this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}