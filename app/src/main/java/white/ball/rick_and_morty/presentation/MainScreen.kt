package white.ball.rick_and_morty.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import white.ball.rick_and_morty.presentation.ui.CharacterUI

@Composable
fun MainScreen(
    mainViewModel: MainViewModel
) {
    val characters by mainViewModel.characters.collectAsState()

    Scaffold { innerPadding ->

        Column (
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 10.dp, vertical = 5.dp)
        ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(characters.size) { index ->
                CharacterUI(characters[index])
            }
        }
        }

    }
}