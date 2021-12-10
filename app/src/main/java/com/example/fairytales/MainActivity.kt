package com.example.fairytales

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.pm.ActivityInfo

class MainActivity : AppCompatActivity() {
    private lateinit var linkButton: Button //переменная для кнопки с ссылкой
    lateinit var choosingButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT //только портретная ориентация

//повешение слушателя на кнопку выбор сказки
        choosingButton=findViewById(R.id.choosing_button)
        choosingButton.setOnClickListener {
// код для интента перехода на вторую страницу
            val choosingFairyIntent: Intent = Intent(this, choosing_fairy::class.java)
            startActivity(choosingFairyIntent)
        }
        //ищем переменную
        linkButton = findViewById(R.id.more_tale_button)
        // вешаем слушатель
        linkButton.setOnClickListener {
            val link = Uri.parse("https://deti-online.com/") // переменная для привязки ссылки
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link) // переменная для открытия ссылки в браузере
            val chooser = Intent.createChooser(openBrowserIntent, "Browser") // переменная для чузера
            startActivity(chooser) // показ чузера

        }

    }

}