package  com.sample

import android.app.Application
import android.content.ContextWrapper
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.Logger
import com.sample.searchmovieapp.util.Connectivity
import com.sample.searchmovieapp.util.Prefs


class Root : Application() {


    // Customize the notification channel as you wish. This is only for a bare minimum example

    override fun onCreate() {
        super.onCreate()



        Logger.addLogAdapter(AndroidLogAdapter())

        Prefs.Builder()
            .setContext(this)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(BuildConfig.APPLICATION_ID)
            .setUseDefaultSharedPreference(true)
            .build()

        Connectivity.init(this)
    }

}