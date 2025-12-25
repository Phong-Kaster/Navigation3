package com.example.navigationv3.ui.navigation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.example.navigationv3.ui.screen.home.HomeScreen
import com.example.navigationv3.ui.screen.product.ProductScreen
import com.example.navigationv3.ui.screen.setting.SettingScreen
import com.example.navigationv3.ui.screen.splash.SplashScreen


/**
 * [Display the back stack](https://developer.android.com/guide/navigation/navigation-3/basics)
 */
@Composable
fun NavHost() {
    val TAG = "Navigation v3"
    //val backStack = remember { mutableStateListOf<Any>(NavigationKey.Splash) }

    val backStack = rememberNavBackStack(Splash)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryDecorators = listOf(
            // Add the default decorators for managing scenes and saving state
            rememberSaveableStateHolderNavEntryDecorator(),
            // Then add the view model store decorator
            rememberViewModelStoreNavEntryDecorator()
        ),
        entryProvider = entryProvider {
            entry<Splash> { key ->
                SplashScreen(
                    onOpenHome = { backStack.add(Home) }
                )
            }

            entry<Home> { key ->
                HomeScreen(
                    onOpenProduct = {
                        backStack.add(Product("Hello Phong-Kaster ^^"))
                    },
                    onOpenSetting = {
                        backStack.add(Setting)
                    },
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<Product> { key ->
                ProductScreen(
                    id = key.id,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<Setting> { key ->
                SettingScreen(
                    onBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}
