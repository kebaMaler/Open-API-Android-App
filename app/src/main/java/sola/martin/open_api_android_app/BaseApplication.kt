package sola.martin.open_api_android_app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import sola.martin.open_api_android_app.di.DaggerAppComponent

class BaseApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }


}