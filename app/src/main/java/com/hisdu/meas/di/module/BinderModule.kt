package com.hisdu.meas.di.module

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hisdu.meas.ViewModelFactory
import com.hisdu.meas.di.ViewModelKey
import com.hisdu.meas.ui.category.CategoryViewModel
import com.hisdu.meas.ui.recipes.RecipeViewModel
import com.zest.android.ui.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class BinderModule {

    @Binds
    abstract fun bindContext(app: Application): Context


    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(RecipeViewModel::class)
    abstract fun bindRecipeViewModel(recipeViewModel: RecipeViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(CategoryViewModel::class)
    abstract fun bindCategoryViewModel(categoryViewModel: CategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginViewModel: LoginViewModel): ViewModel
}