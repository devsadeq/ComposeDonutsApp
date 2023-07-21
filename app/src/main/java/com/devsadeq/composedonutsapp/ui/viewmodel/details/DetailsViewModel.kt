package com.devsadeq.composedonutsapp.ui.viewmodel.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.devsadeq.composedonutsapp.ui.DataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = MutableStateFlow(DetailsUiState())
    val state = _state.asStateFlow()

    private val arg = savedStateHandle.get<Int>("id") ?: 0

    init {
        getDonutDetails(arg)
    }

    private fun getDonutDetails(id: Int) {
        _state.update {
            it.copy(donut = DataSource.getDonuts().first { donut -> donut.id == id })
        }
    }

    fun onQuantityChanged(quantity: Int) {
        if (quantity < 1) return
        _state.update {
            it.copy(quantity = quantity)
        }
    }

    fun onFavoriteClicked(id: Int) {
        state.value.donut.let {
            _state.update {
                it.copy(donut = it.donut!!.copy(isFavorite = !it.donut.isFavorite))
            }
        }
    }
}