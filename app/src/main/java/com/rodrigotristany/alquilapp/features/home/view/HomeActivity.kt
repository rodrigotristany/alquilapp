package com.rodrigotristany.alquilapp.features.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.rodrigotristany.alquilapp.AlquilAppApplication
import com.rodrigotristany.alquilapp.R
import com.rodrigotristany.alquilapp.features.home.di.DaggerHomeComponent
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_main.*

class HomeActivity : AppCompatActivity(),
                           NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initInjector()
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    private fun initInjector() {
        DaggerHomeComponent.builder()
            .applicationComponent((application as AlquilAppApplication).applicationComponent)
            .build()
            .inject(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_contact -> {
                // Handle the camera action
            }
            R.id.nav_delete_user -> {

            }
            R.id.nav_favourites -> {

            }
            R.id.nav_logout -> {

            }
            R.id.nav_start -> {

            }
            R.id.nav_view -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
