package com.sahrulhidayat.kulinerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPage : AppCompatActivity() {
    companion object {
        const val EXTRA_PHOTO = "item photo"
        const val EXTRA_NAME = "item name"
        const val EXTRA_DESCRIPTION = "item detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val imgItemPhoto:ImageView = findViewById(R.id.img_item_photo)
        val tvItemName:TextView = findViewById(R.id.tv_item_name)
        val tvItemDescription:TextView = findViewById(R.id.tv_item_description)

        val itemPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val itemName = intent.getStringExtra(EXTRA_NAME)
        val itemDetail = intent.getStringExtra(EXTRA_DESCRIPTION)

        imgItemPhoto.setImageResource(itemPhoto)
        tvItemName.text = itemName
        tvItemDescription.text = itemDetail
    }
}