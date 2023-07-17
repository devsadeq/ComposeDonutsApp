package com.devsadeq.composedonutsapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.composable.DonutsList
import com.devsadeq.composedonutsapp.ui.composable.HomeHeader
import com.devsadeq.composedonutsapp.ui.composable.HomeOffers
import com.devsadeq.composedonutsapp.ui.composable.SectionTitle
import com.devsadeq.composedonutsapp.ui.viewmodel.HomeUiState
import com.devsadeq.composedonutsapp.ui.viewmodel.HomeViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()

    HomeScreenContent(state)
}

@Composable
fun HomeScreenContent(
    state: HomeUiState = HomeUiState()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HomeHeader()
        SectionTitle(stringResource(R.string.today_offers))
        HomeOffers(state.todayOffers)
        SectionTitle(stringResource(R.string.donuts))
        DonutsList(items = state.donuts)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}