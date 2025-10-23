package white.ball.rick_and_morty.domain.repository

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse

interface RickAndMortyRepository {

    suspend fun getAllCharacters(): StateResponse<ResponseDTO>

}