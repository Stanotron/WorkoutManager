package com.example.workoutmanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = LinearLayoutManager(this)
        val itemAdapter = mainAdapter(this, getList())
        rvMain.adapter = itemAdapter
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