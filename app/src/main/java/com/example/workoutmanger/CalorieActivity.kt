package com.example.workoutmanger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.models.*
import kotlinx.android.synthetic.main.calorie_activtiy.*
import kotlin.math.absoluteValue

class CalorieActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calorie_activtiy)

//        val animDraw = calorie_layout.background as AnimationDrawable
//        animDraw.setEnterFadeDuration(10)
//        animDraw.setExitFadeDuration(5000)
//        animDraw.start()

        val list : ArrayList<ExerCal> = listToImport.distinct() as ArrayList<ExerCal>

        rvExDone.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val itemAdapter = CalExerciseAdapter(this, list)
        rvExDone.adapter = itemAdapter

        val foodAdapter : CalFoodAdapter = CalFoodAdapter(mutableListOf())
        rvFood.adapter = foodAdapter
        rvFood.layoutManager = LinearLayoutManager(this)

        btnAddFood.setOnClickListener{
            val foodTitle = etFood.text.toString()
            val calperfood = etCal.text.toString()
            if(foodTitle.isNotEmpty() && calperfood.isNotEmpty())
                foodAdapter.addFood(foodTitle,calperfood.toInt())
                etFood.text.clear()
                etCal.text.clear()
        }

        btnDeleteFood.setOnClickListener {
            foodAdapter.deleteFood()
        }


        fun out()
        {
            var totfood: Int = 0
            var difference: Int = 0

            var outcome: String = ""
            for (i in foodCal.indices) {
                totfood += foodCal[i]
            }
//            for (i in exerciseCal.indices) {
//                totEx += exerciseCal[i]
//            }
            difference = totEx - totfood

            if(difference<0){
                outcome = "Calories gained: "
            }
            else if(difference>0) {
                outcome = "Calories lost: "
            }

            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Final Outcome")
            alertDialog.setMessage(
                "Calories Burned From Exercise :$totEx \nCalories Taken From Food :$totfood \n\n$outcome \n${difference.absoluteValue}"
            )
            alertDialog.setPositiveButton(
                "OK"
            ){_,_ ->}
            val alert = alertDialog.create()
            alert.setCanceledOnTouchOutside(false)
            alert.show()
        }

        btCalculate.setOnClickListener {
            out()
        }
    }
}