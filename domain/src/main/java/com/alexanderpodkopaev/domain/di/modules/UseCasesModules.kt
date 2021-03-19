package com.alexanderpodkopaev.domain.di.modules

import com.alexanderpodkopaev.domain.usecases.countries.FetchCountries
import dagger.Module
import dagger.Provides

@Module
class UseCasesModules {

    @Provides
    fun providesFetchCountriesUseCase(): FetchCountries {
        return FetchCountries()
    }
}