package com.example.todoproject.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoproject.databinding.ItemTodoBinding
import com.example.todoproject.model.Todo

class TodoAdaptor(var todos:List<Todo>) :RecyclerView.Adapter<TodoAdaptor.TodoViewHolder>(){
    inner class TodoViewHolder(val binding: ItemTodoBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(ItemTodoBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            txTodoTitle.text=todos[position].title
                chkTodoDone.isChecked=todos[position].isChecked

        }

    }

    override fun getItemCount(): Int {
return todos.size    }
}