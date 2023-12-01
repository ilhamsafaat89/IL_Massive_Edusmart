package com.dasadarsa.edusmart.ortu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.ortu.home.HomeWaliFragment
import com.dasadarsa.edusmart.databinding.ActivityWaliMainBinding

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
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_menu, menu)
        return true
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()
    }
}