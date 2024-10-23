package com.hisdu.meas.ui.roles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.R
import com.hisdu.meas.databinding.SectionRoleItemBinding
import com.hisdu.meas.ui.Indicators.IndicatorCategory
import com.hisdu.meas.ui.Indicators.IndicatorCategoryResponse
import kotlin.properties.Delegates

internal class SectionAdapter(private val listener: SectionClickListener, var context:Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<IndicatorCategoryResponse>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = SectionRoleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): IndicatorCategoryResponse = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: SectionRoleItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(recipe: IndicatorCategoryResponse) {

            binding.title.text = recipe.categoryName

            if(recipe.isRequired!=null){
                if(recipe.isRequired==true){
                    binding.checkImage.visibility= View.VISIBLE
                    binding.checkImage.setImageResource(R.drawable.asterisk)
                }
            }
            if(recipe.IsSubmitted!=null){

                binding.checkImage.visibility= View.VISIBLE
                binding.checkImage.setImageResource(R.drawable.check_mark)

                binding.policyTypeCard.background=ContextCompat.getDrawable(context, R.drawable.dashboard_item_unselect_bg)
                binding.title.setTextColor(ContextCompat.getColor(context,R.color.colorBlack))

            }

            itemView.setOnClickListener {
                listener.onClick(recipe)
            }
        }
    }

}
