package com.example.hallopose.data

import com.example.hallopose.sampledata.emojis
import com.example.hallopose.sampledata.posts

/**
 * A fake repo returning sample data
 */
object EmojiRepo {
    fun getPosts(): Emoji = emojis.random()
    fun getFeaturedPost(): Emoji = emojis.random()
}