package com.example.todo.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R

class ElementsAdapter : RecyclerView.Adapter<ElementsAdapter.ViewHolder>() {

    private var datos: List<Elements> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.elements_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val objeto = datos[position]
        holder.idTextView.text = objeto.title
        if (objeto.completed === "true"){
            holder.idcheckBox.setImageResource(R.drawable.check)
        }else{
            holder.idcheckBox.setImageResource(R.drawable.cancel)
        }
    }

    override fun getItemCount(): Int = datos.size

    fun setDatos(datos: List<Elements>) {
        this.datos = datos
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val idTextView: TextView = itemView.findViewById(R.id.textViewTitleID)
        val idcheckBox: ImageButton = itemView.findViewById<ImageButton>(R.id.checkBoxID)
    }
}