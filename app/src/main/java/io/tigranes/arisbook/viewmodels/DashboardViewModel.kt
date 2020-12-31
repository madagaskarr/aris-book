package io.tigranes.arisbook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.tigranes.arisbook.dashboard.DashboardAdapter
import io.tigranes.arisbook.model.BesedaCardProtocolTemplate
import io.tigranes.arisbook.providers.BookMockProvider
import io.tigranes.arisbook.repositories.BookRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DashboardViewModel @Inject constructor(private val bookProvider: BookRepository, private val dashboardAdapter: DashboardAdapter): ViewModel() {

    val resultForAallBesedas = MutableLiveData<List<BesedaCardProtocolTemplate>>()

    fun getAllBesedas() {
        resultForAallBesedas.value = bookProvider.getAllBesedas()
    }

    fun updateAdapter() {
        dashboardAdapter.setItems(resultForAallBesedas.value!!)
    }

    fun getAdapter(): DashboardAdapter = dashboardAdapter
}