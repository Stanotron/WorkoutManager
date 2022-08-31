package com.example.workoutmanger.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import kotlinx.android.synthetic.main.per_calorie_list.view.*
import kotlinx.android.synthetic.main.per_day_list.view.*

class CalExerciseAdapter(private val calories: MutableList<Any>): RecyclerView.Adapter<CalExerciseAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.per_calorie_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = calories
        holder.exCal.text = item.toString()
        holder.exText.text = item.toString()
    }

    override fun getItemCount(): Int {
        return calories.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val exText = view.tvExer
        val exCal = view.tvCal
    }
}