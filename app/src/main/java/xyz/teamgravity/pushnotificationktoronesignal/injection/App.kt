package xyz.teamgravity.pushnotificationktoronesignal.injection

import android.app.Application
import com.onesignal.OneSignal
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application() {

    companion object {
        const val ONE_SIGNAL_APP_ID = "fbdae96e-8ade-411c-807e-e182974c4d31"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
    }
}