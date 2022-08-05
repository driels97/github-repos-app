package br.com.portfolio.app.repositories.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.portfolio.app.repositories.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

}