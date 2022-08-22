package com.example.workoutmanger.models

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.exercise_day.*
import java.util.*
import kotlin.collections.ArrayList

class DayActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_day)

        val day = intent.getStringExtra("key")
        tvDayName.text = day
        rvPerDay.layoutManager = LinearLayoutManager(this)
        val ExerAdapter = DayAdapter(this, exerList())
        rvPerDay.adapter = ExerAdapter


    }

    private fun exerList(): ArrayList<String> {
        var Exerc = ArrayList<String>()
        val monEx = ArrayList<String>()
        monEx.addAll(listOf("Incline Bench Press","Flat Dumbbell Press","Dumbbell Shoulder Press","Butterfly X Tricep Extension (Superset)", "Lateral Raises","Skull Crusher","Tricep Dips"))
        val tuesEx = ArrayList<String>()
        tuesEx.addAll(listOf("Lat Pull Down","Bent Over Rows","Inclined Seated Dumbbell Curls","Machine Row","Z Barbell Curls","Dumbbell Curls","Hammer Curls"))
        val wedEx = ArrayList<String>()
        wedEx.addAll(listOf("Lunges","Deadlift","Hack Squats","Calf Raises","Hamstring Curls"))
        val thurEx = ArrayList<String>()
        thurEx.addAll(listOf("Flat Bench Press","Incline Dumbbell Press","Standing Dumbbell Shoulder Press","Butterfly","Overhead Triceps","Lateral Raises","CLose Grip Bench Press","Pushups"))
        val friEx = ArrayList<String>()
        friEx.addAll(listOf("T-Bar Row","Straight Arm Pulldown","Hammer Curls","Reverse Grip Pulldown","Cable Curls","Cable Rows","Barbell Curls","Dumbbell Curls"))
        val satEx = ArrayList<String>()
        satEx.addAll(listOf("Squats","Leg Press","Front Squats","Leg Extension","Calf Raises"))
        if(tvDayName.text=="MONDAY")
            Exerc = monEx
        else if(tvDayName.text=="TUESDAY")
            Exerc = tuesEx
        else if(tvDayName.text=="WEDNESDAY")
            Exerc = wedEx
        else if(tvDayName.text=="THURSDAY")
            Exerc = thurEx
        else if(tvDayName.text=="FRIDAY")
            Exerc = friEx
        else Exerc = satEx
        return Exerc
    }

}