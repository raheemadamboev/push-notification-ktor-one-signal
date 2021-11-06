package xyz.teamgravity.pushnotificationktoronesignal.data.remote

import io.ktor.client.*
import io.ktor.client.request.*

class NotificationApiImpl(private val client: HttpClient) : NotificationApi {

    override suspend fun sendNotification(title: String, description: String) {
        try {
            client.get<String> {
                url(NotificationApi.NOTIFICATION_URL)
                parameter("title", title)
                parameter("description", description)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}