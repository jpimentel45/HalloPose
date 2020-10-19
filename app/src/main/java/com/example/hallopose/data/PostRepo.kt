package com.example.hallopose.data

import com.example.hallopose.sampledata.posts

/**
 * A fake repo returning sample data
 */
object PostRepo {
    fun getPosts(): List<Post> = posts
    fun getFeaturedPost(): Post = posts.random()
}