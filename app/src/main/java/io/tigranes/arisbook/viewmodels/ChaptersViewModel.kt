package io.tigranes.arisbook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.tigranes.arisbook.model.DashboardCardProtocol
import io.tigranes.arisbook.repositories.BookRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChaptersViewModel @Inject constructor(private val bookProvider: BookRepository): ViewModel() {

    val resultForAallBesedas = MutableLiveData<List<DashboardCardProtocol>>()

    fun getAllBesedas(): List<DashboardCardProtocol> {
        resultForAallBesedas.value = bookProvider.getAllBesedas()
        return bookProvider.getAllChaptersForBeseda("sdf")
    }



}