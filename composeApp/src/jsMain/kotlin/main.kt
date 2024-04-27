import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseOptions
import dev.gitlive.firebase.initialize
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    Firebase.initialize(
        options = FirebaseOptions(
            applicationId = "Add your firebase web appId here",
            apiKey = "Add your firebase project api key here",
            projectId = "Add your firebase projectId here"
        )
    )

    onWasmReady {
        CanvasBasedWindow(canvasElementId = "ComposeTarget") {
            App()
        }
    }
}