package com.example.hw1m5.domain.usecase

import com.example.hw1m5.domain.repository.CounterRepository

class incrementUseCase(
    private val repository: CounterRepository
){
    fun increment(){
        repository.increment()
    }
}