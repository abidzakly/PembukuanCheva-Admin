package com.gruphijau.inventarischevalier.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.gruphijau.inventarischevalier.R

class SplashScreen : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashLogo::class.java)
            startActivity(intent)
            finish()
        }, 500) // 3000 is the delayed time in milliseconds.
    }
}