package com.example.pantallasnavegacion.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PantallaMenu(
    onBoton1Click: () -> Unit,
    onBoton2Click: () -> Unit,
    onBoton3Click: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        botonera()
        Text(text = "Elige una opción:", modifier = Modifier.padding(bottom = 32.dp))

        Button(onClick = onBoton1Click, modifier = Modifier.padding(8.dp)) {
            Text("Ir a Pantalla 1")
        }
        Button(onClick = onBoton2Click, modifier = Modifier.padding(8.dp)) {
            Text("Ir a Pantalla 2")
        }
        Button(onClick = onBoton3Click, modifier = Modifier.padding(8.dp)) {
            Text("Ir a Pantalla 3")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun botonera(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Small Top App Bar")
                }
            )
        },
    ) { innerPadding ->
        ScrollContent(innerPadding)
    }

    /*
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.TopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Menu Principal")
                }
            )
        }
        bottomBar = {
            Text(text = "Pantalla 1")
        }
    ){
        innerPadding -> Modifier.padding(innerPadding)



    }
*/


}



@Preview(showBackground = true)
@Composable
fun PantallaMenuPreview(){
    PantallaMenu(
        onBoton1Click = {},
        onBoton2Click = {},
        onBoton3Click = {})

}