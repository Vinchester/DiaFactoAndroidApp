package com.example.diafacto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.diafacto.ui.theme.background_white

@Composable
fun SelectionScreen(navController: NavController) {
    val tasks: Array<String> = arrayOf("Mathematics", "UNIX", "Algorithms", "Programming")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(background_white)
    ) {
        BottomBar(navController = navController, selectionButtonRoute = Screen.MainScreen.route)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    translationY = 60.dp.toPx()
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            tasks.forEach { buttonText ->
                Button(
                    colors = ButtonDefaults.buttonColors(Color.White),
                    onClick = { /* Действие при нажатии кнопки */ },
                    shape = CutCornerShape(1.dp),
                    modifier = Modifier
                        .width(320.dp)
                        .height(75.dp)
                        .padding(top = 15.dp)
                        .shadow(5.dp)
                        .clip(shape = RoundedCornerShape(10.dp))

                ) {
                    Text(text = buttonText, fontSize = 20.sp, color = Color.Black)
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun SelectionPreview() {
    SelectionScreen(navController = rememberNavController())
}