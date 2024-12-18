package com.example.taskinstagrampage

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdpater(
    val posts : List<Post>
): RecyclerView.Adapter<PostsAdpater.PostsViewHolder>() {
    inner class PostsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.posts,parent,false)
        return PostsViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.itemView.apply {
            val userNameForPost : TextView = findViewById(R.id.userNameforPost)
            userNameForPost.text = posts[position].userNameForProfile
            val profileImage : ImageView = findViewById(R.id.imagetrue)
            profileImage.setImageResource(posts[position].profileImage)
            val posImage : ImageView = findViewById(R.id.postImage)
            posImage.setImageResource(posts[position].postImage)
            val favorite : ImageView = findViewById(R.id.favorite)
            favorite.setImageResource(posts[position].favorite)
            val comment : ImageView = findViewById(R.id.comment)
            comment.setImageResource(posts[position].comment)
            val sendPost : ImageView = findViewById(R.id.sendPost)
            sendPost.setImageResource(posts[position].send)
            val bookmark : ImageView = findViewById(R.id.bookmark)
            bookmark.setImageResource(posts[position].bookmark)

        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}