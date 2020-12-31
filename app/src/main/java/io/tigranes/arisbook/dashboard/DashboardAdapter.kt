package io.tigranes.arisbook.dashboard

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.R
import io.tigranes.arisbook.model.DashboardCardProtocol
import io.tigranes.arisbook.model.DashboardCardTemplate
import io.tigranes.arisbook.viewholders.BesedaViewHolder
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DashboardAdapter @Inject constructor(): GenericAdapter<DashboardCardProtocol>() {

    override fun getLayoutId(position: Int, descriptionProtocole: DashboardCardProtocol): Int {
        return when (descriptionProtocole.getTemplateID()) {
            DashboardCardTemplate.BESEDA -> R.layout.layout_beseda_card_view
        }
    }

    override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            R.layout.layout_beseda_card_view -> BesedaViewHolder(view)
            else -> BesedaViewHolder(view)
        }
    }

}