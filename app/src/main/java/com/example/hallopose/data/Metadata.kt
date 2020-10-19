package com.example.hallopose.data

import androidx.compose.runtime.Immutable

@Immutable
data class Metadata(
    val author: PostAuthor,
    val date: String,
    val readTimeMinutes: Int
)
