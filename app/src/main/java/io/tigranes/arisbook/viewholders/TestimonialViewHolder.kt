package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaCoverDescriptionTemplate
import io.tigranes.arisbook.model.ParagraphTemplateModel
import io.tigranes.arisbook.model.QuestionTemplateModel
import io.tigranes.arisbook.model.TestimonialTemplateModel

class TestimonialViewHolder(layoutView: View): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<TestimonialTemplateModel> {

    private var testimonialtext: TextView = layoutView.findViewById(R.id._testimonial_text_view)

    override fun bind(data: TestimonialTemplateModel) {
        testimonialtext.text = data.testimonialText
    }

}