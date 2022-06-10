package com.example.internshipproject.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.internshipproject.R
import kotlinx.android.synthetic.main.activity_start.*

class startActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        //this one is for hiding taskBar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        button_get_started.setOnClickListener{
            val intent = Intent(this, OnboardingExample1Activity::class.java)
            startActivity(intent)
        }
    }
}