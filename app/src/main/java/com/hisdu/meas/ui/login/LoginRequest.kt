package com.zest.android.ui.login

data class LoginRequest(
    val userName: String,
    val password: String,
    val grant_type:String
)