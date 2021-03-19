package com.alexanderpodkopaev.transportapp.di

import android.app.Application
import android.content.Context
import com.alexanderpodkopaev.transportapp.TransportApp
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: TransportApp) {

    @Provides
    fun provideApplication() : Application {
        return application
    }

    @Provides
    fun provideContext() : Context {
        return application.applicationContext
    }
}