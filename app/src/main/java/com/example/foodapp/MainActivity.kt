package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        menyu_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
        taomqoshish_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))

        }
    }
}