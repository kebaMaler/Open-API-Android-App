package sola.martin.open_api_android_app.session

import android.app.Application
import sola.martin.open_api_android_app.presistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)
{



}