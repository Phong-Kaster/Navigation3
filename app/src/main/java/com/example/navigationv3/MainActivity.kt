package com.example.navigationv3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.navigationv3.ui.navigation.NavigationHost
import com.example.navigationv3.ui.theme.NavigationV3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationV3Theme {
                NavigationHost()
            }
        }
    }
}