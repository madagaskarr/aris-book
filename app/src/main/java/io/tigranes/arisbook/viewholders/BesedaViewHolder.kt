package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.tigranes.arisbook.R
import io.tigranes.arisbook.dashboard.GenericAdapter
import io.tigranes.arisbook.model.BesedaCardProtocolTemplate

class BesedaViewHolder(private var layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<BesedaCardProtocolTemplate> {

    private var besedaTitleTextView: TextView = layoutView.findViewById(R.id._beseda_title_text_view)
    private var besedaNumberTextView: TextView = layoutView.findViewById(R.id._beseda_number_text_view)
    private var besedaCoverImageView: ImageView = layoutView.findViewById(R.id._beseda_cover_image_view)
    private var besedaDescriptionTextView: TextView = layoutView.findViewById(R.id._beseda_beginning_text_view)

    override fun bind(data: BesedaCardProtocolTemplate) {
        besedaTitleTextView.text = data.besedaTitle
        besedaNumberTextView.text = data.besedaNumber
        besedaDescriptionTextView.text = data.description
        Glide.with(layoutView.context).load(data.besedaCoverImageSource).into(besedaCoverImageView);

    }

}