package com.hisdu.meas.di.component

import android.app.Application
import com.hisdu.meas.MainApplication
import com.hisdu.meas.di.AppScope
import com.hisdu.meas.di.module.BinderModule
import com.hisdu.meas.di.module.DatabaseModule
import com.hisdu.meas.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@AppScope
@Singleton
@Component(modules = [
    DatabaseModule::class,
    NetworkModule::class,
    BinderModule::class,
    SubComponentsModule::class
])
interface AppComponent {

    fun inject(app: MainApplication)

    fun mainComponent(): MainComponent.Factory


    @Component.Factory
    interface Factory {

        fun create(@BindsInstance app: Application): AppComponent
    }
}