package screens.profile.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import moe.tlaster.precompose.navigation.Navigator
import screens.components.common.Header
import screens.components.profile.ProfileItem
import theme.medium16
import utils.AsyncImage
import utils.contants.PROFILE_SETTING


@Composable
fun ProfileScreen(
    navigator: Navigator
) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(navigator, "My Profile")
        AsyncImage(
            imageUrl = "https://m.media-amazon.com/images/I/918Ai9a893L._AC_UF1000,1000_QL80_.jpg",
            modifier = Modifier.height(60.dp).width(60.dp).clip(RoundedCornerShape(100)),
            filterQuality = DrawScope.DefaultFilterQuality,
            contentDescription = "Top Cast",
            contentScale = ContentScale.Crop,
            loadingPlaceHolder = {},
            errorPlaceHolder = {},
            alignment = Alignment.Center,
            alpha = DefaultAlpha,
            colorFilter = null
        )

        Text("John Doe", style = MaterialTheme.typography.medium16, modifier = Modifier.padding(top  = 20.dp))

        LazyColumn (modifier = Modifier.padding(horizontal = 41.dp).padding(top = 12.dp)) {
            items(PROFILE_SETTING) { profile ->
                ProfileItem(profile)
            }
        }
    }
}