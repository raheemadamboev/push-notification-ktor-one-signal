package xyz.teamgravity.pushnotificationktoronesignal.domain.repository

interface NotificationRepository {

    suspend fun sendNotification(title: String, description: String)
}