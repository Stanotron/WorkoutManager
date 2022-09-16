package com.example.workoutmanger

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.workoutmanger.models.ExerCal
import com.example.workoutmanger.models.food
import kotlinx.android.synthetic.main.activity_main.*

val listToImport :  ArrayList<ExerCal> = arrayListOf(ExerCal("Exercise",0),ExerCal("Please Do Something",0))
val foods: MutableList<food> = mutableListOf()
val foodCal : ArrayList<Int> = arrayListOf()
val exerciseCal : ArrayList<Int> = arrayListOf()
var totEx: Int = 0

class MainActivity : AppCompatActivity() {


    private var handlerAnimation = Handler()

        @SuppressLint("ResourceType")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val view: View = findViewById(android.R.id.content)
            val mLoadAnimation: Animation = AnimationUtils.loadAnimation(applicationContext, R.drawable.fade_in)
            mLoadAnimation.duration = 500
            view.startAnimation(mLoadAnimation)


            val animDraw = root_layout.background as AnimationDrawable
            animDraw.setEnterFadeDuration(10)
            animDraw.setExitFadeDuration(5000)
            animDraw.start()

            runnable.run()

            exButton.setOnClickListener{
                val intent = Intent(this, ExerciseActivity::class.java)
                startActivity(intent)
            }
            calButton.setOnClickListener{
                val intent = Intent(this, CalorieActivity::class.java)
                startActivity(intent)
            }
    }
    private var runnable = object : Runnable {
        override fun run() {

            ivCircle.animate().scaleX(2f).scaleY(2f).alpha(0f).setDuration(800)
                .withEndAction {
                    ivCircle.scaleX = 1f
                    ivCircle.scaleY = 1f
                    ivCircle.alpha = 1f
                }

            ivCircle2.animate().scaleX(2f).scaleY(2f).alpha(0f).setDuration(800)
                .withEndAction {
                    ivCircle2.scaleX = 1f
                    ivCircle2.scaleY = 1f
                    ivCircle2.alpha = 1f
                }

            handlerAnimation.postDelayed(this, 1500)
        }
    }
}
