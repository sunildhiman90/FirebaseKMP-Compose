package auth

import base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel(
    //TODO, add AuthService here
) : BaseViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    private val _emailError = MutableStateFlow(false)
    val emailError = _emailError.asStateFlow()

    private val _passwordError = MutableStateFlow(false)
    val passwordError = _passwordError.asStateFlow()

    fun onEmailChange(newValue: String) {

    }

    fun onPasswordChange(newValue: String) {

    }

    fun onSignInClick() {

    }


    fun onSignOut() {
        launchWithCatchingException {
        }
    }

}

data class LoginUiState(
    val email: String = "",
    val password: String = ""
)