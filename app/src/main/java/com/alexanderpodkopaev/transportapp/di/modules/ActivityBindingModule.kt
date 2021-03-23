package com.alexanderpodkopaev.transportapp.di.modules

import com.alexanderpodkopaev.transportapp.screens.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}