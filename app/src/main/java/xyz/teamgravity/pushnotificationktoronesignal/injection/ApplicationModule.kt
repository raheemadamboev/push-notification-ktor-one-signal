package xyz.teamgravity.pushnotificationktoronesignal.injection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import xyz.teamgravity.pushnotificationktoronesignal.data.remote.NotificationApi
import xyz.teamgravity.pushnotificationktoronesignal.data.remote.NotificationApiImpl
import xyz.teamgravity.pushnotificationktoronesignal.data.repository.NotificationRepositoryImpl
import xyz.teamgravity.pushnotificationktoronesignal.domain.repository.NotificationRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideHttpClient(): HttpClient = HttpClient(Android)

    @Provides
    @Singleton
    fun provideNotificationApi(client: HttpClient): NotificationApi = NotificationApiImpl(client)

    @Provides
    fun provideNotificationRepository(api: NotificationApi): NotificationRepository = NotificationRepositoryImpl(api)
}