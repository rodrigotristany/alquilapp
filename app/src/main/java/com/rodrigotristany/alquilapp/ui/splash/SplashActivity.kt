package com.rodrigotristany.alquilapp.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.rodrigotristany.alquilapp.R
import com.rodrigotristany.alquilapp.ui.home.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        this.navigateToActivity()
    }

    private fun navigateToActivity() {
        var intent = Intent(this, MainActivity::class.java)
        val handler = Handler()
        handler.postDelayed({
            startActivity(intent)
        }, 2000)
    }
}
