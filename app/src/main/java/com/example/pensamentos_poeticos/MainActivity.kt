package com.example.pensamentos_poeticos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pensamentos_poeticos.ui.askIA.AskIAScreen
import com.example.pensamentos_poeticos.ui.askIA.AskIAViewModel
import com.example.pensamentos_poeticos.ui.theme.Pensamentos_PoeticosTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pensamentos_PoeticosTheme {
                val viewModel = hiltViewModel<AskIAViewModel>()
                val state by viewModel.uiState.collectAsState()
                AskIAScreen(state = state)
            }
        }
    }
}

