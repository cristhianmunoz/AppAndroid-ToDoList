package com.example.todo.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.ui.dashboard.Elements

class TasksAdapter : RecyclerView.Adapter<TasksAdapter.ViewHolder> () {

    private var datos: List<Tasks> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tasks_list, parent, false)
        return TasksAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val objeto = datos[position]
        holder.idTextViewTasks.text = objeto.title
        if (objeto.status === "true"){
            holder.ButtonComplete.setVisibility(View.GONE)
            holder.imageButtonTasks.setImageResource(R.drawable.check)
        }else{
            holder.imageButtonTasks.setImageResource(R.drawable.baseline_info)
        }
    }

    override fun getItemCount(): Int = datos.size

    fun setDatos(datos: List<Tasks>) {
        this.datos = datos
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val idTextViewTasks: TextView = itemView.findViewById(R.id.textViewTaskTitleID)
        val imageButtonTasks: ImageButton = itemView.findViewById<ImageButton>(R.id.imageButtonTaskStatus)
        val ButtonComplete: Button = itemView.findViewById(R.id.buttonComplete)
    }



}