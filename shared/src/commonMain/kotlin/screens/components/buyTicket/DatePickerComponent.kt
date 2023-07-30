package screens.components.buyTicket

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import theme.medium24
import theme.regular10
import theme.regular14Gray

@Composable
fun DatePickerComponent(){
    Box (
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            // Date
            LazyRow {
                item {
                    Box(
                        modifier =
                        Modifier
                            .padding(15.dp)
                            .clip(RoundedCornerShape(33.dp))
                            .background(MaterialTheme.colors.secondary)
                    ) {
                        Column(
                            modifier = Modifier
                                .height(78.dp)
                                .width(57.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "17",
                                style = MaterialTheme.typography.medium24
                            )
                            Text(
                                "Sun",
                                style = MaterialTheme.typography.regular10,
                                modifier = Modifier.padding(top = 5.dp)
                            )
                        }
                    }
                }
                item {
                    Box(
                        modifier =
                        Modifier
                            .padding(15.dp)
                            .clip(RoundedCornerShape(33.dp))
                            .background(MaterialTheme.colors.primary)
                    ) {
                        Column(
                            modifier = Modifier
                                .height(78.dp)
                                .width(57.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "18",
                                style = MaterialTheme.typography.medium24
                            )
                            Text(
                                "Mon",
                                style = MaterialTheme.typography.regular10,
                                modifier = Modifier.padding(top = 5.dp)
                            )
                        }
                    }
                }
            }

            // Time
            LazyRow (modifier = Modifier.padding(vertical = 16.dp, horizontal = 15.dp)) {
                item {
                    Box(
                        modifier = Modifier
                            .height(37.dp)
                            .width(78.dp)
                            .border(
                                1.dp,
                                MaterialTheme.colors.surface,
                                shape = RoundedCornerShape(32.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "10:30",
                            style = MaterialTheme.typography.regular14Gray,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                }
            }
        }
    }
}