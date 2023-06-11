package com.example.diafacto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.Alignment

@Composable
fun SettingsScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF253541))
            .clip(RoundedCornerShape(30.dp))
            .paint(
                painterResource(id = R.drawable.main_activity_background),
                contentScale = ContentScale.FillBounds
            )
    ){
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
                    navController.navigate(Screen.SelectionScreen.route)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.selection_icon),
                contentDescription = null,
                modifier = modifier
            )
        }
        Box(
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.BottomStart)
                .padding(start = 50.dp, bottom = 50.dp)
                .clickable {
                    navController.navigate(Screen.MainScreen.route)
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_screen),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }

    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box() {
            Text(
                text = "SETTINGS",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp)
            )
        }
    }


    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box() {
            Image(
                painter = painterResource(id = PATH_TO_PHOTO),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 100.dp)
                    .clip(RoundedCornerShape(150.dp))

            )
        }
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box() {
            Text(
                text = "$USER_FIRST_NAME $USER_SURNAME",
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 350.dp)
            )
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun SettingsPreview() {
//    SettingsScreen()
//}
