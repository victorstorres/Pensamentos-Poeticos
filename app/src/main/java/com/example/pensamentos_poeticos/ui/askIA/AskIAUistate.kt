package com.example.pensamentos_poeticos.ui.askIA

data class AskIAUistate(
    val searchPoet: String = "",
    val onSearchPoet: (String) -> Unit = {}
)
