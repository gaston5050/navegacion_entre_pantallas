package com.example.pantallasnavegacion.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.pantallasnavegacion.R




@Composable
fun botonera(
    onNavigateToPan1: () -> Unit,
    onNavigateToPan2: () -> Unit,
    onNavigateToPan3: () -> Unit
) {

    @OptIn(ExperimentalMaterial3Api::class)
                TopAppBar(
                    title = { Text( "holaaaaaaa")},


                    actions = {
                        IconButton(onClick = onNavigateToPan1) {
                            Icon(
                                painter = painterResource(R.drawable.uno),
                                contentDescription = "Localized description"
                            )
                        }
                        IconButton(onClick = onNavigateToPan2) {
                            Icon(
                                painter = painterResource(R.drawable.dos),
                                contentDescription = "Localized description"
                            )
                        }
                        IconButton(onClick = onNavigateToPan3) {
                            Icon(
                                painter = painterResource(R.drawable.outline_timer_3_24),
                                contentDescription = "Localized description"
                            )
                        }


                    })

                    }