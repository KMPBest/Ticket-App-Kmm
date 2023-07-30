package navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.path
import screens.buyTicket.buyTicket.BuyTicketScreen
import screens.home.home.HomeScreen
import screens.movieDetail.movieDetail.MovieDetailScreen
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
        scene(route = NavigationScreen.MovieDetail.route.plus(NavigationScreen.MovieDetail.objectPath)) { backStackEntry ->
            val id: Int? = backStackEntry.path<Int>(NavigationScreen.MovieDetail.objectName)
            id?.let {
                MovieDetailScreen(navigator, it)
            }
        }
        scene(route = NavigationScreen.BuyTicket.route.plus(NavigationScreen.BuyTicket.objectPath)) { backStackEntry ->
            val id: Int? = backStackEntry.path<Int>(NavigationScreen.BuyTicket.objectName)
            id?.let {
                BuyTicketScreen(navigator, it)
            }
        }
    }
}