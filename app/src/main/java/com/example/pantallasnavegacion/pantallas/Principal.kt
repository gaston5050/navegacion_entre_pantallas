package com.example.pantallasnavegacion.pantallas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantallasnavegacion.R

enum class Screen(val ruta: String) {
    Menu("Menu Principal"),
    Pan1("Pantalla1"),
    Pan2("Pantalla2"),
    Pan3("Pantalla3");

}

@Composable
fun NavegacionConEnum() {

    val navController = rememberNavController()

    Scaffold(
        topBar = {
            botonera(
                onNavigateToPan1 = { navController.navigate(Screen.Pan1.ruta) },
                onNavigateToPan2 = { navController.navigate(Screen.Pan2.ruta) },
                onNavigateToPan3 = { navController.navigate(Screen.Pan3.ruta) }
            )
            // Al navegar, pasamos la ruta definida en el enum

        })
     { innerPadding ->

            NavHost(
                navController = navController,
                // Usamos la propiedad .ruta del enum
                startDestination = Screen.Menu.ruta,
                modifier = Modifier.padding(innerPadding)
            ) {

                // --- MENÚ PRINCIPAL ---
                composable(route = Screen.Menu.ruta) {

                }
                composable(route = Screen.Pan1.ruta) { pantalla1() }
                composable(route = Screen.Pan2.ruta) { pantalla2() }
                composable(route = Screen.Pan3.ruta) { pantalla3() }


            }
        }
}
