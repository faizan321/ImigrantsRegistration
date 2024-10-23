package com.hisdu.meas.ui.Dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.R
import com.hisdu.meas.databinding.DashboardRoleItemBinding
import com.hisdu.meas.ui.Indicators.ModuleToSave
import kotlin.properties.Delegates

internal class DashboardModuleAdapter(private val listener: ModuleClickListener,var context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<ModuleToSave>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = DashboardRoleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): ModuleToSave = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: DashboardRoleItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(recipe: ModuleToSave) {

            binding.title.text = recipe.moduleName

            if(recipe.isRequired!=null){
                if(recipe.isRequired==true){
                    binding.checkImage.visibility= View.VISIBLE
                    binding.checkImage.setImageResource(R.drawable.asterisk)
                }
            }
            if(recipe.isSubmited!=null){
                binding.checkImage.setImageResource(R.drawable.check_mark)
                binding.checkImage.visibility= View.VISIBLE
                binding.policyTypeCard.background= ContextCompat.getDrawable(context, R.drawable.dashboard_item_unselect_bg)
                binding.title.setTextColor(ContextCompat.getColor(context, R.color.colorBlack))

            }

            itemView.setOnClickListener {
                listener.onClick(recipe)
            }
        }
    }
}
