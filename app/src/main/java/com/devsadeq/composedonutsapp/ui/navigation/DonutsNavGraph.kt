package com.devsadeq.composedonutsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.devsadeq.composedonutsapp.ui.screen.details.addDetailsGraph
import com.devsadeq.composedonutsapp.ui.screen.home.addHomeGraph
import com.devsadeq.composedonutsapp.ui.screen.onboarding.ON_BOARDING_ROUTE
import com.devsadeq.composedonutsapp.ui.screen.onboarding.addOnBoardingGraph

@Composable
fun DonutsNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = ON_BOARDING_ROUTE,
    ) {
        addOnBoardingGraph(navHostController)
        addHomeGraph(navHostController)
        addDetailsGraph(navHostController)
    }
}