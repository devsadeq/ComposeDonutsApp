package com.devsadeq.composedonutsapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.devsadeq.composedonutsapp.ui.composable.OnBoardingFooter

@Composable
fun OnBoardingScreen() {
    OnBoardingScreenContent()
}

@Composable
fun OnBoardingScreenContent() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ) {
        OnBoardingFooter(Modifier.align(Alignment.BottomCenter))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}