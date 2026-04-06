package com.example.app20_SharedPreferences.ui.theme

data class CheckInfo(
    val title: String,
    var checked: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)
