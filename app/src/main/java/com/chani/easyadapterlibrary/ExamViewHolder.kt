package com.chani.easyadapterlibrary

import android.view.View
import com.chani.easyadapter.EasyAdapter
import com.chani.easyadapter.EasyViewHolder
import kotlinx.android.synthetic.main.items.view.*

class ExamViewHolder(itemView: View) : EasyViewHolder(itemView), EasyAdapter.Binder<String> {

    override fun bind(data: String, adapter: EasyAdapter<String>) {
        itemView.idItems.text = data
    }

}