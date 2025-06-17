package com.example.hw1m5.data.repository

import com.example.hw1m5.data.datasource.CounterDataSource
import com.example.hw1m5.data.model.CountDto
import com.example.hw1m5.domain.model.Count
import com.example.hw1m5.domain.repository.CounterRepository

class CounterRepositoryImpl: CounterRepository {
    private val db = CounterDataSource()
    override fun increment() {
        db.increment()
    }

    override fun decrement() {
        db.decrement()
    }

    override fun getCount(): Count {
        val response: CountDto = db.getCount()
        return Count(
            count = response.count,
            isIncrement = response.isIncrement
        )

    }
}