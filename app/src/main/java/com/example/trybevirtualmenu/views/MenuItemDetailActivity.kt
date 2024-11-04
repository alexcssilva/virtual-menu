package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.DishesDatabase
import com.google.android.material.imageview.ShapeableImageView

class MenuItemDetailActivity : AppCompatActivity() {

    private val image: ShapeableImageView by lazy { findViewById(R.id.detail_image) }
    private val name: TextView by lazy { findViewById(R.id.detail_name) }
    private val description: TextView by lazy { findViewById(R.id.detail_description) }
    private val price: TextView by lazy { findViewById(R.id.detail_price) }
    private val backButton: Button by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("dish_id", 0)
        val dish = DishesDatabase.getDishesById(dishId)!!

        image.setImageResource(dish.image)
        name.text = dish.name
        description.text = dish.description
        price.text = buildString {
            append("R$ ")
            append(dish.price.toString())
        }

        backButton.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
