package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

@Composable
fun DonutsList(
    items: List<HomeUiState.Donut>,
    onItemClicked: (Int) -> Unit,
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent),
        contentPadding = PaddingValues(start = 16.dp, top = 65.dp)
    ) {
        items(items.size) {
            DonutItem(items[it], onItemClicked)
        }
    }
}