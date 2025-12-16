package com.example.pantallasnavegacion.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pantallasnavegacion.R


@Composable
fun pantalla2(){

    Column(modifier = Modifier.fillMaxWidth().
    fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Text (text = "Pantalla 2",
            fontSize =40.sp )
        Image(painter = painterResource(id = R.drawable.img2
        ),
            contentDescription = "Imagen1",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    pantalla2()
}
