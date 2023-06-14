package com.example.diafacto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.diafacto.ui.theme.background_white

@Composable
fun SettingsScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(background_white)
            .clip(RoundedCornerShape(30.dp))
    ){
        BottomBar(navController = navController, settingsButtonRoute = Screen.MainScreen.route)
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
                    .graphicsLayer {
                        translationY = 100.dp.toPx()
                    }
                    .size(150.dp)
//                    .padding(top = 100.dp)
                    .clip(RoundedCornerShape(150.dp))
                    .border(width = 2.dp, color = Color.Black, shape = CircleShape)

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

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    SettingsScreen(navController = rememberNavController())
}
