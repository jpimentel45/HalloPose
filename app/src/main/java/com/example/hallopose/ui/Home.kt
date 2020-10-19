package com.example.hallopose.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Palette
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.annotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.ui.layout.Container
import androidx.ui.tooling.preview.Preview
import com.example.hallopose.MainActivity
import com.example.hallopose.R
import com.example.hallopose.data.Emoji
import com.example.hallopose.data.EmojiRepo
import com.example.hallopose.data.Post
import com.example.hallopose.data.PostRepo

@Composable
private fun AppBar() {
    TopAppBar(
        navigationIcon = {
            Icon(Icons.Rounded.Palette, Modifier.padding(horizontal = 12.dp))
        },
        title = {
            Text(text = stringResource(R.string.app_title))
        },
        backgroundColor = MaterialTheme.colors.primarySurface
    )
}

@Composable
fun Header(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f),
        contentColor = MaterialTheme.colors.primary,
        modifier = modifier
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.subtitle2,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
private fun PostMetadata(
    post: Post,
    modifier: Modifier = Modifier
) {
    val divider = "  •  "
    val tagDivider = "  "
    val newLine = "\n"
    val text = annotatedString {
        post.subtitle?.let { append(it) }
        append(newLine)
        append(post.metadata.date)
        append(divider)
        append(stringResource(R.string.read_time, post.metadata.readTimeMinutes))
        append(divider)
        val tagStyle = MaterialTheme.typography.overline.toSpanStyle().copy(
            background = MaterialTheme.colors.primary.copy(alpha = 0.1f)
        )
        post.tags.forEachIndexed { index, tag ->
            if (index != 0) {
                append(tagDivider)
            }
            withStyle(tagStyle) {
                append(" ${tag.toUpperCase()} ")
            }
        }
    }
    Text(
        text = text,
        modifier = modifier
    )
}


@Composable
fun PostItem(
    post: Post,
    modifier: Modifier = Modifier
) {
    ListItem(
        modifier = modifier
            .clickable {   }
            .padding(vertical = 8.dp)
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(8.dp)),
        icon = {
                Image(
                    contentScale = ContentScale.Crop,
                    asset = imageResource(post.imageThumbId),
                    modifier = Modifier.clip(shape = MaterialTheme.shapes.small)
                        .preferredWidth(80.dp)
                        .preferredHeight(40.dp)
                )

        },
        text = {
            Text(text = post.title)

        },
        secondaryText = {
            PostMetadata(post)
        }
    )
}


@Composable
fun Home() {
    val featured = remember { PostRepo.getFeaturedPost() }
    val posts = remember { PostRepo.getPosts() }
    val emojis = remember { EmojiRepo.getPosts() }
    HalloPoseTheme {
        Scaffold(
            topBar = { AppBar() }
        ) { innerPadding ->
            ScrollableColumn(contentPadding = innerPadding) {
                Header(stringResource(R.string.top))

                FeaturedPost(
                    post = featured,
                    modifier = Modifier.padding(16.dp),
                    emoji = emojis
                )
                Header(stringResource(R.string.popular))
                posts.forEach { post ->
                    PostItem(post = post)
                    Divider(startIndent = 72.dp)
                }
            }
        }
    }
}

@Composable
fun FeaturedPost(
    post: Post,
    emoji: Emoji,
    modifier: Modifier = Modifier
) {
    Card(modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                }
        ) {
            Image(
                asset = imageResource(post.imageId),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .preferredHeight(140.dp)
            )
            Spacer(Modifier.preferredHeight(16.dp))

            val padding = Modifier.padding(horizontal = 16.dp)

            /**
             * Emphasis API
             * PrivideEmphasis composable: alters alpha of current contentColor()
             * EmphasisAmbient offers high, medium, and disabled levels of emphasis
             */

            /**
             * Emphasis API
             * PrivideEmphasis composable: alters alpha of current contentColor()
             * EmphasisAmbient offers high, medium, and disabled levels of emphasis
             */
            ProvideEmphasis(EmphasisAmbient.current.high) {
//                Text(
//                    text = emoji.emoji
//                )
                Text(
                    text = post.title,
                    modifier = padding
                )

                Text(
                    text = post.metadata.author.name,
                    modifier = padding
                )
            }

            PostMetadata(post, padding)
            Spacer(Modifier.preferredHeight(16.dp))
        }
    }
}

@Preview("Post Item")
@Composable
private fun PostItemPreview() {
    val post = remember { PostRepo.getFeaturedPost() }
    Surface {
        PostItem(
            post = post
        )
    }
}

@Preview("Home")
@Composable
private fun HomePreview() {
    Home()
}