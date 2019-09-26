package io.github.peerapongsam.codelab2.model

import com.google.gson.annotations.SerializedName

data class Topic(
    @SerializedName("topic_id") val topicId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("views_count") val viewsCount: Int,
    @SerializedName("comments_count") val commentsCount: Int,
    @SerializedName("votes_count") val votesCount: Int,
    @SerializedName("created_time") val createdTime: String,
    @SerializedName("author") val author: Author,
    @SerializedName("tags") val tags: List<Tag>,
    @SerializedName("thumbnail_url") val thumbnailUrl: String?
) {
}
