package screens.movieDetail.movieDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import screens.components.common.Header
import screens.components.home.CastItem
import theme.*
import utils.AsyncImage

@Composable
fun MovieDetailScreen(
    navigator: Navigator,
    movieId: Int,
    ) {
    val gradient = Brush.verticalGradient(
        0.0f to MaterialTheme.colors.background,
        1.0f to Tranparent,
        startY = 650.0f,
        endY = 0.0f
    )
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn (modifier = Modifier.fillMaxSize()) {
            // Image
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
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(top = 100.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        AsyncImage(
                            imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
                            modifier = Modifier.height(350.dp).width(236.dp),
                            filterQuality = DrawScope.DefaultFilterQuality,
                            contentDescription = "Now playing movie",
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

            // Description
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Text(
                            "2h 50m",
                            style = MaterialTheme.typography.medium12
                        )
                    }

                    Text(
                        "John Wick: Chapter 4",
                        style = MaterialTheme.typography.medium24,
                        modifier = Modifier.padding(top = 10.dp)
                    )

                    Row(modifier = Modifier.padding(vertical = 10.dp)) {
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

                    Text(
                        "No way back, one way out.",
                        style = MaterialTheme.typography.regular12,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }

            // Evaluate
            item {
                Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                    Row(
                        modifier = Modifier.padding(top = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Start",
                            tint = Color.Yellow
                        )

                        Text(
                            " 8.0 (1,024)   24 March 2023",
                            style = MaterialTheme.typography.medium12
                        )
                    }

                    Text(
                        "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
                        style = MaterialTheme.typography.regular12
                    )
                }
            }

            // Top cast
            item {
                Text(
                    "Top Cast",
                    style = MaterialTheme.typography.semiBold20,
                    modifier = Modifier.padding(top = 20.dp)
                )

                LazyRow {
                    item {
                        CastItem()
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                    item {
                        CastItem()
                    }

                }
            }

            // Button Select Seats
            item {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 25.dp),
                    contentAlignment = Alignment.Center
                    ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Primary),
                        ) {
                        Text(
                            "Select Seats",
                            style = MaterialTheme.typography.medium12,
                            modifier = Modifier.padding(horizontal = 15.dp, vertical = 10.dp)
                        )
                    }
                }
            }
        }

    }
}