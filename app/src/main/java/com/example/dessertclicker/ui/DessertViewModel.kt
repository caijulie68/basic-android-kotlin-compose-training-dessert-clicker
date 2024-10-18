package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.DessertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DessertViewModel: ViewModel() {
    private val _uistate = MutableStateFlow(DessertUiState())
    val uiState: StateFlow<DessertUiState> = _uistate.asStateFlow()
}