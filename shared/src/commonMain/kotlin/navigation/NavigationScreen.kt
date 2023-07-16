package navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


sealed class NavigationScreen(
    val route: String,
    val title: String = "AppString.APP_TITLE",
    val navIcon: (@Composable () -> Unit) = {
        Icon(
            Icons.Filled.Home, contentDescription = "home"
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

    object HomeNav : NavigationScreen("home_screen", title = "Home", navIcon = {
        Icon(
            Icons.Filled.Home,
            contentDescription = "search",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    object SearchNav : NavigationScreen("seach_screen", title = "Search", navIcon = {
        Icon(
            Icons.Filled.Search,
            contentDescription = "search",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    @OptIn(ExperimentalResourceApi::class)
    object TicketNav : NavigationScreen("ticket_screen", title = "Tiket",  navIcon = {
        Icon(
            Icons.Filled.Star,
            contentDescription = "Ticket",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })

    object ProfileNav : NavigationScreen("profile_screen", title = "Profile", navIcon = {
        Icon(
            Icons.Filled.Person,
            contentDescription = "Profile",
            modifier = Modifier
                .padding(end = 16.dp)
                .offset(x = 10.dp)
        )
    })
}