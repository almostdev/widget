package com.almostdev.harness.widget.controller.main

import androidx.databinding.DataBindingUtil
import com.almostdev.harness.widget.R
import com.almostdev.harness.widget.databinding.ActivityMainBinding
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideBinding(activity: MainActivity): ActivityMainBinding {
        return DataBindingUtil.setContentView(activity, R.layout.activity_main)
    }
}