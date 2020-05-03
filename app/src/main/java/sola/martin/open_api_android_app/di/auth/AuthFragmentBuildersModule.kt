package sola.martin.open_api_android_app.di.auth

import dagger.Module
import dagger.android.ContributesAndroidInjector
import sola.martin.open_api_android_app.ui.auth.ForgotPasswordFragment
import sola.martin.open_api_android_app.ui.auth.LauncherFragment
import sola.martin.open_api_android_app.ui.auth.LoginFragment
import sola.martin.open_api_android_app.ui.auth.RegisterFragment

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment
}