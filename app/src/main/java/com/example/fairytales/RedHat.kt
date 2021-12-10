package com.example.fairytales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RedHat : AppCompatActivity() {
    lateinit var btnBackChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_red_hat)
        btnBackChoose = findViewById(R.id.btn_back_of_red_hat)
        btnBackChoose.setOnClickListener {
            val btnBackChooseIntent = Intent(this, choosing_fairy::class.java)
            startActivity(btnBackChooseIntent)
        }

    }
}