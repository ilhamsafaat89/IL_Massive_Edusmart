package com.dasadarsa.edusmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dasadarsa.edusmart.chat.fragment.ChatFragment
import com.dasadarsa.edusmart.course.CourseFragment
import com.dasadarsa.edusmart.databinding.ActivityMainBinding
import com.dasadarsa.edusmart.home.fragment.HomeFragment
import com.dasadarsa.edusmart.scan.ScanFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.menu_1 -> replaceFragment(HomeFragment())
                R.id.menu_2 -> replaceFragment(CourseFragment())
                R.id.menu_3 -> replaceFragment(ScanFragment())
                R.id.menu_4 -> replaceFragment(ChatFragment())

                else ->{

                }

            }
            true
        }


        }
    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()


    }
}