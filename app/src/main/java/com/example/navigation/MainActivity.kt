package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.data.loginCheck
import com.example.navigation.screen.login.LoginScreen
import com.example.navigation.screen.main.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "login_screen") {
                composable("login_screen") {
                    LoginScreen(onClick = {
                        navController.navigate("main_screen")
                    })
                }
                composable("main_screen") {
                    MainScreen()
                }
            }
        }
    }
}