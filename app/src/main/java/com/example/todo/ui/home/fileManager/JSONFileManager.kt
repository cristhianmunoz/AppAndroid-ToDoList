/*
package com.example.todo.ui.home.fileManager

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import com.example.todo.ui.home.Tasks
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class JSONFileManager(private val context: Context, private val coroutineScope: CoroutineScope, private val filename: String) {

        val objetoManager = ObjetoManager(context, "fileTasks.json")

        suspend fun createTask(objeto: Tasks) = withContext(Dispatchers.IO) {
            val objetos = obtenerObjetos()
            objetos.add(objeto)
            guardarObjetos(objetos)
        }

        suspend fun readTasks(): List<Tasks> = withContext(Dispatchers.IO) {
            try {
                val inputStream = context.openFileInput(filename)
                val jsonString = inputStream.bufferedReader().use { it.readText() }
                Json.decodeFromString(jsonString)
            } catch (e: Exception) {
                emptyList()
            }
        }

        suspend fun updateTask(index: Int, objeto: Tasks) = withContext(Dispatchers.IO) {
            val objetos = obtenerObjetos()
            objetos[index] = objeto
            guardarObjetos(objetos)
        }

        suspend fun deleteTask(index: Int) = withContext(Dispatchers.IO) {
            val objetos = obtenerObjetos()
            objetos.removeAt(index)
            guardarObjetos(objetos)
        }

        private fun obtenerObjetos(): MutableList<Tasks> {
            return try {
                val inputStream = context.openFileInput(filename)
                val jsonString = inputStream.bufferedReader().use { it.readText() }
                Json.decodeFromString(jsonString)
            } catch (e: Exception) {
                mutableListOf()
            }
        }

        private fun guardarObjetos(objetos: List<Tasks>) {
            val outputStream = context.openFileOutput(filename, Context.MODE_PRIVATE)
            val jsonString = Json.encodeToString(objetos)
            outputStream.write(jsonString.toByteArray())
            outputStream.close()
        }
    }

}
*/
