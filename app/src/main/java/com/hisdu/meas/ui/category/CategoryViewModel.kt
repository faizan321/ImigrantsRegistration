package com.hisdu.meas.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hisdu.meas.data.repository.CategoryRepository
import com.hisdu.meas.data.model.Category
import com.hisdu.meas.data.model.CategoryResponse
import com.hisdu.meas.data.source.remote.APIResponse
import io.reactivex.rxjava3.disposables.CompositeDisposable
import javax.inject.Inject


class CategoryViewModel @Inject constructor(private val categoryRepository: CategoryRepository) : ViewModel() {


    private val categoryData = MutableLiveData<Category>()
    val category: LiveData<Category> = categoryData
    val isLoading = MutableLiveData<Boolean>()
    private val categoryListData = MutableLiveData<List<Category>>()
    val categoryList: LiveData<List<Category>> = categoryListData
    private val compositeDisposable = CompositeDisposable()


    fun loadCategories() {
        showLoading(true)
        categoryRepository.loadRootCategories(compositeDisposable, object : APIResponse<CategoryResponse> {
            override fun onSuccess(result: CategoryResponse?) {
                showLoading(false)
                categoryListData.value = result?.categories
            }

            override fun onError(t: Throwable) {
                showLoading(false)
                t.printStackTrace()
            }
        })
    }

    private fun showLoading(isVisible: Boolean) {
        isLoading.value = isVisible
    }

    fun dispose() {
        if(compositeDisposable.isDisposed){
            compositeDisposable.dispose()
        }
    }

}