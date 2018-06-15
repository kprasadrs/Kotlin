package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_choose_account_type.*

/**
 * Created by Krishnaprasad.RS on 13-06-2018.
 */
class ChooseAccountTypeActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_account_type)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle(null);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        btnEmployee.setOnClickListener { v: View? ->

            /**
             *
             */

            var selectedType :Int = 1;

            var intent = Intent(this, HomeEmployerActivity::class.java)
            intent.putExtra("type", "employee")
            startActivity(intent)


        }
        btnEmployer.setOnClickListener { v: View? ->

            /**
             *
             */

            var selectedType :Int = 2;

            var intent = Intent(this, HomeEmployerActivity::class.java)
            intent.putExtra("type", "employer")

            startActivity(intent)


        }


    }
}