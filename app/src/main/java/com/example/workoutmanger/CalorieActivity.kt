package com.example.workoutmanger

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workoutmanger.models.CalExerciseAdapter
import kotlinx.android.synthetic.main.calorie_activtiy.*

class CalorieActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calorie_activtiy)

        val animDraw = calorie_layout.background as AnimationDrawable
        animDraw.setEnterFadeDuration(10)
        animDraw.setExitFadeDuration(5000)
        animDraw.start()

        rvExDone.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val itemAdapter = CalExerciseAdapter(mutableListOf())
        rvExDone.adapter = itemAdapter

    }
}