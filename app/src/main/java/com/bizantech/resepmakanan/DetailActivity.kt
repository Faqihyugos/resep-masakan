package com.bizantech.resepmakanan

import android.view.View
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LEVEL = "extra_level"
        const val EXTRA_INGREDIENTS = "extra_ingredients"
        const val EXTRA_DIRECTIONS = "extra_directions"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.icon_back)
            setDisplayHomeAsUpEnabled(true)
        }

        val imgItem: ImageView = findViewById(R.id.img_item)
        val tvLevel: TextView = findViewById(R.id.tv_item_level)
        val tvIngredients: TextView = findViewById(R.id.tv_item_ingredients)
        val tvDirections: TextView = findViewById(R.id.tv_item_directions)

        val fabShare: FloatingActionButton = findViewById(R.id.fab_share)
        fabShare.setOnClickListener(this)

        val image = intent.getIntExtra(EXTRA_IMAGE, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val level = intent.getStringExtra(EXTRA_LEVEL)
        val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        val directions = intent.getStringExtra(EXTRA_DIRECTIONS)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgItem)

        tvLevel.text = level
        tvIngredients.text = ingredients
        tvDirections.text = directions

        supportActionBar?.title = name
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab_share -> {
                val name = intent.getStringExtra(EXTRA_NAME)
                val level = intent.getStringExtra(EXTRA_LEVEL)
                val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
                val directions = intent.getStringExtra(EXTRA_DIRECTIONS)

                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Resep Makanan\n\n" +
                            "$name\n" +
                            "$level\n\n" +
                            "Bahan : \n$ingredients\n" +
                            "Petunjuk : \n$directions")
                    type = "text/plain"
                }
                startActivity(shareIntent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}