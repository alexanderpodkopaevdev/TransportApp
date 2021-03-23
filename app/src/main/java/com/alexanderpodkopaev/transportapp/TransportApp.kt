package com.alexanderpodkopaev.transportapp

import android.app.Application
import com.alexanderpodkopaev.domain.di.DaggerDomainComponent
import com.alexanderpodkopaev.domain.di.DomainComponent
import com.alexanderpodkopaev.presentation.di.DaggerPresentationComponent
import com.alexanderpodkopaev.presentation.di.PresentationComponent
import com.alexanderpodkopaev.transportapp.di.AppComponent
import com.alexanderpodkopaev.transportapp.di.DaggerAppComponent
import com.alexanderpodkopaev.utilities.di.DaggerUtilsComponent
import com.alexanderpodkopaev.utilities.di.UtilsComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class TransportApp : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent
            .builder()
            .build()
    }

    private fun provideUtilsComponent(): UtilsComponent {
        return DaggerUtilsComponent.builder()
            .application(this)
            .build()
    }

    private fun providePresentationComponent(): PresentationComponent {
        return DaggerPresentationComponent.builder()
            .domainComponent(provideDomainComponent())
            .utilsComponent(provideUtilsComponent())
            .build()
    }

    private fun provideDomainComponent(): DomainComponent {
        return DaggerDomainComponent.builder()
            .build()
    }




}