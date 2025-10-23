package white.ball.rick_and_morty.data.remote_storage.retrofit.api

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.http.GET
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response

interface RickAndMortyApi {

    @GET("character")
    suspend fun getAllCharacters(): Response<ResponseDTO>
}

fun getRickAndMortyApi(): RickAndMortyApi {
    return retrofit(
        "https://rickandmortyapi.com/api/"
    ).create(RickAndMortyApi::class.java)
}

fun retrofit(baseUrl: String): Retrofit {
    val jsonConverterFactory = Json.asConverterFactory("application/json".toMediaType())

    val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()


    return Retrofit
        .Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(jsonConverterFactory)
        .build()
}
