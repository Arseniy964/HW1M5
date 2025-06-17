package com.example.hw1m5.data.datasource

import com.example.hw1m5.data.model.CountDto

class CounterDataSource {
    private var countDto = CountDto()
    private var count = 0

    fun increment(){
        countDto = CountDto(
            count = count ++,
            isIncrement = true,
        )
    }

    fun decrement(){
        countDto = CountDto(
            count = count --,
            isIncrement = false,
        )
    }
    fun getCount() = countDto
}