package com.example.navigation.screen.main

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.navigation.buttonNavigation.NavGraph
import com.example.navigation.buttonNavigation.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            Navigation(navController = navController)
        }
    ) {
        NavGraph(navHostController = navController)
    }
}