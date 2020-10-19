package com.example.hallopose.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable

@Immutable
data class Post(
    val id: Long,
    val title: String,
    val subtitle: String? = null,
    val url: String,
    val metadata: Metadata,
    @DrawableRes val imageId: Int,
    @DrawableRes val imageThumbId: Int,
    val tags: Set<String>
)