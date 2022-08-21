package com.pakt_games.jetpackcompose2022

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterPage() {
    var counter = remember {
        mutableStateOf(0)
    }
    Column(
        //horizontalAlignment = Yatayda Hizalama
        horizontalAlignment = Alignment.End,
        //verticalArrangement = Dikeyde Hizalama Yapar
        verticalArrangement = Arrangement.SpaceEvenly,
        //Sayfaya kendini yayar.
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text ="Sayaç : ${counter.value}")

        Button(onClick = {
            counter.value += 1
        }) {
            Text(text = "Tıkla")
        }
    }
}