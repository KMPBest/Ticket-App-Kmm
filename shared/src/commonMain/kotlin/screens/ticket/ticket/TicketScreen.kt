package screens.ticket.ticket

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import screens.components.common.Header
import theme.Tranparent
import theme.medium10
import theme.medium12
import theme.medium16
import theme.medium24
import theme.regular12
import utils.AsyncImage


@OptIn(ExperimentalResourceApi::class)
@Composable
fun TicketScreen(
    navigator: Navigator
) {
    val gradient = Brush.verticalGradient(
        0.0f to MaterialTheme.colors.primary,
        1.0f to Tranparent,
        startY = 1100.0f,
        endY = 0.0f
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.clip(RoundedCornerShape(0))) {
            Header(navigator, "My Tickets")
            Box(
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .clip(RoundedCornerShape(15,15, 0, 0))
            ) {
                Box {
                    AsyncImage(
                        imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
                        modifier = Modifier.fillMaxWidth().height(400.dp),
                        filterQuality = DrawScope.DefaultFilterQuality,
                        contentDescription = "Now playing movie",
                        contentScale = ContentScale.Crop,
                        loadingPlaceHolder = {},
                        errorPlaceHolder = {},
                        alignment = Alignment.Center,
                        alpha = DefaultAlpha,
                        colorFilter = null
                    )
                    Box(modifier = Modifier.fillMaxWidth().height(400.dp).background(gradient))
                }
                Box(modifier = Modifier.offset(-(40).dp, 360.dp)
                    .clip(RoundedCornerShape(100))
                    .height(80.dp).width(80.dp)
                    .background(MaterialTheme.colors.background))
                Box(modifier = Modifier.offset(40.dp, 360.dp)
                    .clip(RoundedCornerShape(100))
                    .height(80.dp).width(80.dp)
                    .background(MaterialTheme.colors.background)
                    .align(Alignment.TopEnd))

            }

            DashedLinePattern()


            Box(
                modifier = Modifier
                    .padding(horizontal = 40.dp).fillMaxWidth()
                    .clip(RoundedCornerShape(0,0, 20, 20))
                    .background(MaterialTheme.colors.primary)
            ) {
                Box(modifier = Modifier.offset(-(40).dp, -(40).dp)
                    .clip(RoundedCornerShape(100))
                    .height(80.dp).width(80.dp)
                    .background(MaterialTheme.colors.background))
                Box(modifier = Modifier.offset(40.dp, -(40).dp)
                    .clip(RoundedCornerShape(100))

                    .height(80.dp).width(80.dp)
                    .background(MaterialTheme.colors.background)
                    .align(Alignment.TopEnd))
                Column (modifier = Modifier.fillMaxWidth()) {
                    Row (
                        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Column (
                            modifier = Modifier.padding(end = 30.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                            Text("18", style = MaterialTheme.typography.medium24(MaterialTheme.colors.background))
                            Text("Mon", style = MaterialTheme.typography.medium10(MaterialTheme.colors.background))
                        }
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource("clock.xml"),
                                null,
                                modifier = Modifier.height(30.dp).width(30.dp).padding(top = 5.dp),
                                colorFilter = ColorFilter.tint(MaterialTheme.colors.background),
                            )
                            Text(
                                "Mon",
                                style = MaterialTheme.typography.medium10(MaterialTheme.colors.background),
                                modifier = Modifier.padding(top = 3.dp))
                        }
                    }

                    Row (
                        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Hall", style = MaterialTheme.typography.medium16(MaterialTheme.colors.background))
                            Text(
                                "18",
                                style = MaterialTheme.typography.regular12(MaterialTheme.colors.background),
                                modifier = Modifier.padding(top = 5.dp)
                                )
                        }

                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Hall", style = MaterialTheme.typography.medium16(MaterialTheme.colors.background))
                            Text(
                                "18",
                                style = MaterialTheme.typography.regular12(MaterialTheme.colors.background),
                                modifier = Modifier.padding(top = 5.dp)
                            )
                        }

                        Column (horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Hall", style = MaterialTheme.typography.medium16(MaterialTheme.colors.background))
                            Text(
                                "18",
                                style = MaterialTheme.typography.regular12(MaterialTheme.colors.background),
                                modifier = Modifier.padding(top = 5.dp)
                            )
                        }

                    }

                    Box (
                        modifier = Modifier.height(80.dp).fillMaxWidth(),
                        contentAlignment = Alignment.Center
                        ) {
                        AsyncImage(
                            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Example_barcode.svg/2560px-Example_barcode.svg.png",
                            modifier = Modifier.height(50.dp).width(150.dp),
                            filterQuality = DrawScope.DefaultFilterQuality,
                            contentDescription = "QR code movie",
                            contentScale = ContentScale.Crop,
                            loadingPlaceHolder = {},
                            errorPlaceHolder = {},
                            alignment = Alignment.Center,
                            alpha = DefaultAlpha,
                            colorFilter = null
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun DashedLinePattern() {
    Canvas(
        modifier = Modifier.fillMaxWidth()
    ) {
        val startX = 20.dp.toPx()
        val endX = size.width - 20.dp.toPx()
        val y = size.height / 2
        val dashWidth = 8.dp.toPx()
        val gapWidth = 5.dp.toPx()

        drawLine(
            color = Color.Black,
            start = Offset(startX, y),
            end = Offset(endX, y),
                pathEffect = PathEffect.dashPathEffect(
                intervals = floatArrayOf(dashWidth, gapWidth),
                phase = 0f
            )
        )
    }
}
