package com.hisdu.meas.util

import android.app.Activity
import android.content.Context
import android.database.Cursor
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.provider.Settings
import android.provider.Settings.SettingNotFoundException
import android.text.Spannable
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cn.pedant.SweetAlert.SweetAlertDialog
import java.text.SimpleDateFormat
import java.util.*


fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}

 fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

fun timeConvertor(_24HourTime:String):String{
    var finalTime=""
    try {

        val _24HourSDF = SimpleDateFormat("HH:mm")
        val _12HourSDF = SimpleDateFormat("hh:mm a")
        val _24HourDt: Date = _24HourSDF.parse(_24HourTime)

        System.out.println(_24HourDt)
        System.out.println( _12HourSDF.format(_24HourDt))
        finalTime= _12HourSDF.format(_24HourDt)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return finalTime
}


fun isLocationEnabled(context: Context): Boolean {
    var locationMode = 0
    val locationProviders: String
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
        locationMode = try {
            Settings.Secure.getInt(context.contentResolver, Settings.Secure.LOCATION_MODE)
        } catch (e: SettingNotFoundException) {
            e.printStackTrace()
            return false
        }
        locationMode != Settings.Secure.LOCATION_MODE_OFF
    } else {
        locationProviders = Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.LOCATION_PROVIDERS_ALLOWED
        )
        !TextUtils.isEmpty(locationProviders)
    }

}

fun serverError(msg: String,context: Context) {
    SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
        .setTitleText("Oops...!")
        .setContentText(msg)
        .show()
}

fun serverErrorThrowable(msg: Throwable,context: Context) {
//    if (msg is HttpException) {
//        val body = (msg as HttpException).response()!!.errorBody()
//
//    }
    SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
        .setTitleText("Oops...!")
        .setContentText(msg.message)
        .show()
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


fun isNetworkAvailable(context: Context?): Boolean {
    if (context == null) return false
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                    return true
                }
            }
        }
    } else {
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
            return true
        }
    }
    return false
}


fun <T : Any> Fragment.setBackStackData(key: String,data : T, doBack : Boolean = true) {
    findNavController().previousBackStackEntry?.savedStateHandle?.set(key, data)
    if(doBack)
        findNavController().popBackStack()
}

fun <T : Any> Fragment.getBackStackData(key: String, result: (T) -> (Unit)) {
    findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<T>(key)?.observe(viewLifecycleOwner) {
        result(it)
    }
}


fun getRealPathFromURI(contentUri: Uri?,activity: Activity): String? {
    val proj = arrayOf(MediaStore.Images.Media.DATA)
    val cursor: Cursor = activity.managedQuery(contentUri, proj, null, null, null)
    val column_index: Int = cursor
        .getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
    cursor.moveToFirst()
    return cursor.getString(column_index)
}
