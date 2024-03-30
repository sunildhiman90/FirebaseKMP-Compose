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
            applicationId = "1:989450187258:web:753aa3d669dcca7c693443",
            apiKey = "AIzaSyCAxelH0-YztIi4We56NKxoLsDuLYkz5ng",
            projectId = "fir-cmp-demo"
        )
    )

    onWasmReady {
        CanvasBasedWindow(canvasElementId = "ComposeTarget") {
            App()
        }
    }
}