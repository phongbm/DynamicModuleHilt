package com.phongbm.dynamicmodulehilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.phongbm.dynamicmodulehilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}