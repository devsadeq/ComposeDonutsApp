package com.devsadeq.composedonutsapp.ui.screen.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

const val DETAILS_ROUTE = "details"

fun NavController.navigateDetails(id: Int) {
    navigate("$DETAILS_ROUTE/$id")
}

fun NavGraphBuilder.addDetailsGraph(navController: NavController) {
    composable(
        route = "$DETAILS_ROUTE/{id}",
        arguments = listOf(
            navArgument("id") {
                type = NavType.IntType
            }
        )
    ) {
        DetailsScreen(navController = navController)
    }
}