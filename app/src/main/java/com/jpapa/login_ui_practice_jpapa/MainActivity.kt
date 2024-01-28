package com.jpapa.login_ui_practice_jpapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpapa.login_ui_practice_jpapa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}