package io.tigranes.arisbook.model

data class BesedaCardProtocolTemplate(
    val ID: String? = null,
    val besedaNumber: String? = null,
    val besedaTitle: String?,
    val besedaCoverImageSource: String?,
    val description: String?
): DashboardCardProtocol {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.BESEDA
}