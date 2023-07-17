package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.viewmodel.HomeUiState

@Composable
fun DonutItem(donut: HomeUiState.Donut) {
    Box {
        Card(
            modifier = Modifier
                .wrapContentSize()
                .padding(end = 20.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp
                    )
                )
                .clickable { },
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 150.dp),
        ) {
            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 10.dp, end = 10.dp, bottom = 20.dp, top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
            ) {
                Text(
                    text = donut.name,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0x99000000),
                    )
                )
                Text(
                    text = "$${donut.price}",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFF7074),
                    )
                )
            }
        }
        Image(
            painter = painterResource(donut.image), contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .size(112.dp)
                .offset(x = (-10).dp, y = (-55).dp),
            contentScale = ContentScale.FillBounds

        )
    }
}