package io.github.peerapongsam.codelab2.model

import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String
)
