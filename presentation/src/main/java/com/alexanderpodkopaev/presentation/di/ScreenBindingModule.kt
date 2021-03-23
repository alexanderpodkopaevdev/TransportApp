package com.alexanderpodkopaev.presentation.di

import com.alexanderpodkopaev.domain.di.modules.UseCasesModules
import com.alexanderpodkopaev.presentation.screens.CountriesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [UseCasesModules::class])
abstract class ScreenBindingModule {

    @ContributesAndroidInjector
    abstract fun countriesFragment(): CountriesFragment
}