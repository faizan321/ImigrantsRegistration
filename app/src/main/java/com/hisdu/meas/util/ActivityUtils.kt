package com.hisdu.meas.util

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.core.util.Preconditions.checkNotNull
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs

/**
 * This provides methods to help Activities load their UI.
 *
 * Created by ZARA on 8/10/2018.
 */
object ActivityUtils {

    /**
     * The `fragment` is added to the container view with id `frameId`. The operation is
     * performed by the `fragmentManager`.
     */
    @SuppressLint("RestrictedApi")
    fun addFragmentToActivity(fragmentManager: FragmentManager,
                              fragment: Fragment, frameId: Int) {
        checkNotNull<FragmentManager>(fragmentManager)
        checkNotNull<Fragment>(fragment)
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)
        transaction.commit()
    }

    /**
     * The `fragment` is replaced with the container view with id `frameId`. The operation
     * is performed by the `fragmentManager`.
     *
     * @param fragmentManager
     * @param fragment
     * @param tag
     * @param frameId
     */
    @SuppressLint("RestrictedApi")
    fun replaceFragmentInActivity(fragmentManager: FragmentManager,
                                  fragment: Fragment,
                                  tag: String,
                                  frameId: Int) {
        checkNotNull<FragmentManager>(fragmentManager)
        checkNotNull<Fragment>(fragment)
        fragmentManager.beginTransaction()
                .replace(frameId, fragment, tag)
                .addToBackStack(tag)
                .commit()
    }

    fun isLogin():Boolean{
        if(Prefs.getString(AppConstant.TOKEN,"").equals("")){
            return false
        }else{
            return true
        }
    }
}
