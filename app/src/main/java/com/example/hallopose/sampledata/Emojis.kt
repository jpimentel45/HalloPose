package com.example.hallopose.sampledata

import com.example.hallopose.R
import com.example.hallopose.data.Emoji
import com.example.hallopose.data.Metadata
import com.example.hallopose.data.Post
import com.example.hallopose.data.PostAuthor

private val juan = PostAuthor("Juan Pimentel", "https://juanjr.herokuapp.com")

private val post1 = Emoji(
    id = 1L,
    emoji = "&#128123;"
)
private val post2 = Emoji(
    id = 1L,
    emoji = "&#129498;"
)

private val post3 = Emoji(
    id = 1L,
    emoji = "&#129412;"
)

private val post4 = Emoji(
    id = 1L,
    emoji = "&#128123;"
)

private val post5 = Emoji(
    id = 1L,
    emoji = "&#127844;"
)





public val emojis = listOf(
    post1,
    post2,
    post3,
    post4,
    post5,
    post1.copy(id = 6L),
    post2.copy(id = 7L),
    post3.copy(id = 8L),
    post4.copy(id = 9L),
    post5.copy(id = 10L)
)