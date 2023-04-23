package com.example.todo.ui.dashboard
import retrofit2.http.GET

interface ApiService {
    @GET("https://jsonplaceholder.typicode.com/todos")
    suspend fun getDatos(): List<Elements>
}