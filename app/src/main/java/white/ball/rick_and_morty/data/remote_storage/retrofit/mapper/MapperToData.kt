package white.ball.rick_and_morty.data.remote_storage.retrofit.mapper

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.additional.OriginDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.main.CharacterDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.main.LocationDTO
import white.ball.rick_and_morty.domain.model.additional.OriginDBO
import white.ball.rick_and_morty.domain.model.main.CharacterDBO
import white.ball.rick_and_morty.domain.model.main.LocationDBO

fun CharacterDBO.toCharacterDTO() = CharacterDTO(
    id = this.id,
    name = this.name,
    status = this.status,
    species = this.species,
    type = this.type,
    gender = this.gender,
    origin = this.origin.toOriginDTO(),
    location = this.location.toLocationDTO(),
    image = this.image,
    episode = this.episode,
    url = this.url,
    created = this.created
)


fun OriginDBO.toOriginDTO() = OriginDTO(
    name = this.name,
    url = this.url
)

fun LocationDBO.toLocationDTO() = LocationDTO(
    name = this.name,
    url = this.url
)