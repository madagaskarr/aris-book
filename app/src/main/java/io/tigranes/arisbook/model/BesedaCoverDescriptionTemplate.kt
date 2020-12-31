package io.tigranes.arisbook.model

data class BesedaCoverDescriptionTemplate(
    val ID: String? = null,
    val besedaNumber: String?,
    val besedaTitle: String?
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.COVER_IMAGE
}