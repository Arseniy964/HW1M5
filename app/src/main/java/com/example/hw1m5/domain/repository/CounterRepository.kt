package com.example.hw1m5.domain.repository

import com.example.hw1m5.domain.model.Count

interface CounterRepository {
    fun increment()
    fun decrement()
    fun getCount(): Count
}
