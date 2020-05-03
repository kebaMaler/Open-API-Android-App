package sola.martin.open_api_android_app.di.auth

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import sola.martin.open_api_android_app.api.auth.OpenApiAuthService
import sola.martin.open_api_android_app.presistence.AccountPropertiesDao
import sola.martin.open_api_android_app.presistence.AuthTokenDao
import sola.martin.open_api_android_app.repository.auth.AuthRepository
import sola.martin.open_api_android_app.session.SessionManager

@Module
class AuthModule{

    // TEMPORARY
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }

}