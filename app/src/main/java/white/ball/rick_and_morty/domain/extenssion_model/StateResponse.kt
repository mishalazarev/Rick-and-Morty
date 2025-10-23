package white.ball.rick_and_morty.domain.extenssion_model

sealed class StateResponse<T>(
    val data: T? = null,
    val message: String? = null
){

    class Success<T>(data: T?) : StateResponse<T>(data)
    class Error<T>(message: String?, data: T? = null) : StateResponse<T>(data, message)
    class Loading<T> : StateResponse<T>()

}
