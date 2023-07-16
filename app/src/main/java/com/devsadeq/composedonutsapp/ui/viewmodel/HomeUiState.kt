package com.devsadeq.composedonutsapp.ui.viewmodel

data class HomeUiState(
    val todayOffers: List<Donut> = emptyList(),
    val donuts: List<Donut> = emptyList(),
) {
    data class Donut(
        val id: Int,
        val name: String,
        val image: Int,
        val price: Int,
        val description: String,
        val isFavorite: Boolean = false,
        val isOffer: Boolean = false,
        val previousPrice: Int = 0,
    )
}
