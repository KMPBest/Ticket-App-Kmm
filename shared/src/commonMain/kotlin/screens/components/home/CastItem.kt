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
import theme.medium8
import utils.AsyncImage

@Composable
fun CastItem(){
    Column (modifier = Modifier.padding(top =  10.dp)) {
        AsyncImage(
            imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
            modifier = Modifier.height(75.dp).width(50.dp).clip(RoundedCornerShape(25.dp)),
            filterQuality = DrawScope.DefaultFilterQuality,
            contentDescription = "Top Cast",
            contentScale = ContentScale.Crop,
            loadingPlaceHolder = {},
            errorPlaceHolder = {},
            alignment = Alignment.Center,
            alpha = DefaultAlpha,
            colorFilter = null
        )

        Text(
            "Keanu Reeves",
            style = MaterialTheme.typography.medium8,
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}