package com.example.navigation.data

import android.app.Application

class App : Application() {
    val dataBase by lazy { CreateDataBase.create(this) }
}