package io.tigranes.arisbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import io.tigranes.arisbook.fragments.ChaptersFragment
import io.tigranes.arisbook.fragments.DashboardFragment
import io.tigranes.arisbook.fragments.SingleChapetFragment


class MainActivity: DaggerAppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener, ActionHandler {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var bottomView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id._bottom_nav_bar)
        bottomView = findViewById(R.id._bottom_up_view)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        startFragmentTransaction(DashboardFragment.newInstance())


    }

    override fun onBackPressed() {
        if (bottomView.visibility == View.VISIBLE) {

            val aniSlide: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.anim_bottom_down)
            bottomView.startAnimation(aniSlide)
            bottomView.visibility =  View.GONE
        } else {
            super.onBackPressed()

        }


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


    override fun onDashboardBesedaClicked(besedaID: String) {
        Toast.makeText(this, "BESEDA - $besedaID", Toast.LENGTH_SHORT).show()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("ChaptersFragment")
            .replace(
                R.id._bottom_navigation_activity_fragment_container, ChaptersFragment.newInstance(
                    ""
                )
            )
            .commit()
    }

    override fun onChapterClicked(chpterID: String) {
        Toast.makeText(this, chpterID, Toast.LENGTH_SHORT).show()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("ChaptersFragment")
            .replace(
                R.id._bottom_navigation_activity_fragment_container,
                SingleChapetFragment.newInstance()
            )
            .commit()
    }

    override fun onParagraphClicked(footnotes: String) {

        val textview = bottomView.findViewById<TextView>(R.id._foot_note_text)

        when (bottomView.visibility) {
            View.GONE, View.INVISIBLE -> {
                textview.text = footnotes
                val aniSlide: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.anim_bottom_up)
                bottomView.startAnimation(aniSlide)
                bottomView.visibility =  View.VISIBLE
            }
            View.VISIBLE -> {
                val aniSlide: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.anim_bottom_down)
                bottomView.startAnimation(aniSlide)
                bottomView.visibility =  View.GONE
            }
        }





    }

}