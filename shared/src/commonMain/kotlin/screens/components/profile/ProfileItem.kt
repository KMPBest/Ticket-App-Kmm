package screens.components.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.medium12Dark
import theme.medium16
import utils.contants.ProfileSettingModal

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProfileItem(profile: ProfileSettingModal){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(top = 25.dp)
        ) {
        Row {
            Image(
                painterResource(profile.icon),
                null,
                modifier = Modifier.height(20.dp).width(20.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colors.onBackground)
            )

            Column (modifier = Modifier.padding(start = 14.dp)) {
                Text(
                    profile.title,
                    style = MaterialTheme.typography.medium16
                )
                profile.features.map { feature ->
                    Text(feature, style = MaterialTheme.typography.medium12Dark)
                }
            }
        }

        Image(
            painterResource("arrow-right.xml"),
            null,
            modifier = Modifier.height(18.dp).width(18.dp),
            colorFilter = ColorFilter.tint(MaterialTheme.colors.onBackground)
        )
    }
}