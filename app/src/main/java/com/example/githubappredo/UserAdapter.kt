package com.example.githubappredo

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubappredo.databinding.ItemUserBinding

class UserAdapter(private var list: List<String>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    companion object {
        private val TAG = "User Adapter"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i(TAG, "on create")
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i(TAG, list[position])
        holder.binding.textView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)
}