package com.p4p.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import com.p4p.android.model.RegisterModel
import kotlinx.android.synthetic.main.activity_register.*

/**
 * Created by Krishnaprasad.RS on 12-06-2018.
 */
class RegisterActivity : AppCompatActivity() {
    var name: String ="" ;
    var email: String="";

    var password: String="";
    var confirmpassword: String="";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle(null);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        btnRegisterSubmit.setOnClickListener { v: View? ->

            System.out.println("inside button click");
            if (checkValidation()) {

                /**
                 * Send data to server
                 */

                var data = RegisterModel(name, email, password, confirmpassword)
                val json = Gson().toJson(data)

                Toast.makeText(this, "data" + json.toString(), Toast.LENGTH_LONG).show();

                var intent = Intent(this,AccountVerificationActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Please fill all data", Toast.LENGTH_LONG).show();
            }
        }

        /**
         * Check validation and proceed
         */


    }

    fun checkValidation(): Boolean {
        var status: Boolean = true;

        //read value from EditText to a String variable
        var lName = edtName.text.toString()
        name = lName;
        var lEmail = edtEmail.text.toString()
        email = lEmail

        var lPwd = edtPassword.text.toString()
        password = lPwd
        var lConfirmPwd = edtConfirmPassword.text.toString()
        confirmpassword = lConfirmPwd

        if (lName.trim().length == 0) {
            Toast.makeText(this, "Name is empty" + edtName.text.toString(), Toast.LENGTH_LONG).show()
            status = false;
        } else if (lEmail.trim().length == 0) {
            Toast.makeText(this, "Email is empty", Toast.LENGTH_LONG).show()
            status = false;
        } else if (lPwd.trim().length == 0) {
            Toast.makeText(this, "Passwrord is empty", Toast.LENGTH_LONG).show()
            status = false;
        } else if (lConfirmPwd.trim().length == 0) {
            Toast.makeText(this, "COnfirm Password is empty", Toast.LENGTH_LONG).show()
            status = false;
        }

        return status;

    }

}