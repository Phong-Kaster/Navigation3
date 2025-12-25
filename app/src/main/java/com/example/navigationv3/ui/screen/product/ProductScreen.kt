package com.example.navigationv3.ui.screen.product

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
fun ProductScreen(
    id: String,
    onBack: ()->Unit = {},
) {
    ProductLayout(
        id = id,
        onBack = onBack,
    )
}

@Composable
private fun ProductLayout(
    id: String,
    onBack: () -> Unit = {},
){
    CoreLayout(
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, alignment = Alignment.CenterVertically)
            ) {
                Text(
                    text = "Product screen with id is $id",
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
private fun PreviewProductLayout(){
    ProductLayout(id = "Hello")
}