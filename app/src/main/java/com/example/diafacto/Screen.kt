package com.example.diafacto

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object SelectionScreen: Screen("selection_screen")
}
