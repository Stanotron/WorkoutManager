package com.example.workoutmanger.models

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.R
import kotlinx.android.synthetic.main.exercise_day.*
import kotlin.collections.ArrayList

class DayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_day)

        val day = intent.getStringExtra("key")
        tvDayName.text = day
        rvPerDay.layoutManager = LinearLayoutManager(this)
        val ExerAdapter = DayAdapter(this, list())
        rvPerDay.adapter = ExerAdapter
    }

    private fun list(): ArrayList<info> {
        var Exerc = ArrayList<info>()
        val monEx: ArrayList<info> = arrayListOf(
            info("Incline Bench Press", photo(R.drawable.benchpress), false),
            info("Flat Dumbbell Press", photo(R.drawable.flatdumbbellpress), false),
            info("Dumbbell Shoulder Press", photo(R.drawable.shoulderpress), false),
            info("Butterfly", photo(R.drawable.butterfly), false),
            info("Lateral Raises", photo(R.drawable.lateralraises), false),
            info("Skull Crusher", photo(R.drawable.skullcrusher), false),
            info("Tricep Dips", photo(R.drawable.tricepdips), false)
        )
        val tuesEx: ArrayList<info> = arrayListOf(
            info("Lat Pull Down", photo(R.drawable.latpulldown), false),
            info("Bent Over Rows", photo(R.drawable.bentoverrows), false),
            info("Inclined Seated Dumbbell Curls", photo(R.drawable.inclinecurls), false),
            info("Machine Row", photo(R.drawable.machinerow), false),
            info("EZ Barbell Curls", photo(R.drawable.barbellcurls), false),
            info("Dumbbell Curls", photo(R.drawable.dumbbellcurls), false),
            info("Hammer Curls", photo(R.drawable.hammercurls), false)
        )
        val wedEx: ArrayList<info> = arrayListOf(
            info("Lunges", photo(R.drawable.latpulldown), false),
            info("Deadlift", photo(R.drawable.bentoverrows), false),
            info("Hack Squats", photo(R.drawable.inclinecurls), false),
            info("Calf Raises", photo(R.drawable.machinerow), false),
            info("Hamstring Curls", photo(R.drawable.barbellcurls), false)
        )
        val thurEx: ArrayList<info> = arrayListOf(
            info("Flat Bench Press", photo(R.drawable.flatbenchpress), false),
            info("Incline Dumbbell Press", photo(R.drawable.inclinedbpress), false),
            info("Standing Dumbbell Shoulder Press", photo(R.drawable.shoulderpress), false),
            info("Butterfly", photo(R.drawable.butterfly), false),
            info("Overhead Triceps", photo(R.drawable.overheadtriceps), false),
            info("Lateral Raises", photo(R.drawable.lateralraises), false),
            info("Close Grip Bench Press", photo(R.drawable.closegrippress), false),
            info("Push-ups", photo(R.drawable.pushups), false)
        )
        val friEx: ArrayList<info> = arrayListOf(
            info("T-Bar Row", photo(R.drawable.tbarrow), false),
            info("Straight Arm Pulldown", photo(R.drawable.str8armpulldown), false),
            info("Hammer Curls", photo(R.drawable.hammercurls), false),
            info("Reverse Grip Pulldown", photo(R.drawable.reversegrippulldown), false),
            info("Cable Curls", photo(R.drawable.cablecurls), false),
            info("Cable Rows", photo(R.drawable.cablerows), false),
            info("Barbell Curls", photo(R.drawable.barbellcurls), false),
            info("Dumbbell Curls", photo(R.drawable.dumbbellcurls), false)

        )
        val satEx: ArrayList<info> = arrayListOf(
            info("Squats", photo(R.drawable.squats), false),
            info("Leg Press", photo(R.drawable.legpress), false),
            info("Front Squats", photo(R.drawable.frontsquats), false),
            info("Leg Extension", photo(R.drawable.legextension), false),
            info("Calf Raises", photo(R.drawable.calfraises), false)
        )
        val chestEx: ArrayList<info> = arrayListOf(
            info("Incline Bench Press", photo(R.drawable.benchpress), false),
            info("Flat Dumbbell Press", photo(R.drawable.flatdumbbellpress), false),
            info("Butterfly", photo(R.drawable.butterfly), false),
            info("Flat Bench Press", photo(R.drawable.flatbenchpress), false),
            info("Incline Dumbbell Press", photo(R.drawable.inclinedbpress), false),
            info("Push-ups", photo(R.drawable.pushups), false)
        )
        val backEx: ArrayList<info> = arrayListOf(
            info("Bent Over Rows", photo(R.drawable.bentoverrows), false),
            info("Cable Rows", photo(R.drawable.cablerows), false),
            info("Deadlift", photo(R.drawable.deadlift), false),
            info("Lat Pull Down", photo(R.drawable.latpulldown), false),
            info("Machine row", photo(R.drawable.machinerow), false),
            info("Straight Arm Pull Down", photo(R.drawable.str8armpulldown), false),
            info("T-bar row", photo(R.drawable.tbarrow), false)
        )
        val bicepEx: ArrayList<info> = arrayListOf(
            info("Incline Bicep Curls", photo(R.drawable.inclinecurls), false),
            info("Barbell Curls", photo(R.drawable.barbellcurls), false),
            info("Dumbbell Curls", photo(R.drawable.dumbbellcurls), false),
            info("Hammer Curls", photo(R.drawable.hammercurls), false),
            info("Cable Curls", photo(R.drawable.cablecurls), false)
        )
        val tricepEx: ArrayList<info> = arrayListOf(
            info("Skull Crusher", photo(R.drawable.skullcrusher), false),
            info("Triceps Dips", photo(R.drawable.tricepdips), false),
            info("Overhead Triceps", photo(R.drawable.overheadtriceps), false),
            info("Close Grip Bench Press", photo(R.drawable.closegrippress), false)
        )
        val shoulderEx: ArrayList<info> = arrayListOf(
            info("Shoulder Press", photo(R.drawable.shoulderpress), false),
            info("Lateral Raises", photo(R.drawable.lateralraises), false)
        )
        val legsEx: ArrayList<info> = arrayListOf(
            info("Lunges", photo(R.drawable.lunges), false),
            info("Deadlift", photo(R.drawable.deadlift), false),
            info("Squats", photo(R.drawable.squats), false),
            info("Calf Raises", photo(R.drawable.calfraises), false),
            info("Hamstring Curls", photo(R.drawable.hamstringcurls), false),
            info("Leg Press", photo(R.drawable.legpress), false),
            info("Front Squats", photo(R.drawable.frontsquats), false),
            info("Leg Extension", photo(R.drawable.legextension), false)
        )
        if (tvDayName.text == "MONDAY") {
            Exerc = monEx as ArrayList<info>
        } else if (tvDayName.text == "TUESDAY") {
            Exerc = tuesEx as ArrayList<info>
        } else if (tvDayName.text == "WEDNESDAY") {
            Exerc = wedEx as ArrayList<info>
        } else if (tvDayName.text == "THURSDAY") {
            Exerc = thurEx as ArrayList<info>
        } else if (tvDayName.text == "FRIDAY") {
            Exerc = friEx as ArrayList<info>
        } else if (tvDayName.text == "SATURDAY") {
            Exerc = satEx as ArrayList<info>
        } else if (tvDayName.text == "Chest")
            Exerc = chestEx as ArrayList<info>
        else if (tvDayName.text == "Back")
            Exerc = backEx as ArrayList<info>
        else if (tvDayName.text == "Shoulder")
            Exerc = shoulderEx as ArrayList<info>
        else if (tvDayName.text == "Legs")
            Exerc = legsEx as ArrayList<info>
        else if (tvDayName.text == "Biceps")
            Exerc = bicepEx as ArrayList<info>
        else if (tvDayName.text == "Triceps")
            Exerc = tricepEx as ArrayList<info>
        return Exerc
    }
}