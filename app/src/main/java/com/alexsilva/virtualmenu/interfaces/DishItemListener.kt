package com.alexsilva.virtualmenu.interfaces

import android.view.View

interface DishItemListener {
    fun onDishClick(view: View, position: Int)
}