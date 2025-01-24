package com.alexsilva.virtualmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.alexsilva.virtualmenu.R
import com.alexsilva.virtualmenu.interfaces.DishItemListener
import com.alexsilva.virtualmenu.models.Dish
import com.google.android.material.imageview.ShapeableImageView

class DishAdapter(private val dishes: List<Dish>) : Adapter<DishAdapter.DishViewHolder>() {

    private var dishListener: DishItemListener? = null

    fun setDishListener(listener: DishItemListener) {
        this.dishListener = listener
    }

    class DishViewHolder(view: View, dishListener: DishItemListener?) :
        RecyclerView.ViewHolder(
            view
        ) {
        val name: TextView = view.findViewById(R.id.item_menu_name)
        val image: ShapeableImageView = view.findViewById(R.id.item_menu_image)

        init {
            view.setOnClickListener {
                dishListener?.onDishClick(view, bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)

        return DishViewHolder(view, dishListener)
    }

    override fun getItemCount(): Int = dishes.size

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.name.text = dishes[position].name
        holder.image.setImageResource(dishes[position].image)
    }
}
