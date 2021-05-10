package com.bizantech.resepmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerListView()
    }

    private fun showRecyclerListView() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listViewAdapter = ListFoodAdapter(list)
        rvFood.adapter = listViewAdapter
    }

    private fun showRecyclerCardView() {
        rvFood.layoutManager = GridLayoutManager(this, 2)
        val cardViewAdapter = CardFoodAdapter(list)
        rvFood.adapter = cardViewAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_icon -> {
                val moveActivity = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveActivity)
            }

            R.id.action_listview -> {
                showRecyclerListView()
            }

            R.id.action_cardview -> {
                showRecyclerCardView()
            }
        }
    }
}