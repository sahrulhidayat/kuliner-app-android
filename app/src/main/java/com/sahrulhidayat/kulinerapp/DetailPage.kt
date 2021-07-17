package com.sahrulhidayat.kulinerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailPage : AppCompatActivity() {
    companion object {
        const val EXTRA_PHOTO = "item photo"
        const val EXTRA_NAME = "item name"
        const val EXTRA_CITY = "item city"
        const val EXTRA_PRICE = "item price"
        const val EXTRA_DESCRIPTION = "item detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val actionBar = supportActionBar

        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_button)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val imgItemPhoto:ImageView = findViewById(R.id.img_item_photo)
        val tvItemName:TextView = findViewById(R.id.tv_item_name)
        val tvItemCity:TextView = findViewById(R.id.tv_item_city)
        val tvItemPrice:TextView = findViewById(R.id.tv_item_price)
        val tvItemDescription:TextView = findViewById(R.id.tv_item_description)

        val itemPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val itemName = intent.getStringExtra(EXTRA_NAME)
        val itemCity = intent.getStringExtra(EXTRA_CITY)
        val itemPrice = intent.getStringExtra(EXTRA_PRICE)
        val itemDescription = intent.getStringExtra(EXTRA_DESCRIPTION)

        imgItemPhoto.setImageResource(itemPhoto)
        tvItemName.text = itemName
        tvItemCity.text = itemCity
        tvItemPrice.text = itemPrice
        tvItemDescription.text = itemDescription
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}