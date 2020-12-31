package io.tigranes.arisbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import io.tigranes.arisbook.fragments.DashboardFragment

class MainActivity: DaggerAppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id._bottom_navigation_activity_fragment_container, DashboardFragment.newInstance())
            .commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id._bottom_navigation_activity_fragment_container, DashboardFragment.newInstance())
            .commit()

        return true
    }
}