package com.devsadeq.composedonutsapp.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.composable.DonutsList
import com.devsadeq.composedonutsapp.ui.composable.HomeHeader
import com.devsadeq.composedonutsapp.ui.composable.HomeOffers
import com.devsadeq.composedonutsapp.ui.composable.SectionTitle
import com.devsadeq.composedonutsapp.ui.screen.details.navigateDetails
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    HomeScreenContent(
        state,
        navController::navigateDetails,
        viewModel::onFavoriteClicked
    )
}

@Composable
fun HomeScreenContent(
    state: HomeUiState = HomeUiState(),
    onItemClicked: (Int) -> Unit,
    onFavoriteClicked: (Int) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        HomeHeader()
        SectionTitle(stringResource(R.string.today_offers))
        HomeOffers(state.todayOffers, onItemClicked, onFavoriteClicked)
        SectionTitle(stringResource(R.string.donuts))
        DonutsList(items = state.donuts, onItemClicked)
        SectionTitle(stringResource(R.string.today_s_specials_donuts))
        DonutsList(items = state.donuts, onItemClicked)
        Spacer(modifier = Modifier.height(24.dp))
    }
}