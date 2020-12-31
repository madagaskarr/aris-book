package io.tigranes.arisbook.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.tigranes.arisbook.providers.BookMockProvider
import io.tigranes.arisbook.repositories.BookRepository
import io.tigranes.arisbook.viewmodels.DashboardViewModel
import javax.inject.Singleton


@Module
abstract class ViewModelModule {

    @Singleton
    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViwModel(dashboardViewModel: DashboardViewModel): ViewModel

    @Binds
    abstract fun bindUserRepository(bookRepository: BookMockProvider): BookRepository
}