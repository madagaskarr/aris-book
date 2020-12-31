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
import io.tigranes.arisbook.viewmodels.DashboardViewModel
import javax.inject.Inject

class DashboardFragment: DaggerFragment() {


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var adapter: MyAdapter

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var dashboardRecyclerView: RecyclerView
    private lateinit var actionHandler: ActionHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dashboardViewModel = viewModelFactory.create(DashboardViewModel::class.java)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        dashboardRecyclerView = view.findViewById(R.id._dashboard_recycler_view)
        dashboardRecyclerView.layoutManager = LinearLayoutManager(context)
        dashboardRecyclerView.adapter = adapter
        adapter.setActionHandler(actionHandler)
        adapter.setItems(dashboardViewModel.getAllBesedas())



        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        actionHandler = context as ActionHandler

    }

    companion object {
        @JvmStatic
        fun newInstance() = DashboardFragment()
    }

}