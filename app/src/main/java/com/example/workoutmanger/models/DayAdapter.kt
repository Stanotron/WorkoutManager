package com.example.workoutmanger.models

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.CalorieActivity
import com.example.workoutmanger.ExerciseActivity
import com.example.workoutmanger.R
import com.example.workoutmanger.listToImport
import com.example.workoutmanger.models.DayAdapter.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.per_day_button.view.*
import kotlinx.android.synthetic.main.per_day_list.view.*
import java.lang.IllegalArgumentException

class DayAdapter(val perDayContext: Context, val perDayList: ArrayList<info>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        val totalEx : Map<String,Int> = mapOf(
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType){
            R.layout.per_day_list -> {
                val view = LayoutInflater.from(perDayContext).inflate(R.layout.per_day_list,parent,false)
                ViewHolder1(view)
            }
            R.layout.per_day_button -> {
                val view = LayoutInflater.from(perDayContext).inflate(R.layout.per_day_button,parent,false)
                ViewHolder2(view)
            }
            else -> throw IllegalArgumentException("")
        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            R.layout.per_day_list -> (holder as ViewHolder1).bind(position)
            R.layout.per_day_button -> (holder as ViewHolder2).bind()
        }
    }

    override fun getItemCount(): Int {
        return perDayList.size+1
    }

    override fun getItemViewType(position: Int): Int {
        return when (position){
            perDayList.size -> R.layout.per_day_button
            else -> R.layout.per_day_list
        }
    }
    inner class ViewHolder1(view: View): RecyclerView.ViewHolder(view) {
        val exText = view.tvExercise
        val imageOfExer = view.ivExercise
        val cbox = view.cbExercise

        fun bind(position: Int){
            val item = perDayList[position]
            exText.text = item.heading
            imageOfExer.setImageResource(item.pic.imageID)
            cbox.setOnCheckedChangeListener { buttonView, isChecked ->
                if (item.isChecked) {
                    listToImport.add(ExerCal(item.heading, totalEx[item.heading]!!))
                }
            }
        }
    }
    inner class ViewHolder2(view: View): RecyclerView.ViewHolder(view) {
        val button = view.btExDone
        fun bind(){
            button.setOnClickListener{
                perDayContext.startActivity(Intent(perDayContext,CalorieActivity::class.java))
            }
        }
    }
}