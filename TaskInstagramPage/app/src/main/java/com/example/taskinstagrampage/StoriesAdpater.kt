package com.example.taskinstagrampage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoriesAdpater(
    val stories : List<Story>
): RecyclerView.Adapter<StoriesAdpater.StoriesViewHolder>() {
    inner class StoriesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stories,parent,false)
        return StoriesViewHolder(view)

    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        holder.itemView.apply {
            val tvUserName : TextView = findViewById(R.id.tvUserName)
            tvUserName.text = stories[position].userName
            val ivStoryImage : ImageView = findViewById(R.id.ivStoryImage)
            ivStoryImage.setImageResource(stories[position].image)

        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }
}