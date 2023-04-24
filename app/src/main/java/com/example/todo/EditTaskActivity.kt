package com.example.todo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todo.databinding.ActivityEditTaskBinding

class EditTaskActivity: AppCompatActivity() {

    private lateinit var binding: ActivityEditTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEdit.setOnClickListener(){
            val intent = Intent(this, CreateTaskActivity::class.java)
            startActivity(intent)
        }

    }
}