package io.tigranes.arisbook.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.android.support.DaggerFragment
import io.tigranes.arisbook.ActionHandler
import io.tigranes.arisbook.R
import io.tigranes.arisbook.dashboard.MyAdapter
import io.tigranes.arisbook.viewmodels.ChaptersViewModel
import javax.inject.Inject

private const val CHAPTER_ID_BUNDLE_KEY = "CHAPTER_ID_BUNDLE_KEY"

class ChaptersFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    @Inject
    lateinit var adapter: MyAdapter

    private lateinit var chaptersViewModel: ChaptersViewModel
    private lateinit var dashboardRecyclerView: RecyclerView
    private lateinit var actionHandler: ActionHandler

    private var chapterID: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        actionHandler = context as ActionHandler

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            chapterID = it.getString(CHAPTER_ID_BUNDLE_KEY)
        }

        chaptersViewModel = viewModelFactory.create(ChaptersViewModel::class.java)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chapters, container, false)


        dashboardRecyclerView = view.findViewById(R.id._chapters_recycler_view)
        dashboardRecyclerView.layoutManager = LinearLayoutManager(context)
        dashboardRecyclerView.adapter = adapter
        adapter.setActionHandler(actionHandler)
        adapter.setItems(chaptersViewModel.getAllBesedas())

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(chhapterID: String) = ChaptersFragment().apply {
                arguments = Bundle().apply {
                    putString(CHAPTER_ID_BUNDLE_KEY, chapterID)
                }
            }
    }
}