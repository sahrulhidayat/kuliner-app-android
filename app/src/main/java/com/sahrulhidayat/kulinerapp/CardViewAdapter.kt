package com.sahrulhidayat.kulinerapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(private val listFoods: ArrayList<Food>) : RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val item = listFoods[position]
        val mContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(item.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = item.name
        holder.tvDetail.text = item.description

        holder.btnDetail.setOnClickListener {
            val showDetailPage = Intent(mContext, DetailPage::class.java)
            showDetailPage.putExtra(DetailPage.EXTRA_PHOTO, listFoods[holder.adapterPosition].photo)
            showDetailPage.putExtra(DetailPage.EXTRA_NAME, listFoods[holder.adapterPosition].name)
            showDetailPage.putExtra(DetailPage.EXTRA_DESCRIPTION, listFoods[holder.adapterPosition].description)
            mContext.startActivity(showDetailPage) }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listFoods[holder.adapterPosition].name,
            Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listFoods.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_action_detail)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

}
