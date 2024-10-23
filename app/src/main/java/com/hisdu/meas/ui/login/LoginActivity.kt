package com.zest.android.ui.login

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.ui.setupActionBarWithNavController
import cn.pedant.SweetAlert.SweetAlertDialog
import com.hisdu.meas.MainApplication
import com.hisdu.meas.databinding.ActivityLoginBinding
import com.hisdu.meas.di.component.MainComponent
import com.hisdu.meas.ui.main.MainActivity
import dmax.dialog.SpotsDialog
import javax.inject.Inject
import javax.inject.Provider



class LoginActivity : AppCompatActivity() {
    lateinit var mainComponent: MainComponent
    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel
    @Inject
    lateinit var viewModelProvider: Provider<LoginViewModel>
    private lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Creation of the main graph using the application graph
        mainComponent = (applicationContext as MainApplication).provideAppComponent().mainComponent().create()

        // Make Dagger instantiate @Inject fields in MainActivity
        mainComponent.inject(this)

        viewModel = ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T = viewModelProvider.get() as T
        }).get(LoginViewModel::class.java)
        dialog= SpotsDialog.Builder().setContext(this).build()
        binding.loginBtn.setOnClickListener {
            login()
        }
        viewModel.isLoading.observe(this, Observer { isloading ->

            if(isloading){
                dialog.show()
            }else{
                dialog.dismiss()
            }
        })

        viewModel.allDataLoaded.observe(this, Observer { isloading ->
            if(isloading){
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        })
    }


    fun login(){
        val id=binding.userName.text.toString().trim()
        val password=binding.password.text.toString().trim()
        if(validate()){
            viewModel.login(LoginRequest(id,password,"password"),this)
        }
    }

    fun validate():Boolean{

        val id=binding.userName.text.toString().trim()
        val password=binding.password.text.toString().trim()
        if(id.isNullOrEmpty()){
            SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Oops...")
                .setContentText("Please Enter UserName")
                .show()
            return false
        }
        if(password.isNullOrEmpty()){
            SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Oops...")
                .setContentText("Please Enter Password")
                .show()
            return false
        }

        return true
    }


}
