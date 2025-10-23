package white.ball.rick_and_morty.data.remote_storage.retrofit.util

import white.ball.rick_and_morty.data.remote_storage.retrofit.api.RickAndMortyApi
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: RickAndMortyApi
) {
    suspend fun getAllCharacters() = api.getAllCharacters()

}