package screens.buyTicket.buyTicket

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import screens.components.buyTicket.CircleComponent
import screens.components.buyTicket.DatePickerComponent
import screens.components.common.Header
import theme.*
import utils.AsyncImage
import kotlin.random.Random

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BuyTicketScreen(
    navigator: Navigator,
    movieId: Int,
    ) {
    val gradient = Brush.verticalGradient(
        0.0f to MaterialTheme.colors.background,
        1.0f to Tranparent,
        startY = 650.0f,
        endY = 0.0f
    )

    @Composable
    fun getRandomColors(): Color {
        val color: List<Color> = listOf(
            MaterialTheme.colors.primary,
            MaterialTheme.colors.onBackground,
            MaterialTheme.colors.secondary
        )
        // Generate a random number between 1 and 3 (inclusive)
        val randomNumber =  Random.nextInt(0, 3)

        return color[randomNumber]
    }

    Box(modifier = Modifier.fillMaxSize()){
        LazyColumn(modifier = Modifier.fillMaxSize().padding(bottom = 60.dp)) {
            // Header
            item {
                Box(modifier = Modifier.background(gradient)) {
                    AsyncImage(
                        imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
                        modifier = Modifier.fillMaxWidth().height(221.dp),
                        filterQuality = DrawScope.DefaultFilterQuality,
                        contentDescription = "Now playing movie",
                        contentScale = ContentScale.Crop,
                        loadingPlaceHolder = {},
                        errorPlaceHolder = {},
                        alignment = Alignment.Center,
                        alpha = DefaultAlpha,
                        colorFilter = null
                    )
                    Box(modifier = Modifier.fillMaxWidth().height(221.dp).background(gradient))
                    Header(navigator)
                }
            }

            // Seat
            item {
                Column (
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        "Screen this side",
                        style = MaterialTheme.typography.regular10LightGray,
                        modifier = Modifier.padding(bottom = 19.dp)
                    )
                    for (i in 1..10) {
                        Row {
                            for (j in 1..10) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .height(30.dp)
                                        .width(30.dp)
                                ) {
                                    Image(
                                        painterResource("seat.xml"),
                                        null,
                                        modifier = Modifier.height(20.dp).width(20.dp),
                                        colorFilter = ColorFilter.tint(getRandomColors())
                                    )
                                }
                            }
                        }
                    }
                }
            }

            item {
                Row (
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CircleComponent(MaterialTheme.colors.onBackground, "Available")
                    CircleComponent(MaterialTheme.colors.secondary, "Taken")
                    CircleComponent(MaterialTheme.colors.primary, "Selected")
                }
            }

            item {
                DatePickerComponent()
            }
        }

        Row (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(horizontal = 37.dp),
            verticalAlignment = Alignment.CenterVertically
            )
        {
            Box (modifier = Modifier.weight(4f)) {
                Column (
                    modifier = Modifier.width(IntrinsicSize.Max),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Total Price",
                        style = MaterialTheme.typography.regular14Gray
                    )
                    Text(
                        "$ 15.00",
                        style = MaterialTheme.typography.medium24()
                    )
                }
            }
            Box (
                modifier = Modifier
                    .weight(6f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(MaterialTheme.colors.primary)
                    .padding(
                        vertical = 10.dp,
                        horizontal = 26.dp),
                contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Buy Tickets",
                        style = MaterialTheme.typography.medium24()
                    )

            }
        }
    }

}