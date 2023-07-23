package screens.components.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import theme.medium14
import utils.AsyncImage


@Composable
fun MovieItem(){
    Column {
        AsyncImage(
            imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
            modifier = Modifier.height(200.dp).width(120.dp).clip(RoundedCornerShape(20.dp)),
            filterQuality = DrawScope.DefaultFilterQuality,
            contentDescription = "Now playing movie",
            contentScale = ContentScale.Crop,
            loadingPlaceHolder = {},
            errorPlaceHolder = {},
            alignment = Alignment.Center,
            alpha = DefaultAlpha,
            colorFilter = null
        )

        Text(
            "Shazam",
            style = MaterialTheme.typography.medium14,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}