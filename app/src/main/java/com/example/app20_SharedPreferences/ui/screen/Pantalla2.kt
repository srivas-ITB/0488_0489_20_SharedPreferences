package com.example.app20_SharedPreferences.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Pantalla2Screen(navigateToThirdScreen: (String) -> Unit) {
    var name by remember { mutableStateOf("") }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "PANTALLA 2", fontSize = 24.sp,
            textDecoration = TextDecoration.Underline, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(60.dp))
        Text(text = "Quin és el teu nom?")
        TextField(value = name, onValueChange = { name = it })
        Button(onClick = { navigateToThirdScreen(name) }) {
            Text(text = "Següent pantalla")
        }
    }
}
