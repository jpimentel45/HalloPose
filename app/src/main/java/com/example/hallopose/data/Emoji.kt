package com.example.hallopose.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable

@Immutable
data class Emoji(
    val id: Long,
    val emoji: String,
)