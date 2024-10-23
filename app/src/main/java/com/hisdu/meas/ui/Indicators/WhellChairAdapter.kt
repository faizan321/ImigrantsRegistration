package com.hisdu.meas.ui.Indicators

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.data.model.BedDetailsViewModel
import com.hisdu.meas.data.model.WheelChairDetailsViewModel
import com.hisdu.meas.databinding.BedItemBinding
import com.hisdu.meas.databinding.StaffListItemBinding
import kotlin.properties.Delegates

internal class WhellChairAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<WheelChairDetailsViewModel>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = BedItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): WheelChairDetailsViewModel = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: BedItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: WheelChairDetailsViewModel) {

            binding.bedTitle.text=("Wheelchair NO "+(adapterPosition+1).toString())
            binding.bedStatus.text=item.WheelChairStatus

            itemView.setOnClickListener {

            }
        }
    }
}
