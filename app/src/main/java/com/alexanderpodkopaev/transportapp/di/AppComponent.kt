package com.alexanderpodkopaev.transportapp.di

import com.alexanderpodkopaev.transportapp.screens.main.MainActivity
import com.alexanderpodkopaev.transportapp.screens.main.MainFragment
import dagger.Component
import dagger.Module

@Component(modules = [ApplicationModule::class])
interface AppComponent {

    //Activities
    fun inject(activity: MainActivity)

    //Fragments
    fun inject(fragment: MainFragment)
}