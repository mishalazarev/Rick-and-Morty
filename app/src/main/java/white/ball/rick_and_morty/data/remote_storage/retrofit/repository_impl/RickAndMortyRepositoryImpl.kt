package white.ball.rick_and_morty.data.remote_storage.retrofit.repository_impl

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.util.RemoteDataSource
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse
import white.ball.rick_and_morty.domain.repository.BaseApiResponse
import white.ball.rick_and_morty.domain.repository.RickAndMortyRepository
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : RickAndMortyRepository, BaseApiResponse() {

    override suspend fun getAllCharacters(): StateResponse<ResponseDTO> {
        return safeApiCall { remoteDataSource.getAllCharacters() }
    }
}