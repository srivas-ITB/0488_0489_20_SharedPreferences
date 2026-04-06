package com.example.app20_SharedPreferences.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Pantalla3Screen(name: String, navigateBack: () -> Unit) {
    Column(
        Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "PANTALLA 3", fontSize = 24.sp,
            textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(60.dp))
        Text("Your name is $name", fontSize = 20.sp)
        Button(onClick = { navigateBack() }) {
            Text(text = "Tornar a la pantalla 1")
        }
    }
}
