package com.example.app20_SharedPreferences

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.app20_SharedPreferences.ui.navigation.pokemon.NavigationWrapper_pokemon
import com.example.app20_SharedPreferences.ui.theme.MyApp_Theme


class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition {
            viewModel.isLoading.value
        }
        enableEdgeToEdge()
        setContent {
            MyApp_Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //NavigationWrapper(modifier=Modifier)
                    //Exemple1_sense_ViewModel(modifier=Modifier)
                    //Exemple1_amb_State(modifier=Modifier)
                    //Exemple1_amb_StateFlow(modifier = Modifier)
                    //Exemple2_StudentScreen(modifier = Modifier)
                    NavigationWrapper_pokemon(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}



/// TODO
/// Verificar que las 3 versions de pokemon es poden restaurar