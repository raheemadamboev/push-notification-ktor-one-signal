package xyz.teamgravity.pushnotificationktoronesignal.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import xyz.teamgravity.pushnotificationktoronesignal.domain.repository.NotificationRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: NotificationRepository
) : ViewModel() {

    fun sendNotification(title: String, description: String) {
        viewModelScope.launch {
            repository.sendNotification(title, description)
        }
    }
}