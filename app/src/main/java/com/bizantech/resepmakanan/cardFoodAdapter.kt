package com.bizantech.resepmakanan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardFoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<CardFoodAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgFood: ImageView = itemView.findViewById(R.id.img_item)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLevel: TextView = itemView.findViewById(R.id.tv_item_level)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.gambar)
            .apply(RequestOptions().override(300, 500))
            .into(holder.imgFood)

        holder.tvName.text = food.nama
        holder.tvLevel.text = food.level

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_IMAGE, food.gambar)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, food.nama)
            moveDetail.putExtra(DetailActivity.EXTRA_LEVEL, food.level)
            moveDetail.putExtra(DetailActivity.EXTRA_INGREDIENTS, food.bahan)
            moveDetail.putExtra(DetailActivity.EXTRA_DIRECTIONS, food.petunjuk)
            mContext.startActivity(moveDetail)
        }
    }
}