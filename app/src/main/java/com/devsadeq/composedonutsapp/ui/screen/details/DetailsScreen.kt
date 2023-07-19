package com.devsadeq.composedonutsapp.ui.screen.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.devsadeq.composedonutsapp.ui.composable.DetailsBottomSheet
import com.devsadeq.composedonutsapp.ui.composable.RoundedIconButton
import com.devsadeq.composedonutsapp.ui.viewmodel.details.DetailsUiState
import com.devsadeq.composedonutsapp.ui.viewmodel.details.DetailsViewModel

@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    DetailsScreenContent(
        state,
        viewModel::onQuantityChanged,
        navController::popBackStack
    )
}

@Composable
fun DetailsScreenContent(
    state: DetailsUiState,
    onQuantityChange: (Int) -> Unit,
    onBackClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = null,
                tint = Color(0xFFFF7074)
            )
        }
        Image(
            painter = painterResource(state.donut!!.image), contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .height(350.dp)
                .padding(vertical = 24.dp)
        )
        DetailsBottomSheet(
            donut = state.donut ?: return@Box,
            quantity = state.quantity,
            onQuantityChange = onQuantityChange,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
        RoundedIconButton(
            modifier = Modifier
                .zIndex(2f)
                .align(Alignment.CenterEnd)
                .offset(x = (-33).dp, y = (-90).dp),
            icon = Icons.Filled.FavoriteBorder,
            backgroundColor = Color.White,
            iconColor = Color(0xFFFF7074),
        )
    }
}