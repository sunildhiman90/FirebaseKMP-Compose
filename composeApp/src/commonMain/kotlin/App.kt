import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import auth.LoginScreen1
import auth.LoginViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {

        //TODO, pass AuthService and LoginViewModel from here
        val loginViewModel = LoginViewModel()

        Scaffold(
            modifier = Modifier.fillMaxWidth(),
        ) {
            LoginScreen1(onLoginSuccess = {}, viewModel = loginViewModel)
        }
    }
}