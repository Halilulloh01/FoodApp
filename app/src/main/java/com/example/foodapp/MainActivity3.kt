package com.example.foodapp

import Adapter.MyAdapter
import Cache.MySharedPreference
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
        MySharedPreference.init(this)
        val list = MySharedPreference.name
        myAdapter = MyAdapter(this, list)
        list_food.adapter = myAdapter

        list_food.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }

    }
}