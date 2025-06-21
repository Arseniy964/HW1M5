package com.example.hw1m5.presentation.mapper

import com.example.hw1m5.data.model.CountDto
import com.example.hw1m5.domain.model.Count
import com.example.hw1m5.presentation.model.CountUi

fun Count.toUi(): CountUi {
    val operationText = when (operationType) {
        "+" -> "Плюс"
        "-" -> "Минус"
        else -> "Неизвестно"
    }
    return CountUi(
        count = this.count,
        operationTypeText = operationText
    )
}