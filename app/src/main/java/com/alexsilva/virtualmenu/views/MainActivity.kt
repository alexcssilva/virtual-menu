package com.alexsilva.virtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alexsilva.virtualmenu.R
import com.alexsilva.virtualmenu.adapters.DishAdapter
import com.alexsilva.virtualmenu.interfaces.DishItemListener
import com.alexsilva.virtualmenu.models.DishesDatabase

class MainActivity : AppCompatActivity(), DishItemListener {

    private val dishList: RecyclerView by lazy { findViewById(R.id.main_menu) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = DishesDatabase.getDishes()

        val adapter = DishAdapter(products)
        adapter.setDishListener(this)

        dishList.layoutManager = LinearLayoutManager(baseContext)
        dishList.adapter = adapter
    }

    override fun onDishClick(view: View, position: Int) {
        val it = Intent(baseContext, MenuItemDetailActivity::class.java)
        it.putExtra("dish_id", position)
        startActivity(it)
    }
}
