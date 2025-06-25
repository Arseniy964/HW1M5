package com.example.hw1m5.di

import android.app.Application
import com.example.hw1m5.data.datasource.CounterDataSource
import com.example.hw1m5.data.repository.CounterRepositoryImpl
import com.example.hw1m5.domain.repository.CounterRepository
import com.example.hw1m5.domain.usecase.DecrementUseCase
import com.example.hw1m5.domain.usecase.IncrementUseCase
import com.example.hw1m5.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dataModule = module {
    single <CounterRepository> { CounterRepositoryImpl() }
 }

val domainModule = module {
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
}

val presentationModule = module {
    viewModel {MainViewModel(get(), get ())}
}

val appModel = listOf(dataModule, domainModule, presentationModule)