package com.hisdu.meas.ui.revamp

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.databinding.FacilityItemBinding
import com.hisdu.meas.databinding.StaffListItemBinding
import com.hisdu.meas.ui.migration.MigrantsListResponse
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.properties.Delegates

internal class FacilitiesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<MigrantsListResponse.MigrantRecord>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = FacilityItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): MigrantsListResponse.MigrantRecord = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: FacilityItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: MigrantsListResponse.MigrantRecord) {

            binding.familyHeaderCnic.text=item.FamilyHeadCNIC
            binding.familyHeadName.text=item.FamilyHeadName
            binding.routOfMigration.text=item.RouteOfMigrants
            binding.adults.text=item.Adult.toString()
            binding.kids.text=item.Kids.toString()

        }
    }
}
