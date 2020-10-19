package com.example.hallopose.sampledata

import com.example.hallopose.R
import com.example.hallopose.data.Metadata
import com.example.hallopose.data.Post
import com.example.hallopose.data.PostAuthor

private val juan = PostAuthor("Juan Pimentel", "https://juanjr.herokuapp.com")

private val post1 = Post(
    id = 1L,
    title = "The Amazing World of Gumball",
    subtitle = "How to enjoy your new anatomical structure, and satisfy your living cravings with the all new z-bake.",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
            author = juan,
            date = "October 02",
            readTimeMinutes = 30
    ),
    imageId = R.drawable.gumball,
    imageThumbId = R.drawable.gumball,
    tags = setOf("Gumball", "BubbleGum", "JakeTheDog")
)

private val post2 = Post(
    id = 2L,
    title = "Newest Trending Horror",
    subtitle = "Gumball & Darwin run into trouble. Darwin was cat-fished now he has an ogre wife",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
        author = juan,
        date = "October 16",
        readTimeMinutes = 3
    ),
    imageId = R.drawable.gumball2,
    imageThumbId = R.drawable.gumball2,
    tags = setOf("Gumball", "Darwin")
)
private val post3 = Post(
    id = 3L,
    title = "Halloween Town",
    subtitle = "Wait, these aren't from Halloween Town",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
        author = juan,
        date = "October 28",
        readTimeMinutes = 56
    ),
    imageId = R.drawable.gumball3,
    imageThumbId = R.drawable.gumball3,
    tags = setOf("Gumball", "Darwin")
)
private val post4 = Post(
    id = 4L,
    title = "Halloween High The Musical",
    subtitle = "Like High School Musical, but better. Chicken Cordon Bleu guest starring as the main course",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
        author = juan,
        date = "October 28",
        readTimeMinutes = 56
    ),
    imageId = R.drawable.gumball4,
    imageThumbId = R.drawable.gumball4,
    tags = setOf("Halloween High", "Cordon Bleu")
)
private val post5 = Post(
    id = 5L,
    title = "Victor and His Sides",
    subtitle = "Victor, his wife, and his pet must scare the kids to fill the night full of freight",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
        author = juan,
        date = "October 28",
        readTimeMinutes = 69
    ),
    imageId = R.drawable.victor,
    imageThumbId = R.drawable.victor,
    tags = setOf("Victor", "Victoria", "Victorino")
)

public val posts = listOf(
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