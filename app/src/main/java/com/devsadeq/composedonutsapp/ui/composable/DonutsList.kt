package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

@Composable
fun DonutsList(items: List<HomeUiState.Donut>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(start = 40.dp, top = 60.dp)
    ) {
        items(items.size) {
            DonutItem(items[it])
        }
    }
}