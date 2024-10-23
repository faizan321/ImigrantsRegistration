package com.zest.android.ui.login

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hisdu.meas.data.repository.UserRepository
import com.hisdu.meas.data.source.remote.APIResponse
import com.hisdu.meas.ui.Dashboard.AppDropdown
import com.hisdu.meas.ui.Indicators.*
import com.hisdu.meas.util.serverError
import com.hisdu.meas.util.serverErrorThrowable
import com.ozoned.customerapp.Utils.AppConstant
import com.pixplicity.easyprefs.library.Prefs
import io.reactivex.rxjava3.disposables.CompositeDisposable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


class LoginViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {


    val isLoading = MutableLiveData<Boolean>()
    val allDataLoaded = MutableLiveData<Boolean>()

    private val userData = MutableLiveData<UserModel>()
    val currentUser: LiveData<UserModel> = userData
    private val compositeDisposable = CompositeDisposable()

    fun login(input: LoginRequest, context: Context) {
        showLoading(true)
        userRepository.login(compositeDisposable, input, object : APIResponse<UserModel> {
            override fun onSuccess(result: UserModel?) {

                result?.Id?.let {
                    Prefs.edit().putString(AppConstant.USERID, it).apply()
                }
                Prefs.edit().putString(AppConstant.TOKEN, "Bearer "+result?.access_token).apply()
                Prefs.edit().putString(AppConstant.HFCode,result?.HFCode).apply()
                userData.value = result!!

                GlobalScope.launch(Dispatchers.Main) {
                    try {
                        async(Dispatchers.IO) {
                            result.let { userRepository.insertUser(it) }!!

                        }.await()
                        allDataLoaded(true)
                    } catch (e: Exception) {

                    }
                }
                showLoading(false)


            }

            override fun onError(t: Throwable) {
                showLoading(false)
                t.printStackTrace()
                serverErrorThrowable(t, context)

            }
        })
    }


    private fun showLoading(isVisible: Boolean) {
        isLoading.postValue(isVisible)
    }

    private fun allDataLoaded(isLoaded: Boolean) {
        allDataLoaded.postValue(isLoaded)
    }

    fun dispose() {
        if (compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }
}
