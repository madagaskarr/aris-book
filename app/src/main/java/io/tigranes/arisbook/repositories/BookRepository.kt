package io.tigranes.arisbook.repositories

import io.tigranes.arisbook.model.BesedaCardProtocolTemplate

interface BookRepository {
    fun getAllBesedas(): List<BesedaCardProtocolTemplate>
}