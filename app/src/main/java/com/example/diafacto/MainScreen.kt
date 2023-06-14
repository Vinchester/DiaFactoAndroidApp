package com.example.diafacto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.diafacto.ui.theme.background_white
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(background_white)
    ) {

        BottomBar(navController = navController)
    }

    val tasksFilling = listOf(
        mapOf("subject" to "Programming", "theme" to "Domino", "link" to "https://classroom/.."),
        mapOf("subject" to "Programming", "theme" to "Matrix", "link" to "https://classroom/.."),
        mapOf("subject" to "Programming", "theme" to "MarkDown", "link" to "https://classroom/..")
    )

    val cards = tasksFilling.map { task ->
        taskCard(
            subject = task["subject"] as String,
            theme = task["theme"] as String,
            link = task["link"] as String
        )
    }

    val pagerState = rememberPagerState()

    Row(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .graphicsLayer {
                translationY = (-30).dp.toPx()
            }
    ) {
        Box(
            modifier = Modifier
                .width(320.dp)
                .height(500.dp)
                .align(CenterVertically)
        ) {
            HorizontalPager(
                count = cards.size,
                state = pagerState,
            ) { index ->
                cards[index]()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(navController = rememberNavController())
}