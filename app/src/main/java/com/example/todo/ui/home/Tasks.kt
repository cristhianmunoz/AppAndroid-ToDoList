package com.example.todo.ui.home
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tasks(
    @SerialName("title") val title: String,
    @SerialName("status") val status: String,
    @SerialName("description") val description: String
)
