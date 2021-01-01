package io.tigranes.arisbook

import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.ActionHandler
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.R
import io.tigranes.arisbook.fragments.ChaptersFragment
import io.tigranes.arisbook.model.DashboardCardProtocol
import io.tigranes.arisbook.model.DashboardCardTemplate
import io.tigranes.arisbook.viewholders.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyAdapter @Inject constructor(): GenericAdapter<DashboardCardProtocol>() {

    private lateinit var actionHandler: ActionHandler

    fun setActionHandler(actionHandler: ActionHandler) {
        this.actionHandler = actionHandler
    }

    override fun getLayoutId(position: Int, descriptionProtocole: DashboardCardProtocol): Int {
        return when (descriptionProtocole.getTemplateID()) {
            DashboardCardTemplate.BESEDA -> R.layout.layout_beseda_card_view
            DashboardCardTemplate.COVER_IMAGE -> R.layout.layout_full_image
            DashboardCardTemplate.CHAPTER -> R.layout.layout_beseda_chapter
            DashboardCardTemplate.QUESTION -> R.layout.layout_question
            DashboardCardTemplate.PARAGRAPH -> R.layout.layout_paragraph
            DashboardCardTemplate.SINGLE_IMAGE -> R.layout.layout_single_image
            DashboardCardTemplate.TESTIMONIAL -> R.layout.layout_testimonial

        }
    }

    override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {

        return when(viewType) {
            R.layout.layout_beseda_card_view -> BesedaViewHolder(view, actionHandler)
            R.layout.layout_full_image -> CoverImageViewHolder(view)
            R.layout.layout_beseda_chapter -> BesedaChapterViewHolder(view, actionHandler)
            R.layout.layout_question -> QuestionViewHolder(view)
            R.layout.layout_paragraph -> ParagrapViewHolder(view, actionHandler)
            R.layout.layout_single_image -> SingleImageViewHolder(view)
            R.layout.layout_testimonial -> TestimonialViewHolder(view)
            else -> BesedaViewHolder(view, actionHandler)
        }
    }

}