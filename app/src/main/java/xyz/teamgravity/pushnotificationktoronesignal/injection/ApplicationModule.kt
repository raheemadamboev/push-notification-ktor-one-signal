package xyz.teamgravity.pushnotificationktoronesignal.injection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import xyz.teamgravity.pushnotificationktoronesignal.data.remote.NotificationApi
import xyz.teamgravity.pushnotificationktoronesignal.data.remote.NotificationApiImpl
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
}