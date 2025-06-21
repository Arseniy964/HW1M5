package com.example.hw1m5.domain.usecase

import com.example.hw1m5.domain.repository.CounterRepository

class DecrementUseCase (
    private val repository:  CounterRepository
){
    fun decrement() =
        repository.decrement()
}