package com.example.workoutmanger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
            val message = "MONDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btTuesday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "TUESDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btWednesday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "WEDNESDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btThursday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "THURSDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btFriday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "FRIDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btSaturday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "SATURDAY"
            intent.putExtra("key",message)
            startActivity(intent)
        }

        btMonday.setOnClickListener{
            val intent = Intent(this, DayActivity::class.java)
            val message = "MONDAY"
            intent.putExtra("key",message)
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