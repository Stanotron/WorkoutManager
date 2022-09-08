package com.example.workoutmanger.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workoutmanger.R
import com.example.workoutmanger.foodCal
import com.example.workoutmanger.foods
import kotlinx.android.synthetic.main.per_food_list.view.*

class CalFoodAdapter(foods: MutableList<food>) : RecyclerView.Adapter<CalFoodAdapter.FoodViewHolder>() {
        class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
            return FoodViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.per_food_list,
                    parent,
                    false
                )
            )
        }

        fun addFood(name : String, cal : Int ){
            foods.add(food(name,cal))
            foodCal.add(cal)
            notifyItemInserted(foods.size-1)
        }

        fun deleteFood(){
            foods.removeAll { food ->
                food.checked
            }
            update()
            notifyDataSetChanged()
        }

        fun update(){
            foodCal.clear()
            for (i in foods.indices){
                foodCal.add(foods[i].calories)
            }
        }

        override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
            val currFood = foods[position]
            holder.itemView.apply {
                tvFoodTitle.text = currFood.foodTitle
                tvFoodCal.text = "Calories: " + currFood.calories.toString()
                cbDone.isChecked = currFood.checked
                cbDone.setOnCheckedChangeListener { _, isChecked ->
                    currFood.checked = !currFood.checked
                }
            }
        }

        override fun getItemCount(): Int {
            return foods.size
        }
}
