package white.ball.rick_and_morty.domain.repository

import retrofit2.Response
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(api: suspend () -> Response<T>): StateResponse<T> {
        try {
            val response = api()
            if (response.isSuccessful) {
                val body = response.body()
                body?.let { nonNullBody ->
                    return StateResponse.Success(data = nonNullBody)
                } ?: return errorMessage("Body is empty")
            } else {
                return error("${response.code()} ${response.message()}")
            }
        } catch (e: Exception) {
            return errorMessage(e.message ?: e.toString())
        }
    }

    private fun <T> errorMessage(e: String): StateResponse.Error<T> =
        StateResponse.Error(data = null, message = "Api call failed $e")
}