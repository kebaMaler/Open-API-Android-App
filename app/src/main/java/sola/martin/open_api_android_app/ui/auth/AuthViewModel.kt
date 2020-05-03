package sola.martin.open_api_android_app.ui.auth

import androidx.lifecycle.ViewModel
import sola.martin.open_api_android_app.di.auth.AuthScope
import sola.martin.open_api_android_app.repository.auth.AuthRepository
import javax.inject.Inject

@AuthScope
class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
): ViewModel()
{


}