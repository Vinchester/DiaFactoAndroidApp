package com.example.diafacto.screens

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object SelectionScreen: Screen("selection_screen")
    object SettingsScreen: Screen("settings_screen")
}
