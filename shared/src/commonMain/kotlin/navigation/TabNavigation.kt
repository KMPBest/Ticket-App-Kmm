package navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
fun BottomNavigationUI(navigator: Navigator ) {
    BottomNavigation(backgroundColor = MaterialTheme.colors.background, contentColor = MaterialTheme.colors.onBackground, modifier = Modifier.height(64.dp)) {
        val items = listOf(
            NavigationScreen.HomeNav,
            NavigationScreen.SearchNav,
            NavigationScreen.TicketNav,
            NavigationScreen.ProfileNav,
        )
        items.forEach {
            val isSelected =  it.route == currentRoute(navigator)
            BottomNavigationItem(
                selected = isSelected,
                icon = { BottomNavigationItem( isSelected, it.navIcon) },
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

@Composable
fun BottomNavigationItem(isSelected: Boolean,  menu: @Composable () -> Unit) {
   if(isSelected){
       return Box(
           modifier = Modifier
               .height(50.dp)
               .width(50.dp)
               .clip(RoundedCornerShape(120.dp))
               .background(theme.Primary),
           contentAlignment = Alignment.Center,
       ) {
           menu()
       }
   }
    return menu()
}
