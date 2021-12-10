package com.example.fairytales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class choosing_fairy : AppCompatActivity() {
    lateinit var btnOnMain: Button // для кнопки - на главную
    lateinit var btnThreePigs: Button // для кнопки - три поросенка
    lateinit var btnRedHat: Button // для кнопки - красная шапочка
    lateinit var btnAroundBall: Button // для кнопки - колобок

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosing_fairy)
        // на главную
        btnOnMain = findViewById(R.id.btn_on_main)
        btnOnMain.setOnClickListener {
            val btnOnMainIntent = Intent(this, MainActivity::class.java)
            startActivity(btnOnMainIntent)
        }
        //три поросенка
        btnThreePigs = findViewById(R.id.btn_three_pigs)
        btnThreePigs.setOnClickListener {
            val btnThreePigsIntent = Intent(this, ThreePigs::class.java)
            startActivity(btnThreePigsIntent)
        }

        //красная шапочка
        btnRedHat = findViewById(R.id.btn_red_hat)
        btnRedHat.setOnClickListener {
            val btnRedHatIntent = Intent(this, RedHat::class.java)
            startActivity(btnRedHatIntent)
        }

        // колобок
        btnAroundBall = findViewById(R.id.btn_around_ball)
        btnAroundBall.setOnClickListener {
            val btnAroundBallIntent = Intent(this, AroundBall::class.java)
            startActivity(btnAroundBallIntent)
        }


    }

}
