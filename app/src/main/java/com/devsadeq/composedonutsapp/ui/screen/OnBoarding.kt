package com.devsadeq.composedonutsapp.ui.screen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devsadeq.composedonutsapp.R
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
        Image(
            painter = painterResource(R.drawable.donuts), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )
        OnBoardingFooter(Modifier.align(Alignment.BottomCenter))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}