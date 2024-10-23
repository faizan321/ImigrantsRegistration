package com.hisdu.meas.ui.revamp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.databinding.StaffListItemBinding
import com.hisdu.meas.databinding.TakeImagesItemBinding
import kotlin.properties.Delegates

internal class ImagesAdapter(val bhuImageClickListener: BHUImageClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<ImagesResponseModel.BHUImageModel>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = TakeImagesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int): ImagesResponseModel.BHUImageModel = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: TakeImagesItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: ImagesResponseModel.BHUImageModel) {
//            item.id.toString()
            binding.titleImage.text="${item.ImageName}"

            itemView.setOnClickListener {
                bhuImageClickListener.onBHUImageClick(item,binding.bedPic1)
            }
        }
    }
}
