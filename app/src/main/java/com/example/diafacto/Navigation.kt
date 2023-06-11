package com.example.diafacto

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route ){
        composable( route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.SelectionScreen.route
        ) { entry ->
            SelectionScreen(navController = navController)
        }
        composable(
            route = Screen.SettingsScreen.route
        ) { entry ->
            SettingsScreen(navController = navController)
        }
        composable(
            route = Screen.MainScreen.route
        ) { entry ->
            MainScreen(navController = navController)
        }
    }
}
