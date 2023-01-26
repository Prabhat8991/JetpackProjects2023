package com.app.jetpackcomposeprojects2023.authenticationscreen.state

import androidx.annotation.StringRes
import com.app.jetpackcomposeprojects2023.R

data class AuthenticationState(
    val authenticationMode: AuthenticationMode = AuthenticationMode.SIGN_IN,
    val emailAddress: String?,
    val password: String?,
    val passwordRequirements: List<PasswordRequirement> = emptyList()
)

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
