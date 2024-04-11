package com.example.navigation.screen.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screen1() {
    firstScreen()
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier.fillMaxSize(),
        text = "Screen 2",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier.fillMaxSize(),
        text = "Screen 3",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen4() {
    Text(
        modifier = Modifier.fillMaxSize(),
        text = "Screen 4",
        textAlign = TextAlign.Center
    )
}