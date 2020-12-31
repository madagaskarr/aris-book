package io.tigranes.arisbook.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.arisbook.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

}