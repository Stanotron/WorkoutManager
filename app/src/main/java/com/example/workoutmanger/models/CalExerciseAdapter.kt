package com.example.workoutmanger.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import com.example.workoutmanger.exerciseCal
import kotlinx.android.synthetic.main.per_calorie_list.view.*



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
        var x : Int = 2
        if(caloList.size==2){
            x=1
            holder.reps.text = ""
        }
        val item = caloList[position+x]
        exerciseCal.add(item.calorie)
        holder.exCal.text = "Calories: "+item.calorie.toString()
        holder.exText.text = item.exercise
    }

    override fun getItemCount(): Int {
        var x : Int = 2
        if(caloList.size==2) x=1
        return caloList.size-x
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        val exText = view.tvEx
        val exCal = view.tvCal
        val reps = view.tvReps
    }
}