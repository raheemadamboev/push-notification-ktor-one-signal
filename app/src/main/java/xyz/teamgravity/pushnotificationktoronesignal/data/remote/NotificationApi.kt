package xyz.teamgravity.pushnotificationktoronesignal.data.remote

interface NotificationApi {

    companion object {
        const val NOTIFICATION_URL = "http://192.168.1.9:8080/sendNotification"
    }

    suspend fun sendNotification(title: String, description: String)
}