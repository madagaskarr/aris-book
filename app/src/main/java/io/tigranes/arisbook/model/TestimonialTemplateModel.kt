package io.tigranes.arisbook.model

data class TestimonialTemplateModel(
    val ID: String? = null,
    val testimonialText: String?,
): DashboardCardProtocol  {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.TESTIMONIAL
}