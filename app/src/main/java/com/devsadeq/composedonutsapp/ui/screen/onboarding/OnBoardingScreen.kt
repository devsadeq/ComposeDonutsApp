package com.devsadeq.composedonutsapp.ui.screen.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.composable.OnBoardingFooter
import com.devsadeq.composedonutsapp.ui.screen.home.navigateHome

@Composable
fun OnBoardingScreen(
    navController: NavController,
) {
    OnBoardingScreenContent(
        navController::navigateHome
    )
}

@Composable
fun OnBoardingScreenContent(
    onGetStartedClicked: () -> Unit,
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ) {
        Image(
            painter = painterResource(R.drawable.donuts), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )
        OnBoardingFooter(Modifier.align(Alignment.BottomCenter), onGetStartedClicked)
    }
}