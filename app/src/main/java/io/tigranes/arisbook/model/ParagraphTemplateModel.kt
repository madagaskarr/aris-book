package io.tigranes.arisbook.model

data class QuestionTemplateModel(
    val ID: String? = null,
    val question: String?,
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.QUESTION
}