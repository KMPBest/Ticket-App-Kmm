package screens.components.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import navigation.NavigationScreen
import theme.Gray
import theme.medium12
import theme.regular10LightGray
import theme.semiBold20
import utils.AsyncImage

@Composable
fun NowPlayingItem(
    navigator: Navigator
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable {
            navigator.navigate(NavigationScreen.MovieDetail.route.plus("/12"))
        }
        ) {
            AsyncImage(
                imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(20.dp)),
                filterQuality = DrawScope.DefaultFilterQuality,
                contentDescription = "Now playing movie",
                contentScale = ContentScale.Crop,
                loadingPlaceHolder = {},
                errorPlaceHolder = {},
                alignment = Alignment.Center,
                alpha = DefaultAlpha,
                colorFilter = null
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "Start",
                    tint = Color.Yellow
                )
                Text(
                    "8.0 (1,024)",
                    style = MaterialTheme.typography.medium12
                )
            }
            Text(
                "John Wick: Chapter 4",
                style = MaterialTheme.typography.semiBold20
            )

            Row(modifier = Modifier.padding(vertical = 30.dp)) {
                Box(
                    modifier = Modifier
                        .border(1.dp, Gray, shape = RoundedCornerShape(10.dp))
                        .padding(vertical = 5.dp, horizontal = 10.dp),
                    contentAlignment = Alignment.Center,

                    ) {
                    Text("Action", style = MaterialTheme.typography.regular10LightGray)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier
                        .border(1.dp, Gray, shape = RoundedCornerShape(10.dp))
                        .padding(vertical = 5.dp, horizontal = 10.dp),
                    contentAlignment = Alignment.Center,

                    ) {
                    Text("Thriller", style = MaterialTheme.typography.regular10LightGray)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier
                        .border(1.dp, Gray, shape = RoundedCornerShape(10.dp))
                        .padding(vertical = 5.dp, horizontal = 10.dp),
                    contentAlignment = Alignment.Center,

                    ) {
                    Text("Crime", style = MaterialTheme.typography.regular10LightGray)
                }
            }
    }
}