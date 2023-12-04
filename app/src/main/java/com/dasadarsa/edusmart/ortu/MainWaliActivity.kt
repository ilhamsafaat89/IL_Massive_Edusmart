package com.dasadarsa.edusmart.ortu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.chat.fragment.ChatFragment
import com.dasadarsa.edusmart.ortu.home.HomeWaliFragment
import com.dasadarsa.edusmart.databinding.ActivityWaliMainBinding
import com.dasadarsa.edusmart.ortu.absensi.AbsensiWaliFragment
import com.dasadarsa.edusmart.ortu.nilai.NilaiWaliFragment


class MainWaliActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWaliMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWaliMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeWaliFragment())

        setSupportActionBar(binding.actionBarHomeWali)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.edusmart_logo_1)

        binding.bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.menu_1 -> replaceFragment(HomeWaliFragment())
                R.id.menu_2 -> replaceFragment(AbsensiWaliFragment())
                R.id.menu_3 -> replaceFragment(NilaiWaliFragment())
                R.id.menu_4 -> replaceFragment(ChatFragment())

                else ->{

                }

            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_menu_wali, menu)
        return true
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}