package com.example.hw1m5.data.mapper

import com.example.hw1m5.data.model.CountDto
import com.example.hw1m5.domain.model.Count

fun CountDto.toDomain(): Count {
    return Count (
        count = this.count,
        isIncrement = this.isIncrement
    )
}