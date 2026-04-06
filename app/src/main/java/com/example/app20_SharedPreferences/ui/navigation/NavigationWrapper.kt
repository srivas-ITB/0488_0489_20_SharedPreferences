package com.example.app20_SharedPreferences.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.app20_SharedPreferences.ui.screen.Pantalla1Screen
import com.example.app20_SharedPreferences.ui.screen.Pantalla2Screen
import com.example.app20_SharedPreferences.ui.screen.Pantalla3Screen

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun NavigationWrapper(){
    val backStack = rememberNavBackStack(Routes.Pantalla1)
    NavDisplay(
        backStack = backStack,
        onBack = {  if (backStack.size > 1) { backStack.removeLast() } },
        entryProvider = entryProvider {
            // definir possibles destinacions
            entry<Routes.Pantalla1> {
                Pantalla1Screen { backStack.add(Routes.Pantalla2) }
            }
            entry<Routes.Pantalla2> {
                Pantalla2Screen { name -> backStack.add(Routes.Pantalla3(name)) }
            }
            entry<Routes.Pantalla3> { key ->
                Pantalla3Screen(key.name) {
                    while (backStack.last() != Routes.Pantalla1) {
                        backStack.removeLast()
                    }
                }
            }
        },
        transitionSpec = {
            when (targetState.key) {
                is Routes.Pantalla3 -> verticalTransition()
                else -> horizontalTransition()
            }
        },
        popTransitionSpec = { verticalPopTransition() }
    )
}

// Funcions on definir les transicions
fun verticalTransition(): ContentTransform {
    return slideInVertically(
        initialOffsetY = { it },
        animationSpec = tween(500)
    ) togetherWith slideOutVertically(
        targetOffsetY = { -it },
        animationSpec = tween(500)
    )
}

fun horizontalTransition(): ContentTransform {
    return slideInHorizontally(
        initialOffsetX = { it },
        animationSpec = tween(500)
    ) togetherWith slideOutHorizontally(
        targetOffsetX = { -it },
        animationSpec = tween(500)
    )

}

fun verticalPopTransition(): ContentTransform {
    return slideInVertically(
        initialOffsetY = { -it },
        animationSpec = tween(500)
    ) togetherWith slideOutVertically(
        targetOffsetY = { it },
        animationSpec = tween(500)
    )
}
