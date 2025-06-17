package com.example.hw1m5.domain.usecase

import com.example.hw1m5.domain.repository.CounterRepository

class decrementUseCase (
    private val repository:  CounterRepository
){
    fun execute(){
        repository.decrement()
    }
}