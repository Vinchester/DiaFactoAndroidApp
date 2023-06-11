package com.example.diafacto

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SelectionScreen(navController: NavController) {
    val tasks: Array<String> = arrayOf("Mathematics", "UNIX", "Algorithms", "Programming")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.main_activity_background),
                contentScale = ContentScale.FillBounds
            )
    )
        {
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.BottomEnd)
                    .padding(end = 50.dp, bottom = 50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.calendar_icon),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.BottomCenter)
                    .padding(start = 25.dp, bottom = 50.dp)
                    .clickable {
                        navController.navigate(Screen.MainScreen.route)
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_screen),
                    contentDescription = null
                )
            }
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.BottomStart)
                    .padding(start = 50.dp, bottom = 50.dp)
                    .clickable {
                        navController.navigate(Screen.SettingsScreen.route)
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.settings_icon),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            tasks.forEach { buttonText ->
                Button(
                    onClick = { /* Действие при нажатии кнопки */ },
                    shape = CutCornerShape(10),
                    modifier = Modifier
                        .width(300.dp)
                        .height(60.dp)
                        .padding(top = 5.dp)
                ) {
                    Text(text = buttonText, fontSize = 20.sp)
                }
            }
        }
    }
}




//@Preview(showBackground = true)
//@Composable
//fun SelectionPreview() {
//    SelectionScreen()
//}