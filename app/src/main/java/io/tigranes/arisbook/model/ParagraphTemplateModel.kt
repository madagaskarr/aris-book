package io.tigranes.arisbook.model

data class ParagraphTemplateModel(
    val ID: String? = null,
    val paragraphText: String?,
    val footnoes: List<String>? = null
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.PARAGRAPH
}