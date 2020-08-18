package com.chani.easyadapterlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chani.easyadapter.EasyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf("apple", "banana", "orange")
        val adapter = object : EasyAdapter<String>() {
            override fun getLayoutId(position: Int, obj: String): Int {
                return R.layout.items
            }

            override fun getViewHolder(view: View, viewType: Int): RecyclerView.ViewHolder {
                return ExamViewHolder(view)
            }
        }
        adapter.listItems = list
        rcMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcMain.adapter = adapter
    }
}