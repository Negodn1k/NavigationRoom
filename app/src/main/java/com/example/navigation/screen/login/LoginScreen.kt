package com.example.navigation.screen.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.navigation.data.MainViewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onClick : () -> Unit,
    mainViewModel: MainViewModel = viewModel(factory = MainViewModel.factory)
) {
    val listItems = mainViewModel.itemsList.collectAsState(initial = emptyList())

    var login = ""
    var password = ""
    var passwordView = ""

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        TextField(value = login, onValueChange = {
            login = it
        }, label = { Text("Login") }, placeholder = { Text(text = "Login") },
            modifier = Modifier.padding(10.dp)
        )
        TextField(value = passwordView, onValueChange = {
            password = it
            passwordView = "*".repeat(password.length)
        }, label = { Text(text = "Password") }, placeholder = { Text(text = "Password") })

        Card(
            modifier = Modifier
                .background(Color.Cyan)
                .clickable {
                    onClick()
                }
                .padding(10.dp)
                .width(200.dp)
                .height(50.dp)
        ) {
            Text(text = "Login")
        }
    }
}
