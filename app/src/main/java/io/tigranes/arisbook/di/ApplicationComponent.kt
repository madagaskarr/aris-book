package io.tigranes.arisbook.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import io.tigranes.arisbook.ArisApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
//    ApplicationModule::class,
//    ActivityModule::class,
//    FragmentModule::class,
//    ViewModelFactoryModule::class,
//    ViewModelModule::class,
//    FirestoreModule::class,
])
interface ApplicationComponent: AndroidInjector<ArisApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: ArisApplication): Builder

        fun build(): ApplicationComponent
    }

    override fun inject(app: ArisApplication)
}