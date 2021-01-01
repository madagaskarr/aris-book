package io.tigranes.arisbook.model

data class ParagraphTemplateModel(
    val ID: String? = null,
    val paragraphText: String?,
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.PARAGRAPH
}