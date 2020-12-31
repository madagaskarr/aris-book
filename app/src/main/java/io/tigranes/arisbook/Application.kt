package io.tigranes.arisbook

import dagger.android.DaggerApplication
import io.tigranes.arisbook.di.DaggerApplicationComponent

class ArisApplication: DaggerApplication() {
    override fun applicationInjector() =  DaggerApplicationComponent.builder().application(this).build()
}