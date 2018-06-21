package com.p4p.android.model

/**
 * Created by Krishnaprasad.RS on 13-06-2018.
 */
/*class RegisterModel {
    //https://segunfamisa.com/posts/using-retrofit-on-android-with-kotlin
    https://medium.com/@elye.project/kotlin-and-retrofit-2-tutorial-with-working-codes-333a4422a890
    var name: String? = ""
    var email: String? = ""
    var password: String? = ""
    var confirmPassword: String? = ""*/

data class RegisterModel(
        val name: String,
        val email: String,
        val password: String,
        val confirmPassword: String

)

//var confirmPassword: List<String>? = null
// constructor() : this("", "", "", "")




