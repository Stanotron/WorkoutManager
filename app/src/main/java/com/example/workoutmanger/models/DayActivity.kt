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
        val monEx = mapOf(
                Pair("Incline Bench Press",115),
                Pair("Flat Dumbbell Press",111),
                Pair("Dumbbell Shoulder Press",85),
                Pair("Butterfly X Tricep Extension (Superset)",98),
                Pair("Lateral Raises",68),
                Pair("Skull Crusher",102),
                Pair("Tricep Dips",60)
        )
        val tuesEx = mapOf(
                Pair("Lat Pull Down",111),
                Pair("Bent Over Rows",102),
                Pair("Inclined Seated Dumbbell Curls",85),
                Pair("Machine Row",85),
                Pair("EZ Barbell Curls",94),
                Pair("Dumbbell Curls",81),
                Pair("Hammer Curls",77)
        )
        val wedEx = mapOf(
                Pair("Lunges",123),
                Pair("Deadlift",128),
                Pair("Hack Squats",119),
                Pair("Calf Raises",51),
                Pair("Hamstring Curls",68)
        )
        val thurEx = mapOf(
                Pair("Flat Bench Press",115),
                Pair("Incline Dumbbell Press",111),
                Pair("Standing Dumbbell Shoulder Press",85),
                Pair("Butterfly",98),
                Pair("Overhead Triceps",68),
                Pair("Lateral Raises",68),
                Pair("Close Grip Bench Press",102),
                Pair("Push-ups",85)
        )
        val friEx = mapOf(
                Pair("T-Bar Row",102),
                Pair("Straight Arm Pulldown",102),
                Pair("Hammer Curls",77),
                Pair("Reverse Grip Pulldown",68),
                Pair("Cable Curls",81),
                Pair("Cable Rows",94),
                Pair("Barbell Curls",89),
                Pair("Dumbbell Curls",81)
        )
        val satEx = mapOf(
                Pair("Squats",119),
                Pair("Leg Press",99),
                Pair("Front Squats",119),
                Pair("Leg Extension",68),
                Pair("Calf Raises",51)
        )
        val chestEx = ArrayList<String>()
        chestEx.addAll(listOf(
            "Incline Bench Press",
            "Flat Dumbbell Press",
            "Butterfly",
            "Flat Bench Press",
            "Incline Dumbbell Press",
            "Push-ups")
        )
        val backEx = ArrayList<String>()
        backEx.addAll(listOf(
            "Bent Over Rows",
            "Cable Rows",
            "Deadlift",
            "Lat Pull Down",
            "Machine row",
            "Straight Arm Pull Down",
            "T-bar row"
            )
        )
        val bicepEx = ArrayList<String>()
        bicepEx.addAll(listOf(
            "Incline Bicep Curls",
            "Barbell Curls",
            "Dumbbell Curls",
            "Hammer Curls" ,
            "Cable Curls"
            )
        )
        val tricepEx = ArrayList<String>()
        tricepEx.addAll(listOf(
            "Skull Crusher",
            "Triceps Dips",
            "Overhead Triceps",
            "Close Grip Bench Press"
            )
        )
        val shoulderEx = ArrayList<String>()
        shoulderEx.addAll(listOf(
            "Shoulder Press",
            "Lateral Raises"
            )
        )
        val legsEx = ArrayList<String>()
        legsEx.addAll(listOf(
            "Lunges",
            "Deadlift",
            "Squats",
            "Calf Raises",
            "Hamstring Curls",
            "Leg Press",
            "Front Squats",
            "Leg Extension"
            )
        )
        if (tvDayName.text == "MONDAY"){
            val itr = monEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "TUESDAY"){
            val itr = tuesEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "WEDNESDAY"){
            val itr = wedEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "THURSDAY"){
            val itr = thurEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "FRIDAY"){
            val itr = friEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "SATURDAY"){
            val itr = satEx.keys.iterator()
            while(itr.hasNext()){
                val key = itr.next()
                Exerc.add(key)
            }
        }
        else if (tvDayName.text == "Chest")
            Exerc = chestEx
        else if (tvDayName.text == "Back")
            Exerc = backEx
        else if (tvDayName.text == "Shoulder")
            Exerc = shoulderEx
        else if (tvDayName.text == "Legs")
            Exerc = legsEx
        else if (tvDayName.text == "Biceps")
            Exerc = bicepEx
        else if (tvDayName.text == "Triceps")
            Exerc = tricepEx
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
                    photo(R.drawable.inclinedbpress),
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
        else if(str=="Chest"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.benchpress),
                    photo(R.drawable.flatdumbbellpress),
                    photo(R.drawable.butterfly),
                    photo(R.drawable.flatbenchpress),
                    photo(R.drawable.flatdumbbellpress),
                    photo(R.drawable.pushups)
                )
            )
        }
        else if(str=="Back"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.bentoverrows),
                    photo(R.drawable.cablerows),
                    photo(R.drawable.deadlift),
                    photo(R.drawable.latpulldown),
                    photo(R.drawable.machinerow),
                    photo(R.drawable.str8armpulldown),
                    photo(R.drawable.tbarrow)
                )
            )
        }
        else if(str=="Shoulder"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.shoulderpress),
                    photo(R.drawable.lateralraises),
                )
            )
        }
        else if(str=="Legs"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.lunges),
                    photo(R.drawable.deadlift),
                    photo(R.drawable.squats),
                    photo(R.drawable.calfraises),
                    photo(R.drawable.hamstringcurls),
                    photo(R.drawable.legpress),
                    photo(R.drawable.frontsquats),
                    photo(R.drawable.legextension)
                )
            )
        }
        else if(str=="Triceps"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.skullcrusher),
                    photo(R.drawable.tricepdips),
                    photo(R.drawable.overheadtriceps),
                    photo(R.drawable.closegrippress)
                )
            )
        }
        else if(str=="Biceps"){
            listToSend.addAll(
                listOf<photo>(
                    photo(R.drawable.inclinecurls),
                    photo(R.drawable.barbellcurls),
                    photo(R.drawable.dumbbellcurls),
                    photo(R.drawable.hammercurls),
                    photo(R.drawable.cablecurls)
                )
            )
        }
        return listToSend
    }
}