package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Primary,
    background = Color.Black,
    surface = Color(0x80ffffff),
    onBackground = Color(0xffffffff),
    onPrimary = White,
    secondary = Color(0x52ffffff)
    )

private val LightColorPalette = lightColors(
    primary = Primary,
    background = White,
    surface = Color(0x80000000),
    onBackground = Color(0xff000000),
    onPrimary = White,
    secondary = Color(0x52000000)
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content,

    )
}