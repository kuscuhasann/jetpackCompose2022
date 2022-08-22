package com.pakt_games.jetpackcompose2022

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson

@Composable
fun MainPage(navController: NavController) {
    Column(
        //horizontalAlignment = Yatayda Hizalama
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Dikeyde Hizalama Yapar
        verticalArrangement = Arrangement.Center,
        //Sayfaya kendini yayar.
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text ="Ana Sayfa",fontSize = 50.sp)

        Button(onClick = {
            val customerModel = Customer(1, "Hasan", "Kuşçu", 1001)
            val customerJson = Gson().toJson(customerModel)
            navController.navigate("counterPage/$customerJson") {
                popUpTo("mainPage") { inclusive = true }
            }
        }) {
            Text(text = "Hesaplama Sayfasına Git")
        }
    }
}