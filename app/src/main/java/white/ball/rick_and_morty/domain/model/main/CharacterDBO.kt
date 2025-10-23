package white.ball.rick_and_morty.domain.model.main

import white.ball.rick_and_morty.domain.model.additional.OriginDBO

data class CharacterDBO (
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: OriginDBO,
    val location: LocationDBO,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)