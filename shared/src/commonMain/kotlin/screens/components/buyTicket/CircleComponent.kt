package screens.components.buyTicket

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import theme.medium10

@Composable
fun CircleComponent(
    color: Color,
    name: String
) {
    Box (
        modifier = Modifier.padding(horizontal = 12.dp, vertical = 20.dp),
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
                    .clip(RoundedCornerShape(100.dp))
                    .background(color),
                contentAlignment = Alignment.Center,
            ) {
                Box(
                    modifier = Modifier
                        .width(14.dp)
                        .height(14.dp)
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colors.background,
                            shape = RoundedCornerShape(50.dp)
                        ).background(color)
                )
            }

            Text(
                name,
                style = MaterialTheme.typography.medium10,
                modifier = Modifier.padding(start = 5.dp)
            )
        }
    }
}