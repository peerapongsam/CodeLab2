package io.github.peerapongsam.codelab2.model

import com.google.gson.annotations.SerializedName

data class RoomTopic(
    @SerializedName("success") val success: Boolean,
    @SerializedName("data") val data: List<Topic>,
    @SerializedName("previous_id") val previousId: Int?,
    @SerializedName("next_id") val nextId: Int?
)
