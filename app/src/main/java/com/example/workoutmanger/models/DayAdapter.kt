package com.example.workoutmanger.models

import android.content.Context
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import com.example.workoutmanger.models.DayAdapter.*
import kotlinx.android.synthetic.main.per_day_list.view.*

class DayAdapter(val perDayContext: Context, val perDayExer: ArrayList<String> ): RecyclerView.Adapter<DayAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           LayoutInflater.from(perDayContext).inflate(
               R.layout.per_day_list,
               parent,
               false
           )
       )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val exer = perDayExer.get(position)
        holder.exText.text = exer
    }

    override fun getItemCount(): Int {
        return perDayExer.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val exText = view.tvExercise
        val imageOfExer = view.ivExercise
    }
}