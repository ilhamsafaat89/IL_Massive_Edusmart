package com.dasadarsa.edusmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_start)

        val btnLoginSiswa: Button = findViewById(R.id.btnLoginSiswa)
        val btnLoginOrtu: Button = findViewById(R.id.btnLoginOrtu)

        btnLoginSiswa.setOnClickListener{
           val intent = Intent(this@StartActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        }
    }
