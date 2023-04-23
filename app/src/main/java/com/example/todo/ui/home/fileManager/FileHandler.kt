package com.example.todo.ui.home.fileManager

import org.json.JSONArray
import org.json.JSONObject

interface FileHandler {
    fun saveItem(item: JSONObject)
    fun readItem(index: Int): JSONObject?
    fun readAllItems(): JSONArray
    fun updateItem(index: Int, item: JSONObject)
    fun deleteItem(index: Int)

}