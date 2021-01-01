package io.tigranes.arisbook.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.android.support.DaggerFragment
import io.tigranes.arisbook.ActionHandler
import io.tigranes.arisbook.MyAdapter
import io.tigranes.arisbook.R
import io.tigranes.arisbook.viewmodels.ChaptersViewModel
import io.tigranes.arisbook.viewmodels.SingleChapterViewModel
import javax.inject.Inject


class SingleChapetFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    @Inject
    lateinit var adapter: MyAdapter

    private lateinit var singleChapterViewModel: SingleChapterViewModel
    private lateinit var dashboardRecyclerView: RecyclerView
    private lateinit var actionHandler: ActionHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        singleChapterViewModel = viewModelFactory.create(SingleChapterViewModel::class.java)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        actionHandler = context as ActionHandler

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_single_chapet, container, false)

        dashboardRecyclerView = view.findViewById(R.id._single_chapter_recycler_view)
        dashboardRecyclerView.layoutManager = LinearLayoutManager(context)
        dashboardRecyclerView.adapter = adapter
        adapter.setActionHandler(actionHandler)
        adapter.setItems(singleChapterViewModel.getAllBesedas())

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SingleChapetFragment()
    }
}