package com.devsadeq.composedonutsapp.ui.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.devsadeq.composedonutsapp.ui.navigation.DonutsNavGraph
import com.devsadeq.composedonutsapp.ui.navigation.Screen
import com.devsadeq.composedonutsapp.ui.screen.details.DETAILS_ROUTE
import com.devsadeq.composedonutsapp.ui.screen.onboarding.ON_BOARDING_ROUTE

@Composable
fun DonutsApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { DonutsBottomBar(navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            DonutsNavGraph(navHostController = navController)
        }
    }
}

@Composable
fun DonutsBottomBar(navController: NavHostController) {
    val currentRoute by navController.currentBackStackEntryAsState()
    val items = listOf(
        Screen.Home,
        Screen.Favorites,
        Screen.Cart,
        Screen.Notifications,
        Screen.Profile,
    )

    if (currentRoute?.destination?.route != "details/{id}" && currentRoute?.destination?.route != ON_BOARDING_ROUTE)
        BottomNavigation(
            modifier = Modifier.height(80.dp),
            backgroundColor = Color.White,
            elevation = 0.dp,
        ) {
            items.forEach { screen ->
                AddItem(screen = screen)
            }
        }
}

@Composable
private fun RowScope.AddItem(screen: Screen) {
    BottomNavigationItem(
        selected = true,
        onClick = {},
        icon = {
            Icon(
                painter = painterResource(screen.selectedIcon),
                contentDescription = null,
                modifier = Modifier.size(36.dp),
                tint = Color(0xFFFF7074)
            )
        },
        label = null,
        alwaysShowLabel = false,
    )
}