package com.example.navigation.buttonNavigation

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun Navigation(navController: NavController) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )
    NavigationBar(
        Modifier.background(Color.White)
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach {
            NavigationBarItem(
                selected = currentRoute == it.route, onClick = {
                    navController.navigate(it.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = it.iconId),
                        contentDescription = ""
                    )
                },
                label = {
                    Text(text = it.title, fontSize = 9.sp)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Red,
                    selectedTextColor = Color.Red,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )
        }
    }
}