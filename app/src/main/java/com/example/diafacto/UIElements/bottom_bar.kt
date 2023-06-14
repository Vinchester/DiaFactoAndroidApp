package com.example.diafacto.UIElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diafacto.R
import com.example.diafacto.screens.Screen

@Composable
fun BottomBar(
    navController: NavController,
    settingsButtonRoute: String = Screen.SettingsScreen.route,
    selectionButtonRoute: String = Screen.SelectionScreen.route
    ) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .width(320.dp)
                .height(150.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
                .paint(painterResource(id = R.drawable.rectangle_21))

        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomStart)
                .graphicsLayer {
                    translationX = 40.dp.toPx()
                    translationY = -60.dp.toPx()
                }
                .clickable {
                    navController.navigate(settingsButtonRoute)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.settings_icon),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomCenter)
                .graphicsLayer {
                    translationY = -60.dp.toPx()
                }
                .clickable {
                    navController.navigate(selectionButtonRoute)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.selection_icon),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomEnd)
                .graphicsLayer {
                    translationX = -40.dp.toPx()
                    translationY = -60.dp.toPx()
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.calendar_icon),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}