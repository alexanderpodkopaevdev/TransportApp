package com.alexanderpodkopaev.utilities.di

import android.app.Application
import android.content.Context
import com.alexanderpodkopaev.utilities.resources.IResourceProvider
import com.alexanderpodkopaev.utilities.resources.ResourceProvider
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UtilsModule {

    @Binds
    abstract fun bindContext(application: Application): Context

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun bindResourceProvider(context: Context) : IResourceProvider {
            return ResourceProvider(context = context)
        }
    }
}