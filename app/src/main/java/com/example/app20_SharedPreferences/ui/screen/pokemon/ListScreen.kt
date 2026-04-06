package com.example.app20_SharedPreferences.ui.screen.pokemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.data.Pokemon

@Composable
fun ListScreen(navigateToDetail: (Int) -> Unit){
    val viewModel: ListViewModel = viewModel()
    val pokemonList = viewModel.pokemonList.collectAsState()
    LazyColumn(Modifier.fillMaxSize()) {
        items(pokemonList.value) { pokemon ->
            PokemonItem(pokemon) { navigateToDetail(pokemon.id) }
        }
    }
}

@Composable
fun PokemonItem(pokemon: Pokemon, navigateToDetail: (Int) -> Unit){
    Card(
        border = BorderStroke(2.dp, Color.LightGray),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { navigateToDetail(pokemon.id) }){
        Text(text = pokemon.name, Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp))
    }
}