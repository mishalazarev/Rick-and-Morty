package white.ball.rick_and_morty.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import white.ball.rick_and_morty.data.remote_storage.retrofit.mapper.toCharacterDBO
import white.ball.rick_and_morty.data.remote_storage.retrofit.model.ResponseDTO
import white.ball.rick_and_morty.domain.extenssion_model.StateResponse
import white.ball.rick_and_morty.domain.model.main.CharacterDBO
import white.ball.rick_and_morty.domain.use_case.GetAllCharactersUseCase

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllCharactersUseCase: GetAllCharactersUseCase
) : ViewModel() {

    private val _characters = MutableStateFlow<List<CharacterDBO>>(emptyList())
    val characters: StateFlow<List<CharacterDBO>> = _characters

    init {
        getAllCharacters()
    }

    private fun getAllCharacters() {
        viewModelScope.launch {
                _characters.value = getAllCharactersUseCase().data?.results?.map {
                    it.toCharacterDBO()
                } ?: emptyList()

        }
    }

}