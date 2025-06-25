package com.example.hw1m5.presentation

import androidx.lifecycle.ViewModel
import com.example.hw1m5.domain.usecase.DecrementUseCase
import com.example.hw1m5.domain.usecase.IncrementUseCase

class MainViewModel (
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase

) : ViewModel () {

}