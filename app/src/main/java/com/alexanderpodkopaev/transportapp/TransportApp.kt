package com.alexanderpodkopaev.transportapp

import android.app.Application
import com.alexanderpodkopaev.transportapp.di.AppComponent
import com.alexanderpodkopaev.transportapp.di.ApplicationModule
import com.alexanderpodkopaev.transportapp.di.DaggerAppComponent

class TransportApp : Application() {


    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}