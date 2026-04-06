package com.example.app20_SharedPreferences.ui.screen.pokemon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.app20_SharedPreferences.data.preferences.SettingsRepository

@Composable
fun DetailScreen(id: Int, navigateBack: () -> Unit){
    val viewModel: DetailViewModel = viewModel(
        key = id.toString(),
        factory = DetailViewModelFactory(id, SettingsRepository(LocalContext.current))
    )

    val pokemon = viewModel.pokemon.collectAsState()
    val pokemonAnterior = viewModel.pokemonAnterior.collectAsState()


    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Pokemon Actual: " + (pokemon.value?.name ?: "Unknown"))
        Text(text = "Pokemon Anterior: " + (pokemonAnterior.value?.name ?: "Unknown"))
        Button(onClick = navigateBack) {
            Text("Return to list")
        }

    }
}