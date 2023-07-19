package com.devsadeq.composedonutsapp.ui.viewmodel.details

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(DetailsUiState())
    val state = _state.asStateFlow()

    fun onQuantityChanged(quantity: Int) {
        _state.update {
            it.copy(quantity = quantity)
        }
    }
}