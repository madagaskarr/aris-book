package io.tigranes.arisbook.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ApplicationModule {

    @Provides
    @Singleton
    fun providesContext(app: Application): Context = app


}