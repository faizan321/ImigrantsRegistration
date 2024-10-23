package com.hisdu.meas.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import com.hisdu.meas.R
import com.hisdu.meas.databinding.ActivitySplashBinding
import com.hisdu.meas.ui.main.MainActivity
import com.hisdu.meas.util.ActivityUtils
import com.zest.android.ui.login.LoginActivity

/**
 * To display the splash screen
 *
 * @author ZARA
 */
class SplashActivity : AppCompatActivity() {


    private val SPLASH_DISPLAY_LENGTH: Long = 1500
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        binding.splashImageView.animation = zoomIn
        binding.splashImageView.startAnimation(zoomIn)
//        Handler().postDelayed(Runnable {
//            MainActivity.start(this@SplashActivity)
//            finish()
//        }, SPLASH_DISPLAY_LENGTH)

        if( ActivityUtils.isLogin()){
            Handler().postDelayed(Runnable {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, SPLASH_DISPLAY_LENGTH)
        }else{
            Handler().postDelayed(Runnable {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }, SPLASH_DISPLAY_LENGTH)
        }


    }

}
