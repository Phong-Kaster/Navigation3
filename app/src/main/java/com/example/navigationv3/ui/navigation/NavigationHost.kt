package com.example.navigationv3.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
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
 * 1.In Navigation 3, the back stack does not actually contain content. Instead, it contains references to content,
 * known as keys. Keys can be any type but are usually simple, serializable data classes.
 *
 * 2. NavEntry, which is a class containing a composable function. It represents a destination - a
 * single piece of content that the user can navigate forward to and back from.
 *
 *
 */
@Composable
fun NavigationHost() {
    val TAG = "Navigation v3"

    val backStack = rememberNavBackStack(Splash)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryDecorators = listOf(
            // Add the default decorators for managing scenes and saving state
            rememberSaveableStateHolderNavEntryDecorator(),

            // Then add the view model store decorator - https://developer.android.com/guide/navigation/navigation-3/save-state#scoping-viewmodels
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
