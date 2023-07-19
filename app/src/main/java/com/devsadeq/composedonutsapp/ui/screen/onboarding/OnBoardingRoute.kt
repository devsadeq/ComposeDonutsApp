package com.devsadeq.composedonutsapp.ui.screen.onboarding

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val ON_BOARDING_ROUTE = "onboarding"

fun NavController.navigateOnBoarding() {
    navigate(ON_BOARDING_ROUTE)
}

fun NavGraphBuilder.addOnBoardingGraph(navController: NavController) {
    composable(ON_BOARDING_ROUTE) {
        OnBoardingScreen(navController = navController)
    }
}