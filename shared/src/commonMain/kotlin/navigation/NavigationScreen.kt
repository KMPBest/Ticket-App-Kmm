package navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


sealed class NavigationScreen @OptIn(ExperimentalResourceApi::class) constructor(
    val route: String,
    val navIcon: (@Composable () -> Unit) = {
        Image(
            painterResource("media.xml"),
            null,
            modifier = Modifier.height(20.dp).width(20.dp),
        )
    },
    val objectName: String = "",
    val objectPath: String = ""
) {
    object Home : NavigationScreen("home_screen")
    object Search : NavigationScreen("seach_screen")
    object Ticket : NavigationScreen("ticket_screen")
    object Profile : NavigationScreen("profile_screen")
    object MovieDetail :
        NavigationScreen("movie_detail_screen", objectName = "id", objectPath = "/{id}")

    @OptIn(ExperimentalResourceApi::class)
    object HomeNav : NavigationScreen("home_screen", navIcon = {
        Image(
            painterResource("media.xml"),
            null,
            modifier = Modifier.height(20.dp).width(20.dp),
        )
    })

    object SearchNav : NavigationScreen("seach_screen", navIcon = {

        Icon(
            Icons.Filled.Search,
            contentDescription = "search",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    @OptIn(ExperimentalResourceApi::class)
    object TicketNav : NavigationScreen("ticket_screen",  navIcon = {
        Image(
            painterResource("ticket.xml"),
            null,
            modifier = Modifier.height(20.dp).width(20.dp),
        )
    })

    @OptIn(ExperimentalResourceApi::class)
    object ProfileNav : NavigationScreen("profile_screen", navIcon = {
        Image(
            painterResource("person.xml"),
            null,
            modifier = Modifier.height(20.dp).width(20.dp),
        )
    })
}