package com.example.app20_SharedPreferences.ui.navigation.pokemon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.app20_SharedPreferences.ui.screen.pokemon.DetailScreen
import com.example.app20_SharedPreferences.ui.screen.pokemon.ListScreen

@Composable
fun NavigationWrapper_pokemon(modifier: Modifier) {
    val backStack = rememberNavBackStack(Route.ListScreen)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.ListScreen> {
                ListScreen { id -> backStack.add(Route.DetailScreen(id)) }
            }
            entry<Route.DetailScreen> { key->
                DetailScreen(key.id) {
                    backStack.removeLastOrNull()
                }
            }
            entry<Route.Error> { Text("Error") }
        }

    )

}
