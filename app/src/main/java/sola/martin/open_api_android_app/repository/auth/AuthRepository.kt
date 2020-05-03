package sola.martin.open_api_android_app.repository.auth

import sola.martin.open_api_android_app.api.auth.OpenApiAuthService
import sola.martin.open_api_android_app.presistence.AccountPropertiesDao
import sola.martin.open_api_android_app.presistence.AuthTokenDao
import sola.martin.open_api_android_app.session.SessionManager
import javax.inject.Inject

class AuthRepository
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
)
{





}