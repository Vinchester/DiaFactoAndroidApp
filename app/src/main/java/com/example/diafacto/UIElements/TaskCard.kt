package com.example.diafacto.UIElements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diafacto.ui.theme.gelasio


@Composable
fun taskCard(subject: String, theme: String, link: String): @Composable () -> Unit {
    return {
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
                    .background(color = Color.White)
                    .shadow(elevation = 5.dp)
                    .width(320.dp)
                    .height(500.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "Subject:",
                    fontSize = 22.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 50.dp.toPx()
                        }
                )
                Text(
                    text = subject,
                    fontSize = 30.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 70.dp.toPx()
                        }
                )
                Text(
                    text = "Theme:",
                    fontSize = 22.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 130.dp.toPx()
                        }
                )
                Text(
                    text = theme,
                    fontSize = 30.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 150.dp.toPx()
                        }
                )
                Text(
                    text = "Link:",
                    fontSize = 22.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 230.dp.toPx()
                        }
                )
                Text(
                    text = link,
                    fontSize = 30.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 250.dp.toPx()
                        }
                )
                Text(
                    text = "Start date:",
                    fontSize = 20.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 340.dp.toPx()
                        }
                )
                Text(
                    text = "22 june",
                    fontSize = 26.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 360.dp.toPx()
                        }
                )
                Text(
                    text = "Deadline:",
                    fontSize = 20.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 400.dp.toPx()
                        }
                )
                Text(
                    text = "26 june",
                    fontSize = 26.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 30.dp.toPx()
                            translationY = 420.dp.toPx()
                        }
                )
                Text(
                    text = "Done:",
                    fontSize = 20.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 230.dp.toPx()
                            translationY = 400.dp.toPx()
                        }
                )
                Text(
                    text = "6/9",
                    fontSize = 26.sp,
                    fontFamily = gelasio,
                    modifier = Modifier
                        .graphicsLayer {
                            translationX = 230.dp.toPx()
                            translationY = 420.dp.toPx()
                        }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCardPreview() {
    taskCard(subject = "Programming", theme = "Matrix", link = "https://classroom/..")()
}