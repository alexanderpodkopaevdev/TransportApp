package com.alexanderpodkopaev.transportapp.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexanderpodkopaev.presentation.screens.CountriesFragment
import com.alexanderpodkopaev.transportapp.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.flMain,CountriesFragment.newInstance())
            .commit()
    }
}