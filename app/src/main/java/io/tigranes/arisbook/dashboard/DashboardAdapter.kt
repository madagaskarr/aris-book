package io.tigranes.arisbook.dashboard

import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.R
import io.tigranes.arisbook.model.DashboardCardProtocol
import io.tigranes.arisbook.model.DashboardCardTemplate
import io.tigranes.arisbook.viewholders.BesedaChapterViewHolder
import io.tigranes.arisbook.viewholders.BesedaViewHolder
import io.tigranes.arisbook.viewholders.CoverImageViewHolder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DashboardAdapter @Inject constructor(): GenericAdapter<DashboardCardProtocol>() {

    private lateinit var onDashboardItemClickedInterface: OnDashboardItemClickedInterface

    fun setDashboardItemClickedInterface(fragment: Fragment) {
        onDashboardItemClickedInterface = fragment as OnDashboardItemClickedInterface
    }

    override fun getLayoutId(position: Int, descriptionProtocole: DashboardCardProtocol): Int {
        return when (descriptionProtocole.getTemplateID()) {
            DashboardCardTemplate.BESEDA -> R.layout.layout_beseda_card_view
            DashboardCardTemplate.COVER_IMAGE -> R.layout.layout_full_image
            DashboardCardTemplate.CHAPTER -> R.layout.layout_beseda_chapter

        }
    }

    override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {

        return when(viewType) {
            R.layout.layout_beseda_card_view -> BesedaViewHolder(view, onDashboardItemClickedInterface)
            R.layout.layout_full_image -> CoverImageViewHolder(view)
            R.layout.layout_beseda_chapter -> BesedaChapterViewHolder(view)
            else -> BesedaViewHolder(view, onDashboardItemClickedInterface)
        }
    }

}