package com.example.app20_SharedPreferences.ui.navigation.pokemon

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Route: NavKey {
    @Serializable
    data object ListScreen: Route()

    @Serializable
    data class DetailScreen(val id: Int): Route()

    @Serializable
    data object Error: Route()
}