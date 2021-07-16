package com.sahrulhidayat.kulinerapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes:RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter
    }

    private fun showAboutPage() {
        val aboutPage = Intent(this@MainActivity, AboutPage::class.java)
        startActivity(aboutPage)
    }

    private fun showFavoritePage() {
        val favoritePage = Intent(this@MainActivity, FavoritePage::class.java)
        startActivity(favoritePage)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        selectMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun selectMenu(selectedMenu: Int) {
        when (selectedMenu) {
            R.id.action_about -> {
                showAboutPage()
            }
            R.id.action_favorite -> {
                showFavoritePage()
            }
        }
    }
}