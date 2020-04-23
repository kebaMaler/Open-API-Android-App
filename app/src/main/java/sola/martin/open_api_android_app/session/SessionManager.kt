package sola.martin.open_api_android_app.session

import android.app.Application
import sola.martin.open_api_android_app.presistence.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)
{



}