package com.hisdu.meas.ui.Indicators

import android.R
import android.app.Activity
import android.util.Base64
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.Color
import android.text.*
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.databinding.*
import com.hisdu.meas.util.KeyboardUtils
import com.hisdu.meas.util.MultiSelectionSpinner.KeyPairBoolData
import com.hisdu.meas.util.MultiSelectionSpinner.MultiSpinnerListener
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.util.*
import kotlin.properties.Delegates
import android.graphics.BitmapFactory
import android.util.Base64.decode
import java.lang.Byte.decode
import java.security.spec.PSSParameterSpec.DEFAULT
import java.text.DateFormat.DEFAULT


class IndicatorsAdapter(
    context: Activity,
    private val listener: IndicatorListener
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var indicatorlist: List<Indicator>? by Delegates.observable(emptyList()) { property, oldValue, newValue ->
//        notifyDataSetChanged()
    }

    private val context: Activity = context
    private val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        when (viewType) {
            1 -> {
                return EditTextViewHolder(
                    EdittextRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            2 -> {
                return DropDownViewHolder(
                    DropdownRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            3 -> {
                return MultiSelectionViewHolder(
                    MultiselectionRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            4 -> {
                return LabelViewHolder(
                    LabelRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            5 -> {
                return DateTimeViewHolder(
                    DatePickerRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            6 -> {
                return ImagePickerViewHolder(
                    ImageRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            7 -> {
                return HeadingViewHolder(
                    HeadingRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            8 -> {
                return EmptyViewHolder(
                    EmptyItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            9 -> {
                return CommentViewHolder(
                    CommentRecylerItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

        }
        return EditTextViewHolder(
            EdittextRecylerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private fun getItem(position: Int): Indicator = indicatorlist?.get(position)!!



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        holder.setIsRecyclable(false)

        when (indicatorlist?.get(position)?.optionsType) {

            "Radiobutton" -> {
                (holder as DropDownViewHolder).onBind(indicatorlist!![position])

            }
            "Textbox" -> {
                (holder as EditTextViewHolder).onBind(indicatorlist!![position])

            }
            "MultiSelection" -> {
                (holder as MultiSelectionViewHolder).onBind(indicatorlist!![position])

            }
            "Label" -> {
                (holder as LabelViewHolder).onBind(indicatorlist!![position])
            }
            "DateTime" -> {
                (holder as DateTimeViewHolder).onBind(indicatorlist!![position])
            }
            "Image" -> {
                (holder as ImagePickerViewHolder).onBind(indicatorlist!![position])
            }
            "Heading" -> {
                (holder as HeadingViewHolder).onBind(indicatorlist!![position])
            }
            "Empty" -> {
                (holder as EmptyViewHolder).onBind(indicatorlist!![position])
            }
            "text-area" -> {
                (holder as CommentViewHolder).onBind(indicatorlist!![position])
            }
        }
        holder.setIsRecyclable(false)
    }

    //For Label
    inner class LabelViewHolder(private val binding: LabelRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

            binding.label.text = indicator.question
            if (indicator.subIndicators.isNullOrEmpty()) {
                binding.layout.visibility = View.GONE
            }
            var mAdapter = IndicatorsAdapter(context, listener)
//            mAdapter.setHasStableIds(true)
//            binding.indicatorRecycler.setRecycledViewPool                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                xxxxxxxxx                                                                                                                                                                                            (viewPool)


            binding.indicatorRecycler.adapter = mAdapter
//            binding.indicatorRecycler.setHasFixedSize(true)
//            binding.indicatorRecycler.setItemViewCacheSize(indicator.subIndicators!!.size)
            mAdapter.indicatorlist = indicator.subIndicators

        }
    }

    //For EditText
    inner class EditTextViewHolder(private val binding: EdittextRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

//            binding.inputValue.hint = indicator.question
            binding.hint.hint = indicator.question

            binding.root.setOnClickListener {
//                KeyboardUtils.hideKeyboard(context)
            }
            if (indicator.IsPhysicalView == true) {
                binding.hint.defaultHintTextColor =
                    ColorStateList.valueOf(ContextCompat.getColor(context, R.color.holo_red_dark))
            }

            when (indicator.InputType) {
                "MobileNumber" -> {
                    binding.inputValue.isSingleLine = true
                    binding.inputValue.inputType = InputType.TYPE_CLASS_PHONE
                    binding.inputValue.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(11))
                }
                "Number" -> {
                    binding.inputValue.isSingleLine = true
                    binding.inputValue.inputType = InputType.TYPE_CLASS_NUMBER
                }
                "email" -> {
                    binding.inputValue.setSingleLine(true)
                    binding.inputValue.inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                }
                "CNIC" -> {
                    binding.inputValue.isSingleLine = true
                    binding.inputValue.inputType = InputType.TYPE_CLASS_NUMBER
                    binding.inputValue.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))

                }
                "text" -> {
                }
            }


//            Make Editable False/True
//            if (indicator.IsOptionEditable == true) {
//
////                binding.inputValue.isFocusable = true
////                binding.inputValue.isFocusableInTouchMode = true // user touches widget on phone with touch screen
//                binding.inputValue.isClickable = true
//            } else {
////                binding.inputValue.isFocusable = false
////                binding.inputValue.isFocusableInTouchMode =
//                    false // user touches widget on phone with touch screen
//                binding.inputValue.isClickable = false
//            }

            //Set Default Value
            if (indicator.DefaultValue != null) {
                if (!indicator.selectedValue.isNullOrEmpty()) {
                    binding.inputValue.setText(indicator.selectedValue)
                } else {
                    binding.inputValue.setText(indicator.DefaultValue)
                    indicator.selectedValue = indicator.DefaultValue!!
                }
            } else {
                if (!indicator.selectedValue.isNullOrEmpty()) {
                    binding.inputValue.setText(indicator.selectedValue)
                }

            }

//            if(indicator.IsOptionCalculation == true ||  indicator.IsOptionTotal == true){
//                binding.indexNumber.visibility=View.VISIBLE
//                binding.indexNumber.text=(adapterPosition+1).toString()
//            }

//            binding.inputValue.setOnFocusChangeListener(OnFocusChangeListener { view, hasFocus ->
//                if (hasFocus) {
////                    Toast.makeText(context, "Got the focus", Toast.LENGTH_LONG)
////                        .show()
//                    KeyboardUtils.showKeyboard(context)
//                } else {
////                    Toast.makeText(context, "Lost the focus", Toast.LENGTH_LONG)
////                        .show()
//                    KeyboardUtils.hideKeyboard(context)
//                }
//            })
            binding.inputValue.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {

                    var totlal = 0
                    var currentminimum = 0
                    indicator.selectedValue = binding.inputValue.text.toString()
                    if (indicator.IsCalculation == true) {
                        try {

                            if (indicator.IsOptionTotal == true) {
                                for (i in 0 until indicatorlist?.size!!) {
                                    if (indicatorlist!![i].IsOptionCalculation ==true) {
                                        indicatorlist!![i].selectedValue = ""
                                        notifyItem(i)
                                    }

                                }

                            }else{
                                for (i in 0 until indicatorlist?.size!!) {
                                    if (indicatorlist!![i].IsOptionTotal == true) {
                                        if (!indicatorlist!![i].selectedValue.isNullOrEmpty()) {
                                            totlal = Integer.parseInt(indicatorlist!![i].selectedValue)
                                        }
                                    }else if (indicatorlist!![i].IsOptionCalculation == true) {

                                        if (!indicatorlist!![i].selectedValue.isNullOrEmpty()) {
                                            currentminimum += Integer.parseInt(indicatorlist!![i].selectedValue!!)
                                        }

                                    }
                                }
                            }
                            if (currentminimum > totlal) {
                                indicator.selectedValue=""
                                SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
                                    .setTitleText("Oops...")
                                    .setContentText("Please Enter Valid Amount")
                                    .show()
                                binding.inputValue.setText("")
                            }




                        } catch (e: Exception) {
                            Log.d("Exception", e.message.toString())
                        }
                    }
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                    indicator.selectedValue = s.toString()

                }
            })
        }
    }

    //For DropDown
    inner class DropDownViewHolder(private val binding: DropdownRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {


            binding.headingDropdown.text = indicator.question

            if (indicator.IsPhysicalView == true) {
//                setColor(
//                    binding.headingDropdown,
//                    indicator.question + " (Physical Verification)",
//                    " (Physical Verification)",
//                    Color.parseColor("#F44336")
//                )
                binding.headingDropdown.text = indicator.question
                binding.headingDropdown.setTextColor(Color.parseColor("#F44336"))
            }
            var list = mutableListOf<String>()

            indicator.question?.let { list.add(0, "Select Option") }
            for (j in 0 until indicator.options?.size!!) {
                indicator.options!![j]?.label?.let { list.add(it) }
            }

            for (i in indicator.options!!.indices) {
                val radioButton = RadioButton(context)
                radioButton.text = indicator.options!![i]?.label
                indicator.options!![i]?.optionId?.let { radioButton.id = it }
                binding.radiogroup.addView(radioButton)
            }

            binding.radiogroup.setOnCheckedChangeListener { group, checkedId -> // checkedId is the RadioButton selected
//                val rb = group.findViewById(checkedId) as RadioButton
//                Toast.makeText(getApplicationContext(), rb.text, Toast.LENGTH_SHORT).show()
//                binding.radiogroup.requestFocus()
                if (!indicator.subIndicators.isNullOrEmpty()) {
                    var subindicatorLIst = mutableListOf<Indicator>()
                    for (j in indicator.subIndicators!!.indices) {
                        if (indicator.subIndicators!![j].showInCase == checkedId) {
                            subindicatorLIst.add(indicator.subIndicators!![j])
                        }
                    }

                    var mAdapter = IndicatorsAdapter(context, listener)
//                    mAdapter.setHasStableIds(true)
//                            binding.indicatorRecycler.isFocusable = true
                    binding.indicatorRecycler.adapter = mAdapter
//                    binding.indicatorRecycler.setItemViewCacheSize(indicator.subIndicators!!.size)
//                    binding.indicatorRecycler.setHasFixedSize(true)
//                    binding.indicatorRecycler.setRecycledViewPool(viewPool)

                    mAdapter.indicatorlist = subindicatorLIst
                }

                indicator.selectedValue = checkedId.toString()
                listener.onDataChange(indicator)

                if (indicator.showRemarksInCase != null) {
                    if (indicator.showRemarksInCase == checkedId) {
                        binding.remarkLayout.visibility = View.VISIBLE
                    }
                }
            }
            binding.dropdown.adapter =
                ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item, list)
            if(!indicator.selectedValue.isNullOrEmpty()){
                binding.radiogroup.check(Integer.parseInt(indicator.selectedValue))
            }

//            binding.dropdown.setFocusableInTouchMode(true);
//            binding.dropdown.setOnFocusChangeListener { v, hasFocus ->
//                if(hasFocus){
//                    if (binding.dropdown.getWindowToken() != null) {
//                        binding.dropdown.performClick();
//                    }
//                }
//            }
//            binding.dropdown.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(
//                    adapterView: AdapterView<*>?,
//                    view: View,
//                    i: Int,
//                    l: Long
//                ) {
//                    if (i > 0) {
//                        CoroutineScope(Dispatchers.Main).launch {
//                            try {
//                                async(Dispatchers.Main) {
//                                    if (!indicator.subIndicators.isNullOrEmpty()) {
//                                        var subindicatorLIst = mutableListOf<Indicator>()
//                                        for (j in indicator.subIndicators!!.indices) {
//                                            if (indicator.subIndicators!![j].showInCase == indicator.options!![i - 1]?.optionId) {
//                                                subindicatorLIst.add(indicator.subIndicators!![j])
//                                            }
//                                        }
//
//                                        var mAdapter = IndicatorsAdapter(context, listener)
//                                        mAdapter.setHasStableIds(true)
////                            binding.indicatorRecycler.isFocusable = true
//                                        binding.indicatorRecycler.adapter = mAdapter
//                                        binding.indicatorRecycler.setHasFixedSize(true)
//                                        binding.indicatorRecycler.setRecycledViewPool(viewPool)
//                                        binding.indicatorRecycler.recycledViewPool.setMaxRecycledViews(10,subindicatorLIst.size)
//                                        mAdapter.indicatorlist = subindicatorLIst
//                                    }
//
//                                    //Set Value
//
//
//                                }.await()
//                                indicator.selectedValue =
//                                    indicator.options!![i - 1]?.optionId?.toString().toString()
//                                listener.onDataChange(indicator)
//
//
//                            } catch (e: Exception) {
//
//                            }
//
//                        }
//
//                        if (indicator.showRemarksInCase != null) {
//                            if (indicator.showRemarksInCase == indicator.options!![i - 1]?.optionId) {
//                                binding.remarkLayout.visibility = View.VISIBLE
//                            }
//                        }
//
//
////                        binding.root.requestFocus()
//
//
//                    }
//
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {}
//            }

            binding.remark.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {}
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (!binding.remark.text.toString().isNullOrEmpty()) {
                        indicator.remarkValue = binding.remark.text.toString()
//                        listener.onDtaChange(indicator)
                    }
                }
            })

        }
    }

    //For Heading
    inner class HeadingViewHolder(private val binding: HeadingRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(indicator: Indicator) {
            binding.label.text = indicator.question

            if (indicator.IsPhysicalView == true) {
                binding.label.setTextColor(Color.parseColor("#F44336"))
            }
            var mAdapter = IndicatorsAdapter(context, listener)
//            mAdapter.setHasStableIds(true)
//            binding.indicatorRecycler.isFocusable = true
            binding.indicatorRecycler.adapter = mAdapter
            binding.indicatorRecycler.layoutManager = GridLayoutManager(context, 2)
//            binding.indicatorRecycler.setItemViewCacheSize(indicator.subIndicators!!.size)
//            binding.indicatorRecycler.setHasFixedSize(true)
//            binding.indicatorRecycler.setRecycledViewPool(v  iewPool)

            mAdapter.indicatorlist = indicator.subIndicators
        }
    }

    //For DateTime
    inner class DateTimeViewHolder(private val binding: DatePickerRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

//            binding.inputDate.hint = indicator.question
            binding.hint.hint = indicator.question

            if(!indicator.selectedValue.isNullOrEmpty()){
                binding.inputDate.setText(indicator.selectedValue)
            }
            binding.inputDate.setOnClickListener {
                listener.onDataChange(indicator)
                val now: Calendar = Calendar.getInstance()
                val dpd: DatePickerDialog =
                    DatePickerDialog.newInstance { view, year, monthOfYear, dayOfMonth ->
                    }
                dpd.setCancelColor(Color.parseColor("#2c7973"))
                dpd.setOkColor(Color.parseColor("#2c7973"))
                dpd.setOnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                    val mon = monthOfYear + 1
                    binding.inputDate.setText("$dayOfMonth/$mon/$year")
                    indicator.selectedValue = "$year-$mon-$dayOfMonth"
                    dpd.dismiss()
                }
                dpd.setOnCancelListener {
                    dpd.dismiss()
                }
                dpd.show((context as AppCompatActivity).supportFragmentManager, "")
            }

        }
    }

    //For MultiSelection DropDown
    inner class MultiSelectionViewHolder(private val binding: MultiselectionRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

            binding.headingDropdown.text = indicator.question
            binding.multipleItemSelectionSpinner.hintText = "Select Option..."
            binding.multipleItemSelectionSpinner.isSearchEnabled = false
            binding.multipleItemSelectionSpinner.setSearchHint("Search record")
            binding.multipleItemSelectionSpinner.setEmptyTitle("Not Data Found!")
            binding.multipleItemSelectionSpinner.isShowSelectAllButton = true
            binding.multipleItemSelectionSpinner.setClearText("Close & Clear")

            val listArray1: MutableList<KeyPairBoolData> = ArrayList()
            for (i in 0 until indicator.options?.size!!) {
                val h = KeyPairBoolData()
                h.id = indicator.options!![i]?.optionId!!
                h.name = indicator.options!![i]?.label

                listArray1.add(h)
            }


            binding.multipleItemSelectionSpinner.setItems(
                listArray1,
                MultiSpinnerListener { items ->
                    for (i in items.indices) {
                        if (items[i].isSelected) {
//                            Log.i(
//                                ContentValues.TAG,
//                                i.toString() + " : " + items[i].name + " : " + items[i].isSelected
//                            )
                            if (indicator.selectedValue.isNullOrEmpty()) {
                                indicator.selectedValue = items[i].id.toString()
                            } else {
                                indicator.selectedValue =
                                    indicator.selectedValue + "," + items[i].id
                            }


                        }
                    }

                })
            itemView.setOnClickListener {

            }

            if (!indicator.subIndicators.isNullOrEmpty()) {
                var mAdapter = IndicatorsAdapter(context, listener)
//                mAdapter.setHasStableIds(true)

                binding.indicatorRecycler.adapter = mAdapter
//                binding.indicatorRecycler.setHasFixedSize(true)
//                binding.indicatorRecycler.setRecycledViewPool(viewPool)
//                binding.indicatorRecycler.setItemViewCacheSize(indicator.subIndicators!!.size)
                mAdapter.indicatorlist = indicator.subIndicators

            }
        }
    }

    //For Image
    inner class ImagePickerViewHolder(private val binding: ImageRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

            binding.heading.text = indicator.question
            if(!indicator.selectedValue.isNullOrEmpty()){
                val decodedString: ByteArray = Base64.decode(indicator.selectedValue, Base64.DEFAULT)
                val decodedByte:Bitmap = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)
                binding.image.setImageBitmap(decodedByte)
            }
            binding.image.setOnClickListener {
                listener.onImagePicker(indicator, binding.image)
            }
        }
    }


    //For EditText
    inner class CommentViewHolder(private val binding: CommentRecylerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(indicator: Indicator) {

//            binding.inputValue.hint = indicator.question

            binding.comment.hint = indicator.question
            if (!indicator.selectedValue.isNullOrEmpty()) {
                binding.comment.setText(indicator.selectedValue)
            }
            if (indicator.IsPhysicalView == true) {
                binding.commentTextinput.defaultHintTextColor =
                    ColorStateList.valueOf(ContextCompat.getColor(context, R.color.holo_red_dark))
            }


            binding.comment.addTextChangedListener(object : TextWatcher {
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
                    if (!binding.comment.text.toString().isNullOrEmpty()) {
                        indicator.selectedValue = binding.comment.text.toString()

                        listener.onDataChange(indicator)
                    }

                }
            })
        }
    }

    //Empty View
    inner class EmptyViewHolder(private val binding: EmptyItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(indicator: Indicator) {
        }
    }

    override fun getItemViewType(position: Int): Int {
        when (indicatorlist?.get(position)?.optionsType) {
            "Textbox" -> {
                return 1
            }
            "Radiobutton" -> {
                return 2
            }
            "MultiSelection" -> {
                return 3
            }
            "Label" -> {
                return 4
            }
            "DateTime" -> {
                return 5
            }
            "Image" -> {
                return 6
            }
            "Heading" -> {
                return 7
            }
            "Empty" -> {
                return 8
            }
            "text-area" -> {
                return 9
            }
        }
        return position
    }

    override fun getItemId(position: Int): Long {

//        return indicatorlist?.get(position)?.indicatorId?.toLong()!!
        return position.toLong()
    }


    fun notifyItem(position: Int) {
        notifyItemChanged(position)
    }

    //Change Text Color using Spannable
    private fun setColor(view: TextView, fulltext: String, subtext: String, color: Int) {
        view.setText(fulltext, TextView.BufferType.SPANNABLE)
        val str = view.text as Spannable
        val i = fulltext.indexOf(subtext)
        str.setSpan(
            ForegroundColorSpan(color),
            i,
            i + subtext.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }

    override fun getItemCount(): Int {
        if(!indicatorlist.isNullOrEmpty()){
            return indicatorlist!!.size
        }
        return 0
    }
}