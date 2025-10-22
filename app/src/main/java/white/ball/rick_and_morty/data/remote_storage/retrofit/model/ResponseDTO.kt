package white.ball.rick_and_morty.data.remote_storage.retrofit.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseDTO(
    @SerialName("info")
    val info: InfoDTO,
    @SerialName("results")
    val results: List<CharacterDTO>
)
