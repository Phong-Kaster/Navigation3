package com.example.navigationv3.ui.screen.setting

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.navigationv3.ui.core.CoreLayout

@Composable
fun SettingScreen(
    onBack: () -> Unit = {},
) {
    SettingLayout(
        onBack = onBack,
    )
}

@Composable
private fun SettingLayout(
    onBack: () -> Unit = {},
) {
    CoreLayout(
        content = {
            Column() {
                Text(
                    text = "Setting Screen",
                    color = Color.White
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
private fun PreviewSettingLayout() {
    SettingLayout()
}
