package xxxaaa.kotlintest.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import xxxaaa.kotlintest.R


import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity() {

    private var alphaAnimation:AlphaAnimation?=null

    init {
    }


    override fun layoutId(): Int = R.layout.activity_splash

    override fun initData() {

    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        //渐变展示启动屏
        alphaAnimation= AlphaAnimation(0.3f, 1.0f)
        alphaAnimation?.duration = 2000
        alphaAnimation?.setAnimationListener(object : AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                redirectTo()
            }

            override fun onAnimationRepeat(animation: Animation) {}

            override fun onAnimationStart(animation: Animation) {}

        })
        layout_splash.startAnimation(alphaAnimation)
    }

    override fun start() {

    }


    fun redirectTo() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}