package com.hisdu.meas

import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import androidx.multidex.MultiDex
import com.gu.toolargetool.TooLargeTool
import com.hisdu.meas.di.component.AppComponent
import com.hisdu.meas.di.component.AppComponentProvider
import com.hisdu.meas.di.component.DaggerAppComponent
import com.pixplicity.easyprefs.library.Prefs
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


/**
 * @Author ZARA.
 */
class MainApplication : Application(), AppComponentProvider {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
        Prefs.Builder()
            .setContext(this)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(packageName)
            .setUseDefaultSharedPreference(true)
            .build()
        appComponent = DaggerAppComponent.factory().create(this).also {
            it.inject(this) }

        TooLargeTool.startLogging(this);
        Logger.addLogAdapter(AndroidLogAdapter())


    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun provideAppComponent(): AppComponent = appComponent

}