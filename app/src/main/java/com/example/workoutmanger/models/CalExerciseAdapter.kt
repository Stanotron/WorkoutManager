package com.example.workoutmanger.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import kotlinx.android.synthetic.main.per_calorie_list.view.*
import kotlinx.android.synthetic.main.per_day_list.view.*

class CalExerciseAdapter(private val calories : MutableList<Int> ): RecyclerView.Adapter<CalExerciseAdapter.ViewHolder>(){
    private var totalEx : Map<String,Int> = mapOf(
        Pair("Incline Bench Press",115),
        Pair("Flat Dumbbell Press",111),
        Pair("Dumbbell Shoulder Press",85),
        Pair("Butterfly X Tricep Extension (Superset)",98),
        Pair("Lateral Raises",68),
        Pair("Skull Crusher",102),
        Pair("Tricep Dips",60),
        Pair("Lat Pull Down",111),
        Pair("Bent Over Rows",102),
        Pair("Inclined Seated Dumbbell Curls",85),
        Pair("Machine Row",85),
        Pair("EZ Barbell Curls",94),
        Pair("Dumbbell Curls",81),
        Pair("Hammer Curls",77),
        Pair("Lunges",123),
        Pair("Deadlift",128),
        Pair("Hack Squats",119),
        Pair("Calf Raises",51),
        Pair("Hamstring Curls",68),
        Pair("Flat Bench Press",115),
        Pair("Incline Dumbbell Press",111),
        Pair("Standing Dumbbell Shoulder Press",85),
        Pair("Butterfly",98),
        Pair("Overhead Triceps",68),
        Pair("Close Grip Bench Press",102),
        Pair("Push-ups",85),
        Pair("T-Bar Row",102),
        Pair("Straight Arm Pulldown",102),
        Pair("Reverse Grip Pulldown",68),
        Pair("Cable Curls",81),
        Pair("Cable Rows",94),
        Pair("Dumbbell Curls",81),
        Pair("Squats",119),
        Pair("Leg Press",99),
        Pair("Front Squats",119),
        Pair("Leg Extension",68),
    )
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
        val item = calories[position]
        holder.itemView.apply {
            tvCal.text = item.toString()
            if(cbExercise.isChecked){
                var ex : String = tvExer.text.toString()
                var calorie : Int? = totalEx[ex]
                calories.add(calorie!!)
                notifyItemInserted(calories.size-1)
            }
        }
    }

    override fun getItemCount(): Int {
        return calories.size
    }

    class ViewHolder(view : View): RecyclerView.ViewHolder(view)
}