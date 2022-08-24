package com.example.workoutmanger.models

import android.os.Bundle
import android.widget.TextView
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
        val ExerAdapter = DayAdapter(this, exerList(), loadPhotos())
        rvPerDay.adapter = ExerAdapter


    }

    private fun exerList(): ArrayList<String> {
        var Exerc = ArrayList<String>()
        val monEx = ArrayList<String>()
        monEx.addAll(
            listOf(
                "Incline Bench Press",
                "Flat Dumbbell Press",
                "Dumbbell Shoulder Press",
                "Butterfly X Tricep Extension (Superset)",
                "Lateral Raises",
                "Skull Crusher",
                "Tricep Dips"
            )
        )
        val tuesEx = ArrayList<String>()
        tuesEx.addAll(
            listOf(
                "Lat Pull Down",
                "Bent Over Rows",
                "Inclined Seated Dumbbell Curls",
                "Machine Row",
                "Z Barbell Curls",
                "Dumbbell Curls",
                "Hammer Curls"
            )
        )
        val wedEx = ArrayList<String>()
        wedEx.addAll(listOf("Lunges", "Deadlift", "Hack Squats", "Calf Raises", "Hamstring Curls"))
        val thurEx = ArrayList<String>()
        thurEx.addAll(
            listOf(
                "Flat Bench Press",
                "Incline Dumbbell Press",
                "Standing Dumbbell Shoulder Press",
                "Butterfly",
                "Overhead Triceps",
                "Lateral Raises",
                "Close Grip Bench Press",
                "Push-ups"
            )
        )
        val friEx = ArrayList<String>()
        friEx.addAll(
            listOf(
                "T-Bar Row",
                "Straight Arm Pulldown",
                "Hammer Curls",
                "Reverse Grip Pulldown",
                "Cable Curls",
                "Cable Rows",
                "Barbell Curls",
                "Dumbbell Curls"
            )
        )
        val satEx = ArrayList<String>()
        satEx.addAll(listOf("Squats", "Leg Press", "Front Squats", "Leg Extension", "Calf Raises"))
        if (tvDayName.text == "MONDAY")
            Exerc = monEx
        else if (tvDayName.text == "TUESDAY")
            Exerc = tuesEx
        else if (tvDayName.text == "WEDNESDAY")
            Exerc = wedEx
        else if (tvDayName.text == "THURSDAY")
            Exerc = thurEx
        else if (tvDayName.text == "FRIDAY")
            Exerc = friEx
        else Exerc = satEx
        return Exerc
    }

    fun loadPhotos(): ArrayList<photo> {
        var listToSend = ArrayList<photo>()
        val dayName = findViewById(R.id.tvDayName) as TextView
        val str = dayName.text.toString()
        if( str == "MONDAY") {
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.benchpress),
                    photo(R.drawable.flatdumbbellpress),
                    photo(R.drawable.shoulderpress),
                    photo(R.drawable.butterfly),
                    photo(R.drawable.lateralraises),
                    photo(R.drawable.skullcrusher),
                    photo(R.drawable.tricepdips)
                )
            )
        }
        else if(str=="TUESDAY"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.latpulldown),
                    photo(R.drawable.bentoverrows),
                    photo(R.drawable.inclinecurls),
                    photo(R.drawable.machinerow),
                    photo(R.drawable.barbellcurls),
                    photo(R.drawable.dumbbellcurls),
                    photo(R.drawable.hammercurls)
                )
            )
        }
        else if(str=="WEDNESDAY"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.lunges),
                    photo(R.drawable.deadlift),
                    photo(R.drawable.squats),
                    photo(R.drawable.calfraises),
                    photo(R.drawable.hamstringcurls)
                )
            )
        }
        else if( str == "THURSDAY") {
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.flatbenchpress),
                    photo(R.drawable.inclinecurls),
                    photo(R.drawable.shoulderpress),
                    photo(R.drawable.butterfly),
                    photo(R.drawable.overheadtriceps),
                    photo(R.drawable.lateralraises),
                    photo(R.drawable.closegrippress),
                    photo(R.drawable.pushups)
                )
            )
        }
        else if(str=="FRIDAY"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.tbarrow),
                    photo(R.drawable.str8armpulldown),
                    photo(R.drawable.hammercurls),
                    photo(R.drawable.reversegrippulldown),
                    photo(R.drawable.cablecurls),
                    photo(R.drawable.cablerows),
                    photo(R.drawable.barbellcurls),
                    photo(R.drawable.dumbbellcurls)
                )
            )
        }
        else if(str=="SATURDAY"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.squats),
                    photo(R.drawable.legpress),
                    photo(R.drawable.frontsquats),
                    photo(R.drawable.legextension),
                    photo(R.drawable.calfraises)
                )
            )
        }
        return listToSend
    }
}