package com.example.hw1m5.data.repository

import com.example.hw1m5.data.datasource.CounterDataSource
import com.example.hw1m5.data.model.CountDto
import com.example.hw1m5.domain.model.Count
import com.example.hw1m5.domain.repository.CounterRepository

class CounterRepositoryImpl: CounterRepository {
    private var count = 0
    private var operation = "+"

    override fun increment() {
        count ++
        operation = "+"
    }

    override fun decrement() {
        count --
        operation = "-"
    }

    override fun getCount(): Count {
        return Count(count, operation)
    }
}