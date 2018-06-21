package com.p4p.android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.mytoolbar.*

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle(null);
        txtToolBarHeading.setText("Forgot Password")
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


    }

}
