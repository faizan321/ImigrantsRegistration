package com.hisdu.meas.di.module

import android.app.Application
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.hisdu.meas.data.source.local.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Provides
    @Singleton
    @JvmStatic
    fun provideAppDatabase(application: Application): AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, AppDatabase.DB_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()//allows database to be cleared after upgrading version
            .build()
}

