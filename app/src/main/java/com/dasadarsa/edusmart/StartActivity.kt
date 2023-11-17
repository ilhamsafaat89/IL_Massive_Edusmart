package com.dasadarsa.edusmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class StartActivity : AppCompatActivity() {

    val SPLASH_DELAY: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_start)
        Handler().postDelayed({
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
                finish() // Optional: Jika Anda ingin menutup LoginActivity setelah pindah ke MainActivity
            }
        }, SPLASH_DELAY)
        }
    }
