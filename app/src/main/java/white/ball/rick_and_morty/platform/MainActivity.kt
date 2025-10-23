package white.ball.rick_and_morty.platform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import white.ball.rick_and_morty.presentation.MainScreen
import white.ball.rick_and_morty.presentation.MainViewModel
import white.ball.rick_and_morty.presentation.theme.RickAndMortyTheme
import androidx.hilt.navigation.compose.hiltViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RickAndMortyTheme {
                val mainViewModel: MainViewModel = hiltViewModel()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val targetValue = innerPadding
                    MainScreen(
                        mainViewModel
                    )
                }
            }
        }
    }
}