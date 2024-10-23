
package com.hisdu.specialized.ui.Indicators

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.databinding.InprocessFormItemBinding
import com.hisdu.meas.ui.Indicators.SubmitFormModel
import com.hisdu.meas.ui.roles.InProcessClickListener
import kotlin.properties.Delegates

internal class InProcessSurveysAdapter(private val listener: InProcessClickListener, var context:Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<SubmitFormModel>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = InprocessFormItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): SubmitFormModel = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: InprocessFormItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: SubmitFormModel) {

            binding.facilityName.text = item.facilityName
            binding.facilityType.text=item.faciltyTypeName
            binding.visitType.text=item.visitTypeName
           binding.continueForm.setOnClickListener {
               listener.onClick(item)
           }

        }
    }

}
