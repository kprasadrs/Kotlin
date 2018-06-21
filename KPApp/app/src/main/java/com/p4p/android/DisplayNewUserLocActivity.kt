package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Visibility
import android.view.View
import kotlinx.android.synthetic.main.mytoolbar.*

/**
 * Created by Krishnaprasad.RS on 18-06-2018.
 */
class DisplayNewUserLocActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_user_location)
        setSupportActionBar(toolbar)

        getSupportActionBar()?.setTitle(null);
        txtToolBarHeading.setText("Your Location")
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        txtNext.visibility = View.VISIBLE
        txtNext.setOnClickListener { v: View? ->

            var intent = Intent(this, ChooseAccountTypeActivity::class.java)
            startActivity(intent)
        }
    }
}