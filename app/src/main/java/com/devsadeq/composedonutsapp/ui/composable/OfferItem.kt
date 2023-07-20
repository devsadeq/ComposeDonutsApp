package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composedonutsapp.ui.viewmodel.home.HomeUiState

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun OfferItem(
    item: HomeUiState.Donut,
    onItemClicked: (Int) -> Unit,
    onFavoriteClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Card(
            modifier = Modifier
                .padding(end = 47.dp)
//                .shadow(
//                    elevation = 45.dp,
//                    spotColor = Color(0x5C030000),
//                )
                .clip(RoundedCornerShape(size = 20.dp))
                .clickable { onItemClicked(item.id) },
            colors = CardDefaults.cardColors(
                containerColor = if (item.id % 2 != 0) Color(0xFFD7E4F6) else Color(0xFFFFC7D0),
            ),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                    IconButton(
                        onClick = { onFavoriteClicked(item.id) },
                        modifier = Modifier
                            .size(35.dp)
                            .background(Color.White, shape = CircleShape)
                    ) {
                        Icon(
                            imageVector = if (item.isFavorite) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                            contentDescription = null,
                            tint = Color(0xFFFF7074),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(138.dp))
                Text(
                    text = item.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 4.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = item.description,
                    modifier = Modifier
                        .width(157.dp)
                        .padding(vertical = 8.dp, horizontal = 4.dp),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0x69000000),
                        letterSpacing = 0.6.sp,
                    ),
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )
                Row(
                    modifier = Modifier.align(Alignment.End),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (item.previousPrice != 0) Text(
                        text = "$${item.previousPrice}",
                        modifier = Modifier.padding(end = 5.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0x6B000000),
                            textDecoration = TextDecoration.LineThrough,
                        )
                    )
                    Text(
                        text = "$${item.price}",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF000000),
                        )
                    )
                }
            }
        }
        Image(
            painter = painterResource(item.image),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(150.dp)
                .offset(x = -(5).dp, y = -(50).dp)
        )
    }
}