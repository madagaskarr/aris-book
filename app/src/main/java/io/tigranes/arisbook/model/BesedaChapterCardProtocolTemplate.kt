package io.tigranes.arisbook.model

data class BesedaChapterCardProtocolTemplate(
    val ID: String? = null,
    val besedaTitle: String? = null,
    val chapterTitle: String?,
    val chapterImageSource: String?,
    val description: String?,
    val firstTag: String?,
    val secondtag: String?,
    val ctaTitle: String?
): DashboardCardProtocol {
    override fun getTemplateID(): DashboardCardTemplate = DashboardCardTemplate.CHAPTER
}