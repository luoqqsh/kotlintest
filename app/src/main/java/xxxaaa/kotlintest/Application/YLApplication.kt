package xxxaaa.kotlintest.Application

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle

import kotlin.properties.Delegates

class YLApplication : Application(){

    companion object {

        var context: Context by Delegates.notNull()
            private set


    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        initConfig()
        registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks)


    }

    private fun initConfig() {


    }


    private val mActivityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
        override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        }

        override fun onActivityStarted(activity: Activity) {
        }

        override fun onActivityResumed(activity: Activity) {

        }

        override fun onActivityPaused(activity: Activity) {

        }

        override fun onActivityStopped(activity: Activity) {

        }

        override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

        }

        override fun onActivityDestroyed(activity: Activity) {
        }
    }


}
