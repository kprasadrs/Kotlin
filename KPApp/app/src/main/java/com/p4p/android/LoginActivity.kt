package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.mytoolbar.*

/**
 * Created by Krishnaprasad.RS on 12-06-2018.
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle(null);
        txtToolBarHeading.setText("Login Screen")
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        txtForgotPassword.setMovementMethod(LinkMovementMethod.getInstance());

        txtForgotPassword.setOnClickListener { v: View? ->

            var intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent);

        }
        btnLoginSubmit.setOnClickListener { v: View? ->

            val login = edtEmail.text.trim().toString()
            System.out.println("current edittext is " + login)
            if (login.equals("kp")) {
                var intent = Intent(this, HomeEmployerActivity::class.java)
                startActivity(intent)
            } else {
                var intent = Intent(this, EmployeeHomeActivity::class.java)
                startActivity(intent)
            }

        }
    }
}