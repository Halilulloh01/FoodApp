package com.example.foodapp

import Cache.MySharedPreference
import Models.Food
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        MySharedPreference.init(this)
        Saqlash.setOnClickListener {
            val name = taom_nomi_edt.text.toString().trim()
            val products = kerakli_mahsulotlar_edt.text.toString().trim()
            val preparationOrder = taom_tayorlanish_tartibi_edt.text.toString().trim()

            if (name != "" && products != "" && preparationOrder != "") {
                val list = MySharedPreference.name
                list.add(Food(name, products, preparationOrder))
                MySharedPreference.name = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Ma'lumot yetarli emas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}