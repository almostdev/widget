package com.almostdev.harness.widget.controller.main

import android.os.Bundle
import com.almostdev.harness.widget.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.testString = "Hello world2!"
    }
}