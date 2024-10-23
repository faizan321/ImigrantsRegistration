package com.hisdu.meas.ui.Dashboard

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.R
import com.hisdu.meas.databinding.VisitsListItemBinding
import com.hisdu.meas.ui.Visits.VisitModel
import com.hisdu.meas.ui.Visits.Visits
import kotlin.properties.Delegates

internal class VisitsAdapter(private val listener:VisitClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<Visits>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = VisitsListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): Visits = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: VisitsListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: Visits) {

            binding.healthFacilityName.text=item.healthFacilityName
            binding.shiftName.text=item.shiftName
            binding.facilityType.text=item.ModeName

            if(item.isVisited == true){
                binding.isvisited.text="Visited"
                binding.isvisited.setTextColor(Color.parseColor("#2c7973"))
            }else{
                binding.isvisited.text="Not Visited"
                binding.isvisited.setTextColor(Color.parseColor("#F44336"))
            }
            itemView.setOnClickListener {
                listener.onClick(item)
            }
        }
    }
}
