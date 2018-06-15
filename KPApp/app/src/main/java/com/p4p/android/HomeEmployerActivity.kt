package com.p4p.android

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.p4p.android.fragments.CreateTaskFragment
import com.p4p.android.fragments.MyWorksFragment
import android.R.attr.fragment
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.app_bar_main2.*


/**
 * Created by Krishnaprasad.RS on 13-06-2018.
 */
class HomeEmployerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Configure action bar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "My Home Screen"


        // Configure the drawer layout to add listener and show icon on toolbar
        toggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        displayFragments(R.id.nav_camera);
        nav_view.setNavigationItemSelectedListener {
            displayFragments(it.itemId)


            // Close the drawer
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }

    private val toggle: ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(this, drawer_layout, R.string.drawer_open, R.string.drawer_close)
    }


    // Extension function to show toast message easily
    private fun Context.toast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun displayFragments(itemId: Int) {

        var fragment: Fragment? = null

        when (itemId) {
            R.id.nav_camera -> {
                fragment = CreateTaskFragment()

            }
            R.id.nav_gallery -> {
                fragment = MyWorksFragment()

            }

        }

        if (fragment != null) {
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.content_frame, fragment)
            ft.commit()
        }
        drawer_layout.closeDrawer(GravityCompat.START);
    }
}