package xyz.teamgravity.pushnotificationktoronesignal.data.repository

import xyz.teamgravity.pushnotificationktoronesignal.data.remote.NotificationApi
import xyz.teamgravity.pushnotificationktoronesignal.domain.repository.NotificationRepository

class NotificationRepositoryImpl(private val api: NotificationApi) : NotificationRepository {

    override suspend fun sendNotification(title: String, description: String) {
        api.sendNotification(title = title, description = description)
    }
}