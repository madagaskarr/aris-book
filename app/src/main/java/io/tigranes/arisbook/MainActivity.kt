package io.tigranes.arisbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import io.tigranes.arisbook.fragments.ChaptersFragment
import io.tigranes.arisbook.fragments.DashboardFragment

class MainActivity: DaggerAppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener,
    DashboardFragment.DashboardClickProtocole,
    ChaptersFragment.DashboardClickProtocole {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startFragmentTransaction(DashboardFragment.newInstance())


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var doesTransactionSucceeded = false

        when(item.itemId) {

            R.id._dashboard_menu_item -> {

                startFragmentTransaction(DashboardFragment.newInstance())
                doesTransactionSucceeded = true
            }

            R.id._more_menu_item -> {
                doesTransactionSucceeded = true
            }

            R.id._search_menu_item -> {
                doesTransactionSucceeded = true
            }

            R.id._add_note_menu_item -> {
                doesTransactionSucceeded = true
            }
        }
        return doesTransactionSucceeded
    }

    private fun startFragmentTransaction(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id._bottom_navigation_activity_fragment_container, fragment)
            .commit()
    }

    override fun onBesedaClicked(besedaPosition: Int) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("ChaptersFragment")
            .replace(R.id._bottom_navigation_activity_fragment_container, ChaptersFragment.newInstance(""))
            .commit()
    }

    override fun onChapterClicked(chapterPosition: Int) {
    }
}