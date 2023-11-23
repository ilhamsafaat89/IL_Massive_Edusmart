package com.dasadarsa.edusmart

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnStart = findViewById<Button>(R.id.button_login)
        val etUsername = findViewById<EditText>(R.id.etext_login1)
        val etPassword = findViewById<EditText>(R.id.etext_login2)

        btnStart.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (isValidCredentials(username, password)){
                val intent =Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else
                Toast.makeText(this,"Email atau Password salah.", Toast.LENGTH_SHORT).show()
            }
        }



    private fun isValidCredentials(username: String, password: String): Boolean {
        val validUsername ="murid"
        val validPassword ="murid123"

        return username == validUsername && password == validPassword

    }
}
