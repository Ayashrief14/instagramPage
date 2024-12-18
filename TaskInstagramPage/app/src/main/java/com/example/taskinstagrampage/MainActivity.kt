package com.example.taskinstagrampage

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var storyList = mutableListOf(
            Story(R.drawable.image,"Esraa"),
            Story(R.drawable.girlimage,"Farah"),
            Story(R.drawable.phytobook,"Reham"),
            Story(R.drawable.option,"Malk"),
            Story(R.drawable.otherphytobook,"rawan"),
        )
        val adapter = StoriesAdpater(storyList)
        val rvStories : RecyclerView = findViewById(R.id.rvstories)
        rvStories.adapter = adapter
        rvStories.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)

        var postList = mutableListOf(
            Post(R.drawable.girlimage,"farah",R.drawable.girlimage,R.drawable.outline_favorite_border_24,R.drawable.outline_mode_comment_24,R.drawable.outline_send_24,R.drawable.outline_bookmark_border_24),
            Post(R.drawable.image,"Esraa",R.drawable.image,R.drawable.outline_favorite_border_24,R.drawable.outline_mode_comment_24,R.drawable.outline_send_24,R.drawable.outline_bookmark_border_24),
            Post(R.drawable.option,"Malk",R.drawable.option,R.drawable.outline_favorite_border_24,R.drawable.outline_mode_comment_24,R.drawable.outline_send_24,R.drawable.outline_bookmark_border_24),
            Post(R.drawable.phytobook,"reham",R.drawable.phytobook,R.drawable.outline_favorite_border_24,R.drawable.outline_mode_comment_24,R.drawable.outline_send_24,R.drawable.outline_bookmark_border_24),
        )
        val adapter2 = PostsAdpater(postList)
        val rvPosts:RecyclerView = findViewById(R.id.rvposts)
        rvPosts.adapter = adapter2
        rvPosts.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

    }

    fun lovePost(view: View) {
        val favoriteImage : ImageView = findViewById(R.id.favorite)
        favoriteImage.setImageResource(R.drawable.baseline_favorite_24)
    }

    fun savePost(view: View) {
        val bookmark: ImageView = findViewById(R.id.bookmark)
        bookmark.setImageResource(R.drawable.baseline_bookmark_24)
    }
}