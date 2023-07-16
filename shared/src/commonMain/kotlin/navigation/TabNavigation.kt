package navigation

import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.Navigator
import screens.home.home.HomeScreen
import screens.profile.profile.ProfileScreen
import screens.search.search.SearchScreen
import screens.ticket.ticket.TicketScreen


@Composable
fun Navigation(navigator: Navigator) {
    NavHost(
        navigator = navigator,
        initialRoute = NavigationScreen.Home.route,
    ) {
        scene(route = NavigationScreen.Home.route) {
            HomeScreen(navigator)
        }
        scene(route = NavigationScreen.Search.route) {
            SearchScreen(navigator)
        }
        scene(route = NavigationScreen.Ticket.route) {
            TicketScreen(navigator)
        }
        scene(route = NavigationScreen.Profile.route) {
            ProfileScreen(navigator)
        }
    }
}

@Composable
fun currentRoute(navigator: Navigator): String? {
    return navigator.currentEntry.collectAsState(null).value?.route?.route

}
@Composable
fun BottomNavigationUI(navigator: Navigator, ) {
    BottomNavigation(backgroundColor = Color.Black, contentColor = Color.White) {
        val items = listOf(
            NavigationScreen.HomeNav,
            NavigationScreen.SearchNav,
            NavigationScreen.TicketNav,
            NavigationScreen.ProfileNav,
        )
        items.forEach {
            BottomNavigationItem(
                selected = it.route == currentRoute(navigator),
                icon = it.navIcon,
                onClick = {
                    navigator.navigate(
                        it.route,
                        NavOptions(
                            launchSingleTop = true,
                        ),
                    )
                })
        }
    }
}
