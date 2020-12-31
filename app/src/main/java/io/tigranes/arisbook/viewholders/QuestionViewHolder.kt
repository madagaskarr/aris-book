package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaCoverDescriptionTemplate
import io.tigranes.arisbook.model.QuestionTemplateModel

class QuestionViewHolder(layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<QuestionTemplateModel> {

    private var question: TextView = layoutView.findViewById(R.id._subtitle_text_view)

    override fun bind(data: QuestionTemplateModel) {
        question.text = data.question
    }

}