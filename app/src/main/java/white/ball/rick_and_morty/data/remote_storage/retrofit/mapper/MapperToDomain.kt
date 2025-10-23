package white.ball.rick_and_morty.data.remote_storage.retrofit.mapper

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.additional.OriginDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.main.CharacterDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.main.LocationDTO
import white.ball.rick_and_morty.domain.model.additional.OriginDBO
import white.ball.rick_and_morty.domain.model.main.CharacterDBO
import white.ball.rick_and_morty.domain.model.main.LocationDBO

fun CharacterDTO.toCharacterDBO() = CharacterDBO(
    id = this.id,
    name = this.name,
    status = this.status,
    species = this.species,
    type = this.type,
    gender = this.gender,
    origin = this.origin.toOriginDBO(),
    location = this.location.toLocationDBO(),
    image = this.image,
    episode = this.episode,
    url = this.url,
    created = this.created
)

fun OriginDTO.toOriginDBO() = OriginDBO(
    name = this.name,
    url = this.url,
)

fun LocationDTO.toLocationDBO() = LocationDBO(
    name = this.name,
    url = this.url,
)