package com.devsadeq.composedonutsapp.ui.screen.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val HOME_ROUTE = "home"
fun NavController.navigateHome() {
    navigate(HOME_ROUTE)
}

fun NavGraphBuilder.addHomeGraph(navController: NavController) {
    composable(HOME_ROUTE) {
        HomeScreen(navController = navController)
    }
}