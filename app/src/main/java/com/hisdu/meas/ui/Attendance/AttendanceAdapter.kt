package com.hisdu.meas.ui.Attendance

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.databinding.StaffListItemBinding
import kotlin.properties.Delegates

internal class AttendanceAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<StaffModel>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = StaffListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): StaffModel = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: StaffListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: StaffModel) {
//            item.id.toString()
            binding.statffNo.text=((adapterPosition+1).toString())
            binding.designation.text=item.designationTitle
            binding.name.text=item.name
            binding.presenceStatus.text=item.presenceStatusTitle

            itemView.setOnClickListener {

            }
        }
    }
}
