package com.p4p.android.model

/**
 * Created by Krishnaprasad.RS on 13-06-2018.
 */
class RegisterModel {
    var name: String? = null
    var email: String? = null
    var password: String? = null
    var confirmPassword: String? = null

    //var confirmPassword: List<String>? = null
    constructor() : super() {}
    constructor(name: String, email: String, password: String,confirm:String) : super() {
        this.name = name
        this.email = email
        this.password = password
        this.confirmPassword = confirm
    }
}
