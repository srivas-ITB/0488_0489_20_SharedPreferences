package com.example.app20_SharedPreferences.ui.screen.pokemon

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Pokemon
import com.example.myapplication.domain.PokemonProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListViewModel(): ViewModel() {
    private val provider = PokemonProvider()

    private var _pokemonList = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemonList: StateFlow<List<Pokemon>> = _pokemonList.asStateFlow()

    init {
       _pokemonList.value = provider.getPokemonList()
    }

}