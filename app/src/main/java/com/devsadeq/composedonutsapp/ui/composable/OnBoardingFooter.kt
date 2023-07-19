package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devsadeq.composedonutsapp.R

@Composable
fun OnBoardingFooter(
    modifier: Modifier = Modifier,
    onGetStartedClicked: () -> Unit,
) {
    Column(
        modifier = modifier
            .wrapContentSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.Bottom,
    ) {
        Text(
            text = stringResource(id = R.string.gonuts_with_donuts),
            modifier = Modifier.width(200.dp),
            style = TextStyle(
                fontSize = 54.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFFFF7074),
            )
        )
        Text(
            text = stringResource(R.string.on_boarding_desc),
            modifier = Modifier.padding(top = 20.dp, bottom = 60.dp),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFFFF9494),
            )
        )
        RoundedButton(onClick = onGetStartedClicked, text = stringResource(R.string.get_started))
    }
}