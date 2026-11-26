package com.example.viewpagerapp_fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var viewPager2 : ViewPager2
    lateinit var tabLayout1 : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        viewPager2 = findViewById(R.id.viewpager2)
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL)

        val adapter = MyViewPageAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        tabLayout1 = findViewById(R.id.tableLayout)

        val tableyoutMediator = TabLayoutMediator(tabLayout1, viewPager2, )
        /**
         * tab - scheda corrente
         * position - posizione del fragment all'interno del viewpager
         */
        { tab, position ->
            when (position){
                0 -> tab.text = "Fragment 1"
                1 -> tab.text = "Fragment 2"
                2 -> tab.text = "Fragment 3"
            }
        }.attach()




    }



}