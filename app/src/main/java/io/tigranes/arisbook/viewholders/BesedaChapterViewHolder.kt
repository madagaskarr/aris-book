package io.tigranes.arisbook.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.tigranes.arisbook.ActionHandler
import io.tigranes.arisbook.R
import io.tigranes.arisbook.GenericAdapter
import io.tigranes.arisbook.model.BesedaChapterCardProtocolTemplate

class BesedaChapterViewHolder(private var layoutView: View,  private val actionHandler: ActionHandler): RecyclerView.ViewHolder(layoutView), GenericAdapter.Binder<BesedaChapterCardProtocolTemplate> {

    private var besedaTitle: TextView = layoutView.findViewById(R.id._beseda_with_chapter_title_text_view)
    private var chapterTitle: TextView = layoutView.findViewById(R.id._chapter_title_text_view)
    private var description: TextView = layoutView.findViewById(R.id._starting_text_text_view)
    private var besedaCoverImageView: ImageView = layoutView.findViewById(R.id._image_view)
    private var tagOneTitle: TextView = layoutView.findViewById(R.id._first_tag)
    private var tagTwoTitle: TextView = layoutView.findViewById(R.id._second_tag)
    private var shareCTATitle: TextView = layoutView.findViewById(R.id._share_text_view)

    override fun bind(data: BesedaChapterCardProtocolTemplate) {
        besedaTitle.text = data.besedaTitle
        chapterTitle.text = data.chapterTitle
        description.text = data.description
        tagOneTitle.text = data.firstTag
        tagTwoTitle.text = data.secondtag
        shareCTATitle.text = data.ctaTitle
        Glide.with(layoutView.context).load(data.chapterImageSource).into(besedaCoverImageView)

        itemView.setOnClickListener {
            actionHandler.onChapterClicked(data.ID ?: "this is mock ID for CHAPTER")
        }

    }

}