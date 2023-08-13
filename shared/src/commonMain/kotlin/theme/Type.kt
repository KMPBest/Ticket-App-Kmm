package theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )

)

@Composable
fun Typography.medium24(color: Color = MaterialTheme.colors.onBackground): TextStyle{
    return TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium
    )
}

val Typography.regular24: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 24.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.semiBold20: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }

val Typography.semiBold16: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }

@Composable
fun Typography.medium16(color: Color = MaterialTheme.colors.onBackground): TextStyle{
    return TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )
}

val Typography.medium16: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }

val Typography.regular14: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 14.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.regular14LightGray: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.surface,
            fontSize = 14.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.regular14Gray: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.surface,
            fontSize = 14.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.medium14: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }

@Composable
fun Typography.medium12(color: Color = MaterialTheme.colors.onBackground): TextStyle{
    return TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    )
}

val Typography.medium12: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }

val Typography.medium12Dark: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.secondary,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }

@Composable
fun Typography.regular12(color: Color = MaterialTheme.colors.onBackground): TextStyle {
    return TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontSize = 12.sp,
        fontWeight = FontWeight.W400
    )
}

val Typography.regular12: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.light12: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light
        )
    }
@Composable
fun Typography.medium10(color: Color = MaterialTheme.colors.onBackground): TextStyle{
    return TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium
    )
}

val Typography.medium10: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium
        )
    }

val Typography.regular10: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 10.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.regular10LightGray: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.surface,
            fontSize = 10.sp,
            fontWeight = FontWeight.W400
        )
    }

val Typography.medium8: TextStyle
    @Composable
    get() {
        return TextStyle(
            fontFamily = FontFamily.Default,
            color = MaterialTheme.colors.onBackground,
            fontSize = 8.sp,
            fontWeight = FontWeight.Medium
        )
    }