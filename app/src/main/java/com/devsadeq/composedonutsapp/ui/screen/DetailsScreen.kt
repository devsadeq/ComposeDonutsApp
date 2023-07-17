package com.devsadeq.composedonutsapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.PlusOne
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.composable.RoundedButton
import com.devsadeq.composedonutsapp.ui.composable.RoundedIconButton

@Composable
fun DetailsScreen() {
    DetailsScreenContent()
}

@Preview
@Composable
fun DetailsScreenPreview() {
    DetailsScreen()
}

@Composable
fun DetailsScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ) {
        IconButton(
            onClick = {},
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBackIosNew, contentDescription = null,
                tint = Color(0xFFFF7074)
            )
        }
        Image(
            painter = painterResource(R.drawable.strawberry_wheel), contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .height(350.dp)
                .padding(vertical = 24.dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp)
            ) {
                Text(
                    text = "Strawberry Wheel",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFF7074),
                    )
                )
                Text(
                    text = "About Gonut",
                    modifier = Modifier.padding(top = 33.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xCC000000),
                    )
                )
                Text(
                    text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                    modifier = Modifier.padding(top = 16.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0x99000000),
                        letterSpacing = 0.7.sp,
                    )
                )
                Text(
                    text = "Quantity",
                    modifier = Modifier.padding(top = 26.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xCC000000),
                    )
                )
                Row(
                    modifier = Modifier.padding(top = 17.dp),
                ) {
                    RoundedIconButton(
                        icon = Icons.Filled.Remove,
                        backgroundColor = Color.White,
                        iconColor = Color.Black,
                    )
                    RoundedIconButton(
                        text = "1",
                        backgroundColor = Color.White,
                        iconColor = Color.Black,
                        modifier = Modifier.padding(horizontal = 23.dp)
                    )
                    RoundedIconButton(
                        icon = Icons.Filled.Add,
                        backgroundColor = Color(0xFF000000),
                        iconColor = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 47.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "£16",
                        modifier = Modifier.padding(end = 26.dp),
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        )
                    )
                    RoundedButton(
                        onClick = {},
                        text = stringResource(R.string.add_to_cart),
                        containerColor = Color(0xFFFF7074),
                        textColor = Color.White,
                    )
                }
            }
            RoundedIconButton(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = (-33).dp, y = (-20).dp),
                icon = Icons.Filled.FavoriteBorder,
                backgroundColor = Color.White,
                iconColor = Color(0xFFFF7074),
            )
        }
    }
}
