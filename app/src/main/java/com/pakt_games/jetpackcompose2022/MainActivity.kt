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
import androidx.navigation.NavArgument
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
                    DirectionControl()
                }
            }
        }
    }
}

@Composable
fun DirectionControl() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "mainPage") {
        composable("mainPage") {
            MainPage(navController = navController)
        }
        composable("counterPage/{customerName}",arguments = listOf(
            navArgument("customerName") {type = NavType.StringType }
        )) {
            val customerName = it.arguments?.getString("customerName")!!
            CounterPage(customerName = customerName)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose2022Theme {
    }
}