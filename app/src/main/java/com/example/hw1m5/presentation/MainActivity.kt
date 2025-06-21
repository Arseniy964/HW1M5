package com.example.hw1m5.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.hw1m5.data.repository.CounterRepositoryImpl
import com.example.hw1m5.databinding.ActivityMainBinding
import com.example.hw1m5.domain.usecase.DecrementUseCase
import com.example.hw1m5.domain.usecase.GetCountUseCase
import com.example.hw1m5.domain.usecase.IncrementUseCase
import com.example.hw1m5.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = CounterRepositoryImpl()
        viewModel = MainViewModel(
            getCountUseCase = GetCountUseCase(repository),
            incrementUseCase = IncrementUseCase(repository),
            decrementUseCase = DecrementUseCase(repository)
        )

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }

        binding.btnDecrement.setOnClickListener {
            viewModel.decrement()
        }

        viewModel.countLiveData.observe(this) { countUi ->
            binding.tvCount.text = countUi.count.toString()
            binding.tvOperationType.text = countUi.operationTypeText
        }
    }
}
