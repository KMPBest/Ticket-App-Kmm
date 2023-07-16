import androidx.compose.ui.window.ComposeUIViewController
import moe.tlaster.precompose.PreComposeApplication

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = PreComposeApplication(title = "") { App() }