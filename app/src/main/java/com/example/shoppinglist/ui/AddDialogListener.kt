package com.example.shoppinglist.ui

import com.example.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {

    fun onAddClickListener(item: ShoppingItem)
}