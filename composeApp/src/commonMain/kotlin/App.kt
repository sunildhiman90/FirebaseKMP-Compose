import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import auth.AuthServiceImpl
import auth.LoginScreen1
import auth.LoginViewModel
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {

        val loginViewModel = LoginViewModel(AuthServiceImpl(auth = Firebase.auth))

        Scaffold(
            modifier = Modifier.fillMaxWidth(),
        ) {
            LoginScreen1(onLoginSuccess = {}, viewModel = loginViewModel)
        }
    }
}