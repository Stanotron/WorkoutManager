package com.example.workoutmanger

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.models.DayActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = LinearLayoutManager(this)
        val itemAdapter = mainAdapter(this, getList())
        rvMain.adapter = itemAdapter

        btMonday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            startActivity(intent)
        }

    }



    private fun getList() : ArrayList<String>{
        val bodyList = ArrayList<String> ()
        bodyList.add("Chest")
        bodyList.add("Back")
        bodyList.add("Shoulder")
        bodyList.add("Legs")
        bodyList.add("Biceps")
        bodyList.add("Triceps")
        return bodyList
    }
}