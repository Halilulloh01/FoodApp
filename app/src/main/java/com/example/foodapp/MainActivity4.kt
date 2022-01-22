package com.example.foodapp

import Cache.MySharedPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()
        MySharedPreference.init(this)
        val list = MySharedPreference.name
        val position = intent.getIntExtra("position", 0)
        ovqat_nomi_txt.text = list[position].name
        kerakli_mahsulotlar_txt.text = list[position].kerakliMahsulotlar
        taom_tayorlanish_tartibi_txt.text = list[position].tayorlanishTartibi
    }
}