package com.dasadarsa.edusmart.ortu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.dasadarsa.edusmart.R

class LoginWaliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_wali)

        val btnStart = findViewById<Button>(R.id.button_login_wali)
        val etUsernameWali = findViewById<EditText>(R.id.etext_login_wali1)
        val etPasswordWali = findViewById<EditText>(R.id.etext_login_wali2)
        btnStart.setOnClickListener {
            val username = etUsernameWali.text.toString()
            val password = etPasswordWali.text.toString()

            if (isValidCredentials(username, password)){
                val intent = Intent(this, MainWaliActivity::class.java)
                startActivity(intent)
                finish()
            }else
                Toast.makeText(this,"Email atau Password salah.", Toast.LENGTH_SHORT).show()
        }
    }


    private fun isValidCredentials(username: String, password: String): Boolean {
        val validUsername ="wali"
        val validPassword ="wali123"

        return username == validUsername && password == validPassword

        }
}