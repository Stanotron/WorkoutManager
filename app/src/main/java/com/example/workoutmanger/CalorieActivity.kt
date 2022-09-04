package com.example.workoutmanger

import android.app.Dialog
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.models.*
import kotlinx.android.synthetic.main.calorie_activtiy.*
import kotlinx.android.synthetic.main.final_out.*
import java.lang.Math.abs

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
            var totEx: Int = 0
            var difference: Int = 0
            for (i in foodCal.indices) {
                totfood += foodCal[i]
            }
            for (i in exerciseCal.indices) {
                totEx += exerciseCal[i]
            }
            difference = totEx - totfood

            val dialog = Dialog(this)
            dialog.setContentView(R.layout.final_out)
            dialog.setCanceledOnTouchOutside(true)
            val food = dialog.findViewById(R.id.tvFoodOut) as TextView
            val ex = dialog.findViewById(R.id.tvExOut) as TextView
            food.text = totfood.toString()
            ex.text = totEx.toString()
            dialog.show()
        }

        btCalculate.setOnClickListener {
            out()
        }
    }
}