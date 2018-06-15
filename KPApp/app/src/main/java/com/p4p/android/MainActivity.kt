package com.p4p.android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Show Mainactivity
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
       // supportActionBar.setDisplayShowHomeEnabled(false)
        getSupportActionBar()?.setTitle(null);
       // getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        btnLogin.setOnClickListener { v ->

            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        btnRegister.setOnClickListener { v: View? ->
            var intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
