package com.BonifacioTech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val ocupacionViewModel by viewModels()

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}