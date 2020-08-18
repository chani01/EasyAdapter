package com.chani.easyadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class EasyAdapter<T> : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var listItems = mutableListOf<T>()
    var selectPosition: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
      =  getViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false), viewType)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Binder<T>).bind(listItems[position],this)
    }

    override fun getItemCount(): Int = listItems.size

    override fun getItemViewType(position: Int): Int = getLayoutId(position, listItems[position])

    protected abstract fun getLayoutId(position: Int, obj: T): Int

    abstract fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder

    interface Binder<T> {
        fun bind(data: T, adapter: EasyAdapter<T>)
    }
}