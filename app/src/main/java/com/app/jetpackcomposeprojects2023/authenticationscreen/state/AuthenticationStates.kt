package com.app.jetpackcomposeprojects2023.authenticationscreen.state

import androidx.annotation.StringRes
import com.app.jetpackcomposeprojects2023.R

data class AuthenticationState (
    val authenticationMode: AuthenticationMode = AuthenticationMode.SIGN_IN,
    val emailAddress: String?,
    val password: String?,
    val passwordRequirements: List<PasswordRequirement> = emptyList(),
    val isLoading: Boolean,
    val error: String?
) {
    fun isValidState(): Boolean {
        return emailAddress?.isNotEmpty() == true && password?.isNotEmpty() == true && (authenticationMode == AuthenticationMode.SIGN_IN ||
                passwordRequirements.containsAll(PasswordRequirement.values().toList()))
    }
}


enum class PasswordRequirement(
    @StringRes message: Int
) {
    CAPITAL(R.string.password_requirement_capital),
    DIGIT(R.string.password_requirement_digit),
    EIGHT_CHARACTER(R.string.password_requirement_characters)
}

enum class AuthenticationMode {
    SIGN_IN,
    SIGN_UP
}
