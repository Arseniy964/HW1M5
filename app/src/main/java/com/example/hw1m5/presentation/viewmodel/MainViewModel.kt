package com.example.hw1m5.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw1m5.domain.usecase.DecrementUseCase
import com.example.hw1m5.domain.usecase.GetCountUseCase
import com.example.hw1m5.domain.usecase.IncrementUseCase
import com.example.hw1m5.presentation.mapper.toUi
import com.example.hw1m5.presentation.model.CountUi

class MainViewModel (

    private val getCountUseCase: GetCountUseCase,
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,

): ViewModel() {

    private val _countLiveData = MutableLiveData<CountUi>()
    val countLiveData: LiveData<CountUi> = _countLiveData

    fun increment() {
        incrementUseCase.increment()
        updateCount()
    }

    fun decrement() {
        decrementUseCase.decrement()
        updateCount()
    }

    private fun updateCount() {
        val response = getCountUseCase.getCount()
        _countLiveData.value = response.toUi()
    }
}