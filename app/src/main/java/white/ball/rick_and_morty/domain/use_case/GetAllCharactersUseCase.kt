package white.ball.rick_and_morty.domain.use_case

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse
import white.ball.rick_and_morty.domain.repository.RickAndMortyRepository
import javax.inject.Inject

class GetAllCharactersUseCase @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
) {
    suspend operator fun invoke(): StateResponse<ResponseDTO>  {
       return rickAndMortyRepository.getAllCharacters()
    }
}