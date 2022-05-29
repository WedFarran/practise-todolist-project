package com.example.todoproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoproject.R
import com.example.todoproject.databinding.ActivityTodoListBinding
import com.example.todoproject.model.Todo
import com.example.todoproject.utils.TodoAdaptor

class TodoListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTodoListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTodoListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val todoList= mutableListOf(Todo("do homeworks",false))
        val adaptor=TodoAdaptor(todoList)
        binding.rvTodos.adapter=adaptor
        binding.rvTodos.layoutManager=LinearLayoutManager(this)
        binding.btnAddTodo.setOnClickListener{
            todoList.add(Todo(binding.etTodo.text.toString(),false))
            adaptor.notifyDataSetChanged()
            binding.etTodo.text.clear()
        }

    }
}