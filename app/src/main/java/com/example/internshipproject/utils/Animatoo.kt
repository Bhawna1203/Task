package com.example.internshipproject.utils

import android.app.Activity
import android.content.Context
import com.example.internshipproject.R


object Animatoo {


    fun animateSlideLeft(context: Context) {
        (context as Activity).overridePendingTransition(
            R.anim.animate_slide_left_enter,
            R.anim.animate_slide_left_exit
        )
    }



}