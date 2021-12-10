package com.example.fairytales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AroundBall : AppCompatActivity() {
    lateinit var btnOfAroundBall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_around_ball)

        btnOfAroundBall = findViewById(R.id.btn_back_of_around_ball)
        btnOfAroundBall.setOnClickListener{
            val btnOfAroundBallIntent = Intent(this, choosing_fairy::class.java)
            startActivity(btnOfAroundBallIntent)

        }
    }
}