package com.example.workoutmanger

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.models.CalExerciseAdapter
import com.example.workoutmanger.models.CalFoodAdapter
import com.example.workoutmanger.models.ExerCal
import com.example.workoutmanger.models.food
import kotlinx.android.synthetic.main.calorie_activtiy.*

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
        btnDeleteFood.setOnClickListener{
            foodAdapter.deleteFood()
        }
    }
}