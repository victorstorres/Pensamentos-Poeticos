package com.example.pensamentos_poeticos.ui.askIA

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class AskIAViewModel @Inject constructor(): ViewModel() {

    private val _uiState = MutableStateFlow(AskIAUistate())
    val uiState: StateFlow<AskIAUistate> = _uiState.asStateFlow()


    init{
        _uiState.update { state ->
            state.copy(
                onSearchPoet = {
                    _uiState.value = _uiState.value.copy(
                        searchPoet = it
                    )
                }
            )
        }

    }

}