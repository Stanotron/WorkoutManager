package com.example.workoutmanger.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import kotlinx.android.synthetic.main.per_calorie_list.view.*

val exerciseCal : ArrayList<Int> = arrayListOf()

class CalExerciseAdapter(private val context: Context, private val caloList: ArrayList<ExerCal>): RecyclerView.Adapter<CalExerciseAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.per_calorie_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = caloList[position]
        exerciseCal.add(item.calorie)
        holder.exCal.text = "Calories: "+item.calorie.toString()
        holder.exText.text = item.exercise
    }

    override fun getItemCount(): Int {
        return caloList.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val exText = view.tvEx
        val exCal = view.tvCal
    }
}