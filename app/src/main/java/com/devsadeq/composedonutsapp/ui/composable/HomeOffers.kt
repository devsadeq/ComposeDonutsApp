package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeOffers(
    items: List<HomeUiState.Donut>,
    onItemClicked: (Int) -> Unit,
    onFavoriteClicked: (Int) -> Unit,
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(start = 16.dp, top = 24.dp, bottom = 24.dp)
    ) {
        items(items.size) {
            OfferItem(
                items[it],
                onItemClicked = onItemClicked,
                onFavoriteClicked = onFavoriteClicked,
                modifier = Modifier.animateItemPlacement()
            )
        }
    }
}