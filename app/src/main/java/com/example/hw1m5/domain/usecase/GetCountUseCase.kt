package com.example.hw1m5.domain.usecase

import com.example.hw1m5.domain.model.Count
import com.example.hw1m5.domain.repository.CounterRepository

class GetCountUseCase (
    private val repository: CounterRepository
){
    fun getCount() =
        repository.getCount()

}
