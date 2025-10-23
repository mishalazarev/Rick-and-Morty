package white.ball.rick_and_morty.data.remote_storage.retrofit.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.additional.InfoDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.main.CharacterDTO

@Serializable
data class ResponseDTO(
    @SerialName("info")
    val info: InfoDTO,
    @SerialName("results")
    val results: List<CharacterDTO>
)
