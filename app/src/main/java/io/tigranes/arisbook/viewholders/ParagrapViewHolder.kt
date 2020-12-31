package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaCoverDescriptionTemplate
import io.tigranes.arisbook.model.ParagraphTemplateModel
import io.tigranes.arisbook.model.QuestionTemplateModel

class ParagrapViewHolder(layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<ParagraphTemplateModel> {

    private var paragraphText: TextView = layoutView.findViewById(R.id._title_text_view)

    override fun bind(data: ParagraphTemplateModel) {
        paragraphText.text = data.paragraphText
    }

}