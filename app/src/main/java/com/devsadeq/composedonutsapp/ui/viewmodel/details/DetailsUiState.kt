package com.devsadeq.composedonutsapp.ui.viewmodel.details

import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

data class DetailsUiState(
    val donut: HomeUiState.Donut? = null,
    val quantity: Int = 1,
)