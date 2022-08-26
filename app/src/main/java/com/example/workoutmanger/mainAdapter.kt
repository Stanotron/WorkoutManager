package com.example.workoutmanger

import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.models.DayActivity
import kotlinx.android.synthetic.main.main_list.view.*

class mainAdapter (val context: Context, val items : ArrayList<String>): RecyclerView.Adapter<mainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.main_list,
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bodyItem.text = item
        holder.bodyItem.setOnClickListener{
            val intent = Intent(holder.bodyItem.context,DayActivity::class.java)
            val message = item
            intent.putExtra("key",message)
            holder.bodyItem.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val bodyItem = view.btBody
        }
    }