package xyz.teamgravity.pushnotificationktoronesignal.domain

interface NotificationRepository {

    suspend fun sendNotification(title: String, description: String)
}