package com.example.diafacto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diafacto.ui.theme.DiaFactoTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiaFactoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetMainActivityView("Android")
                }
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setSystemBarsColor(color = Color(red = 56, green = 80, blue = 97))
//                    systemUiController.isStatusBarVisible = false
                }
            }

        }
    }
}


@Composable
fun SetMainActivityView(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF253541))
            .clip(RoundedCornerShape(30.dp))
            .paint(
                painterResource(id = R.drawable.main_activity_background),
                contentScale = ContentScale.FillBounds
            )
    ) {
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
                .align(Alignment.BottomStart)
                .padding(start = 50.dp, bottom = 50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.settings_icon),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.BottomCenter)
                .padding(start = 25.dp, bottom = 50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.selection_icon),
                contentDescription = null,
                modifier = modifier
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiaFactoTheme {
        SetMainActivityView("Android")
    }
}