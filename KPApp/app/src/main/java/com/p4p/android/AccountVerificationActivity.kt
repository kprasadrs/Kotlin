package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_account_verify.*

/**
 * Created by Krishnaprasad.RS on 13-06-2018.
 */
class AccountVerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_verify)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle(null);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        btnContinue.setOnClickListener {  v: View? ->
            var intent = Intent(this,ChooseAccountTypeActivity::class.java)
            startActivity(intent)
        }

    }
}