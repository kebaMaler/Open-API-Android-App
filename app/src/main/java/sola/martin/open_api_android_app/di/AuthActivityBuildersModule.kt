package sola.martin.open_api_android_app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sola.martin.open_api_android_app.di.auth.AuthFragmentBuildersModule
import sola.martin.open_api_android_app.di.auth.AuthModule
import sola.martin.open_api_android_app.di.auth.AuthScope
import sola.martin.open_api_android_app.di.auth.AuthViewModelModule
import sola.martin.open_api_android_app.ui.auth.AuthActivity

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}