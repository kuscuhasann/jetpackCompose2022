package com.pakt_games.jetpackcompose2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pakt_games.jetpackcompose2022.ui.theme.JetpackCompose2022Theme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose2022Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage() {
    Column(
        //horizontalAlignment = Yatayda Hizalama
        horizontalAlignment = Alignment.End,
        //verticalArrangement = Dikeyde Hizalama Yapar
        verticalArrangement = Arrangement.SpaceEvenly,
        //Sayfaya kendini yayar.
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text ="Ana Sayfa",fontSize = 50.sp)

        Button(onClick = {

        }) {
            Text(text = "Hesaplama Sayfasına Git")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose2022Theme {
        MainPage()
    }
}