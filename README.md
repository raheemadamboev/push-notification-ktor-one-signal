# push-notification-ktor-one-signal
Jetpack Compose android app that you can send push notification among devices using KTOR and One Signal

**Push Notification KTOR One Signal**

<a href="https://github.com/raheemadamboev/push-notification-ktor-one-signal/blob/master/app-debug.apk">Demo app</a> 

**Caution!** You have to launch the  <a href="https://github.com/raheemadamboev/notification-rest-api">Notification REST API</a> in your local machine to use demo app.

Basic android app built by Jetpack Compose and sends notification data to KTOR backend that I build <a href="https://github.com/raheemadamboev/notification-rest-api">Notification REST API</a>. Every button click it send notification data to KTOR server and server sends data to One Signal and One Signal sends push notification to users so android app gets push notification.

**Screenshots:**

<img src="https://github.com/raheemadamboev/push-notification-ktor-one-signal/blob/master/screenshot.gif" alt="Italian Trulli" width="296" height="600">

**Tech stack:**

- Clean Architecture
- MVVM
- Dependency Injection (Hilt)
- Jetpack Compose
- Kotlin Coroutines
- Git
- KTOR Client
- One Signal
- Kotlin Serialization
