package com.example.shimmer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.visibility = VISIBLE
        backgroundShimmer.visibility = VISIBLE
        Handler().postDelayed(Runnable {
            progressBar.visibility = GONE
            backgroundShimmer.visibility = INVISIBLE
            background.visibility = VISIBLE
        }, 5000L)

    }
}