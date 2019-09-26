package io.github.peerapongsam.codelab2.model

import com.google.gson.annotations.SerializedName

data class Avatar(
    @SerializedName("original") val original: String,
    @SerializedName("large") val large: String,
    @SerializedName("medium") val medium: String,
    @SerializedName("small") val small: String
)
