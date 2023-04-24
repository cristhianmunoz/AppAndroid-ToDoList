package com.example.todo.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.databinding.FragmentHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TasksAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recyclerviewTasks)
        adapter = TasksAdapter()

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        GlobalScope.launch(Dispatchers.Main) {
            try {
                val datos = mutableListOf<Tasks>()
                val task1 = Tasks("Terminar deber","true","1. Teminar la parte primera")
                val task2 = Tasks("leer libro","false","Haga pasar no se así")
                val task3 = Tasks("Preparar lasagña","true","1. Temrinar la parte primera")
                val task4 = Tasks("Estudiar Koltin","false","Haga pasar no se así")
                val task5 = Tasks("Enviar Curriculum","true","1. Temrinar la parte primera")
                val task6 = Tasks("LLegar a ser Desarrolador","false","Haga pasar no se así")

                datos.add(task1)
                datos.add(task2)
                datos.add(task3)
                datos.add(task4)
                datos.add(task5)
                datos.add(task6)

                adapter.setDatos(datos)
            } catch (e: Exception) {
                // Manejar la excepción
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun jsonStringToList(jsonString: String): List<Tasks> {
        return Json.decodeFromString(jsonString)
    }
}


