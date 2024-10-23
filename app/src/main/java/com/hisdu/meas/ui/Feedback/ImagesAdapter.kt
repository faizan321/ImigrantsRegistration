package com.hisdu.meas.ui.Feedback

import android.graphics.Bitmap
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hisdu.meas.databinding.ImageItemBinding
import com.hisdu.meas.util.ImageUtil
import kotlin.properties.Delegates

internal class ImagesAdapter(private val listener: ImageClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var recipes: List<ImagesModel>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val holderRecipeBinding = ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(holderRecipeBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RecipeViewHolder).onBind(getItem(position))
    }

    private fun getItem(position: Int):ImagesModel = recipes?.get(position)!!


    override fun getItemCount(): Int = recipes?.size!!


    inner class RecipeViewHolder(private val binding: ImageItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(recipe: ImagesModel) {


            binding.heading.hint = recipe.title
            if(!recipe.editable){
                binding.heading.isEnabled = false
                binding.heading.setText(recipe.title)
            }
            if(!recipe.image.isNullOrEmpty()){
                binding.heading.setText(recipe.title)
                binding.image.setImageBitmap(ImageUtil.base64toBitmap(recipe.image))
            }
            binding.heading.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                    recipe.title=s.toString()
                }
            })

            binding.root.setOnClickListener {
                recipe.id?.let { it1 -> listener.onImageClick(it1,binding.image) }
            }
        }
    }
}
