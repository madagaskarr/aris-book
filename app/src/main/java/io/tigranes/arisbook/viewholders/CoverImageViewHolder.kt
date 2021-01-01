package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaCoverDescriptionTemplate

class CoverImageViewHolder(layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<BesedaCoverDescriptionTemplate> {

    private var besedaNumber: TextView = layoutView.findViewById(R.id._beseda_number_text_view)
    private var besedaTitle: TextView = layoutView.findViewById(R.id._beseda_title_text_view)
    private var lottieImageView: LottieAnimationView = layoutView.findViewById(R.id.lottie_layer_name)


    override fun bind(data: BesedaCoverDescriptionTemplate) {
        besedaNumber.text = data.besedaNumber
        besedaTitle.text = data.besedaTitle

        lottieImageView.setAnimation(R.raw.book_lottie_three)
        lottieImageView.playAnimation()
    }

}