package com.example.navigation.data

import androidx.compose.runtime.Composable

@Composable
fun loginCheck(
    password: String,
    dataPass: String
) : Boolean{


    if (password == dataPass) {
        return true
    }
    return false
}