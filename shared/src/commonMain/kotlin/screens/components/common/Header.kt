package screens.components.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import theme.Primary

@Composable
fun Header(
    navigator: Navigator
){
    Box( modifier = Modifier.fillMaxWidth().padding(35.dp)) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
            .height(34.dp)
            .width(34.dp)
            .clip(RoundedCornerShape(100))
            .background(Primary)
                .clickable { navigator.goBack() }){
            Icon(
                Icons.Filled.Clear,
                contentDescription = "delete"
            )
        }
    }
}