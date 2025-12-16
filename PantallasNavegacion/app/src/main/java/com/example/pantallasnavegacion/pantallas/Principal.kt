package com.example.pantallasnavegacion.pantallas

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screen(val ruta: String) {
    Menu("Menu Principal"),
    Pan1("Pantalla 1"),
    Pan2("Pantalla 2"),
    Pan3("Pantalla 3");

}

@Composable
fun NavegacionConEnum() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        // Usamos la propiedad .ruta del enum
        startDestination = Screen.Menu.ruta
    ) {

        // --- MENÚ PRINCIPAL ---
        composable(route = Screen.Menu.ruta) {
            Menu(
                // Al navegar, pasamos la ruta definida en el enum
                onBoton1Click = { navController.navigate(Screen.Pan1.ruta) },
                onBoton2Click = { navController.navigate(Screen.Pan2.ruta) },
                onBoton3Click = { navController.navigate(Screen.Pan3.ruta) }
            )
        }
        composable(route = Screen.Pan1.ruta) {
            PantallaDestino()
        }


}