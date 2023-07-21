package com.devsadeq.composedonutsapp.ui.navigation

import com.devsadeq.composedonutsapp.R

sealed class Screen(
    val route: String,
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int
) {
    object Home : Screen(
        "home",
        "Home",
        R.drawable.ic_home,
        R.drawable.ic_home,
    )

    object Favorites : Screen(
        "favorites",
        "Favorites",
        R.drawable.ic_favorite,
        R.drawable.ic_favorite,
    )

    object Notifications : Screen(
        "notifications",
        "Notifications",
        R.drawable.ic_notification,
        R.drawable.ic_notification,
    )

    object Cart : Screen(
        "cart",
        "Cart",
        R.drawable.ic_buy,
        R.drawable.ic_buy
    )

    object Profile : Screen(
        "profile",
        "Profile",
        R.drawable.ic_profile,
        R.drawable.ic_profile,
    )
}
