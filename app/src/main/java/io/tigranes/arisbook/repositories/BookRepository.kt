package io.tigranes.arisbook.repositories

import io.tigranes.arisbook.model.DashboardCardProtocol

interface BookRepository {
    fun getAllBesedas(): List<DashboardCardProtocol>
    fun getAllChaptersForBeseda(ID: String): List<DashboardCardProtocol>
}