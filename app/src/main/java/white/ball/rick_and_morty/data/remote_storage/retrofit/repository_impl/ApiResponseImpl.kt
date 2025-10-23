package white.ball.rick_and_morty.data.remote_storage.retrofit.repository_impl

import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import white.ball.rick_and_morty.data.remote_storage.retrofit.util.RemoteDataSource
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse
import white.ball.rick_and_morty.domain.repository.BaseApiResponse
import javax.inject.Inject

class ApiResponseImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseApiResponse() {

    suspend fun getAllCharacters(): StateResponse<ResponseDTO> {
        return safeApiCall { remoteDataSource.getAllCharacters() }
    }
}