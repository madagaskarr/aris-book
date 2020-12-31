package io.tigranes.arisbook.model

data class SingleImageTemplateModel(
    val ID: String? = null,
    val imageSource: String?,
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.SINGLE_IMAGE
}