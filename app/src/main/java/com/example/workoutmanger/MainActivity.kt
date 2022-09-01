package com.example.workoutmanger

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workoutmanger.models.ExerCal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.exercise_activity.*

val listToImport :  ArrayList<ExerCal> = arrayListOf()

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        val animDraw = root_layout.background as AnimationDrawable
        animDraw.setEnterFadeDuration(10)
        animDraw.setExitFadeDuration(5000)
        animDraw.start()

        exButton.setOnClickListener{
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }

        calButton.setOnClickListener{
            val intent = Intent(this, CalorieActivity::class.java)
            startActivity(intent)
        }
    }
}
