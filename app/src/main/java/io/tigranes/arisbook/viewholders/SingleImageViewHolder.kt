package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.tigranes.arisbook.ActionHandler
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaCoverDescriptionTemplate
import io.tigranes.arisbook.model.ParagraphTemplateModel
import io.tigranes.arisbook.model.QuestionTemplateModel
import io.tigranes.arisbook.model.SingleImageTemplateModel

class SingleImageViewHolder(private val layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<SingleImageTemplateModel> {

    private var imageView: ImageView = layoutView.findViewById(R.id._single_image_image_view)

    override fun bind(data: SingleImageTemplateModel) {
        Glide.with(layoutView.context).load(data.imageSource).into(imageView);
    }

}