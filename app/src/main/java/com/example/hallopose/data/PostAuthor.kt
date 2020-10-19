package com.example.hallopose.data

import androidx.compose.runtime.Immutable

@Immutable
data class PostAuthor(
    val name: String,
    val url: String? = null
)