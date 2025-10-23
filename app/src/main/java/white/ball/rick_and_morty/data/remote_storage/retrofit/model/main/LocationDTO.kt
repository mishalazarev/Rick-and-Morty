package white.ball.rick_and_morty.data.remote_storage.retrofit.model.main

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationDTO(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)