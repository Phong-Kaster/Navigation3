package com.example.navigationv3.ui.screen.home

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationv3.ui.core.CoreLayout

@Composable
fun HomeScreen(
    onOpenProduct: () -> Unit = {},
    onOpenSetting: () -> Unit = {},
    onBack: () -> Unit = {},
) {
    HomeScreenLayout(
        onOpenProduct = onOpenProduct,
        onOpenSetting = onOpenSetting,
        onBack = onBack,
    )
}

@Composable
private fun HomeScreenLayout(
    onOpenProduct: () -> Unit = {},
    onOpenSetting: () -> Unit = {},
    onBack: () -> Unit = {},
) {
    CoreLayout(
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    8.dp,
                    alignment = Alignment.CenterVertically,
                )
            ) {
                Text(
                    text = "Home Screen",
                    color = Color.White
                )
                Text(
                    text = "Go to Product",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .clickable {
                            onOpenProduct()
                        }
                )

                Text(
                    text = "Go to Setting",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .clickable {
                            onOpenSetting()
                        }
                )

                Text(
                    text = "Go back",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .clickable {
                            onBack()
                        }
                )
            }

        }
    )
}

@Preview
@Composable
private fun PreviewHomeScreenLayout() {
    HomeScreenLayout()
}