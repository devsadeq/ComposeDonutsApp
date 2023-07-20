package com.devsadeq.composedonutsapp.ui.composable

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RoundedIconButton(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    text: String? = null,
    onClick: () -> Unit = {},
    backgroundColor: Color = Color(0xFFFED8DF),
    iconColor: Color = Color(0xFFFF7074),
    hasElevation: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .size(56.dp)
            .shadow(
                elevation = if (hasElevation) 45.dp else 0.dp,
                spotColor = Color(0x8F030000),
            )
            .clip(RoundedCornerShape(size = 15.dp)),
        colors = ButtonDefaults.buttonColors(backgroundColor),
    ) {
        if (icon != null) Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = iconColor
        )
        if (text != null) Text(
            text = text,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF000000),
            )
        )
    }
}