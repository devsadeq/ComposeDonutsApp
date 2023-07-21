package com.devsadeq.composedonutsapp.ui.viewmodel.home

import androidx.lifecycle.ViewModel
import com.devsadeq.composedonutsapp.ui.DataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getTodayOffers()
        getDonuts()
    }

    private fun getTodayOffers() {
        _state.update {
            it.copy(
                todayOffers = DataSource.getDonuts().filter { donut -> donut.isOffer }
            )
        }
    }

    private fun getDonuts() {
        _state.update {
            it.copy(donuts = DataSource.getDonuts().filter { donut -> !donut.isOffer })
        }
    }

    fun onFavoriteClicked(id: Int) {
        _state.update {
            it.copy(todayOffers = it.todayOffers.map { donut ->
                if (donut.id == id) {
                    donut.copy(isFavorite = !donut.isFavorite)
                } else {
                    donut
                }
            })
        }
    }
}