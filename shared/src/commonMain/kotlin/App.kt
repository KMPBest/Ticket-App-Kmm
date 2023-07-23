import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import navigation.BottomNavigationUI
import navigation.Navigation
import navigation.NavigationScreen
import navigation.currentRoute
import screens.components.AppBarWithArrow
import theme.AppTheme

@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialApi::class)
@Composable
fun App() {

    val navigator = rememberNavigator()

    AppTheme {
        Scaffold(topBar = {
            if (isBackButtonEnable(navigator)) {
                AppBarWithArrow(
                    "Movie"
                ) {
                    navigator.goBack()
                }
            }
        }, bottomBar = {
            when (currentRoute(navigator)) {
                NavigationScreen.Home.route, NavigationScreen.Search.route, NavigationScreen.Ticket.route, NavigationScreen.Profile.route -> {
                    BottomNavigationUI(navigator)
                }
            }
        }) {
            Navigation(navigator)
        }
    }
}

@Composable
fun isBackButtonEnable(navigator: Navigator): Boolean {
    return when (currentRoute(navigator)) {
        NavigationScreen.Home.route, NavigationScreen.Search.route, NavigationScreen.Ticket.route, NavigationScreen.Profile.route -> {
            false
        }
        else -> {
            true
        }
    }
}

expect fun getPlatformName(): String