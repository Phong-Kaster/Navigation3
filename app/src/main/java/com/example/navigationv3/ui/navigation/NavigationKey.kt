package com.example.navigationv3.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

/**
 * [Display the back stack](https://developer.android.com/guide/navigation/navigation-3/basics)
 *
 * [Save your back stack](https://developer.android.com/guide/navigation/navigation-3/save-state#save-back)
 */

@Serializable
data object Splash : NavKey

@Serializable
data object Home : NavKey
@Serializable
data object Setting : NavKey
@Serializable
data class Product(val id: String) : NavKey

