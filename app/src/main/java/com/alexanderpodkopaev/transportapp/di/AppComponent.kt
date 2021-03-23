package com.alexanderpodkopaev.transportapp.di

import android.app.Application
import com.alexanderpodkopaev.presentation.di.PresentationComponent
import com.alexanderpodkopaev.presentation.di.ScreenBindingModule
import com.alexanderpodkopaev.transportapp.TransportApp
import com.alexanderpodkopaev.transportapp.di.modules.ActivityBindingModule
import com.alexanderpodkopaev.utilities.di.UtilsComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBindingModule::class,
        ScreenBindingModule::class
    ],
    dependencies = [PresentationComponent::class, UtilsComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<TransportApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun presentationComponent(presentationComponent: PresentationComponent): AppComponent.Builder
        fun utilsComponent(utilsComponent: UtilsComponent): AppComponent.Builder

        fun build(): AppComponent
    }
}