package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF000000),
        )
    )
}