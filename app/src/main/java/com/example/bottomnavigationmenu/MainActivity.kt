package com.example.bottomnavigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottomnavigationmenu.fragments.FavouriteFragement
import com.example.bottomnavigationmenu.fragments.HomeFragement
import com.example.bottomnavigationmenu.fragments.InfoFragement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragement= HomeFragement()
        val favouriteFragement = FavouriteFragement()
        val infoFragement = InfoFragement()

        makeCurrentFragement(homeFragement)
    }

    private fun makeCurrentFragement(fragement: Fragment) = supportFragmentManager.beginTransaction().apply {

    }

}