package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composedonutsapp.R
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

@Composable
fun DetailsBottomSheet(
    donut: HomeUiState.Donut,
    quantity: Int,
    onQuantityChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
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
                text = donut.name,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFF7074),
                )
            )
            Text(
                text = stringResource(R.string.about_gonut),
                modifier = Modifier.padding(top = 33.dp),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xCC000000),
                )
            )
            Text(
                text = donut.description,
                modifier = Modifier.padding(top = 16.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0x99000000),
                    letterSpacing = 0.7.sp,
                )
            )
            Text(
                text = stringResource(R.string.quantity),
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
                    onClick = { onQuantityChange(quantity - 1) }
                )
                RoundedIconButton(
                    text = quantity.toString(),
                    backgroundColor = Color.White,
                    iconColor = Color.Black,
                    modifier = Modifier.padding(horizontal = 23.dp)
                )
                RoundedIconButton(
                    icon = Icons.Filled.Add,
                    backgroundColor = Color(0xFF000000),
                    iconColor = Color.White,
                    onClick = { onQuantityChange(quantity + 1) }
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
                    text = "£${donut.price}",
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
    }
}