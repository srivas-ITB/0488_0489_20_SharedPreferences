package com.example.app20_SharedPreferences.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {
    @Serializable
    data object Pantalla1: Routes() // Objects quan no passem paràmetres
    @Serializable
    data object Pantalla2: Routes()
    @Serializable
    data class Pantalla3(val name: String): Routes() // Class quan passem paràmetres
}
