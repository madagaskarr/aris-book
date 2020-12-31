package io.tigranes.arisbook

interface ActionHandler {
    fun onDashboardBesedaClicked(besedaID: String)
    fun onChapterClicked(chpterID: String)
}