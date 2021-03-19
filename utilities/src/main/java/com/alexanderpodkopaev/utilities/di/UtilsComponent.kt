package com.alexanderpodkopaev.utilities.di

import android.app.Application
import dagger.Component

@Component(modules = [UtilsModule::class])
interface UtilsComponent {

    @Component.Builder
    interface Builder {
        fun application(application: Application) : UtilsComponent.Builder
        fun build(): UtilsComponent
    }
}