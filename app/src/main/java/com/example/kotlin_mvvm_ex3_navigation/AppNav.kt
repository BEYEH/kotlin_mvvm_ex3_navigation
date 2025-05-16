package com.example.kotlin_mvvm_ex3_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.screenA, builder = {
        composable(Route.screenA) {
            ScreenA(navController)
        }
        composable(Route.screenB + "/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(navController, name ?: "No name")
        }
    })
}