package io.tigranes.arisbook.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.arisbook.fragments.ChaptersFragment
import io.tigranes.arisbook.fragments.DashboardFragment
import io.tigranes.arisbook.fragments.SingleChapetFragment


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun bindChaptersFragment(): ChaptersFragment

    @ContributesAndroidInjector
    abstract fun bindSingleChapetFragment(): SingleChapetFragment
}
