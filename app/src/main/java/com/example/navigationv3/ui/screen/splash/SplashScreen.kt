package com.example.navigationv3.ui.screen.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.navigationv3.ui.core.CoreLayout

@Composable
fun SplashScreen(
    onOpenHome: () -> Unit = {},
) {
    SplashLayout(
        onOpenHome = onOpenHome
    )
}

@Composable
private fun SplashLayout(
    onOpenHome: () -> Unit = {}
) {
    CoreLayout(
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Splash Screen",
                    color = Color.White,
                    fontSize = 18.sp
                )
                Text(
                    text = "Go to Home",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .clickable {
                            onOpenHome()
                        }
                )
            }

        }
    )
}

@Preview
@Composable
private fun PreviewSplashLayout() {
    SplashLayout()
}