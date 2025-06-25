package com.example.hw1m5.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.hw1m5.R

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()
}