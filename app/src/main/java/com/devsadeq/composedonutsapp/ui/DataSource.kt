package com.devsadeq.composedonutsapp.ui

import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.viewmodel.HomeUiState

object DataSource {

    fun getDonuts(): List<HomeUiState.Donut> {
        return listOf(
            HomeUiState.Donut(
                id = 1,
                name = "Strawberry Wheel",
                image = R.drawable.strawberry_wheel,
                price = 16,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = true,
                previousPrice = 20,
            ),
            HomeUiState.Donut(
                id = 2,
                name = "Chocolate Glaze",
                image = R.drawable.chocolate_glaze,
                price = 12,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = true,
                previousPrice = 18,
            ),
            HomeUiState.Donut(
                id = 3,
                name = "Strawberry Wheel",
                image = R.drawable.strawberry_wheel,
                price = 16,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = true,
                previousPrice = 20,
            ),
            HomeUiState.Donut(
                id = 4,
                name = "Chocolate Glaze",
                image = R.drawable.chocolate_glaze,
                price = 12,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = true,
                previousPrice = 18,
            ),
            HomeUiState.Donut(
                id = 5,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = true,
                isOffer = false,
                previousPrice = 30,
            ),
            HomeUiState.Donut(
                id = 6,
                name = "Chocolate Cherry",
                image = R.drawable.chocolate_cherry,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 7,
                name = "Strawberry Rain",
                image = R.drawable.strawberry_rain,
                price = 22,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 8,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 9,
                name = "Chocolate Cherry",
                image = R.drawable.chocolate_cherry,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 10,
                name = "Strawberry Rain",
                image = R.drawable.strawberry_rain,
                price = 22,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 11,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 12,
                name = "Chocolate Cherry",
                image = R.drawable.chocolate_cherry,
                price = 12,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 13,
                name = "Strawberry Rain",
                image = R.drawable.strawberry_rain,
                price = 10,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 14,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 18,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 15,
                name = "Chocolate Cherry",
                image = R.drawable.chocolate_cherry,
                price = 30,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 16,
                name = "Strawberry Rain",
                image = R.drawable.strawberry_rain,
                price = 22,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 17,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 18,
                name = "Chocolate Cherry",
                image = R.drawable.chocolate_cherry,
                price = 22,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 19,
                name = "Strawberry Rain",
                image = R.drawable.strawberry_rain,
                price = 16,
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                isFavorite = true,
                isOffer = false,
                previousPrice = 0,
            ),
            HomeUiState.Donut(
                id = 20,
                name = "Strawberry Coco",
                image = R.drawable.strawberry_coco,
                price = 27,
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                isFavorite = false,
                isOffer = false,
                previousPrice = 0,
            )
        )
    }
}