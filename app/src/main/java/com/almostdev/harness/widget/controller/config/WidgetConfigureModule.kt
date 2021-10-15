package com.almostdev.harness.widget.controller.config

import androidx.databinding.DataBindingUtil
import com.almostdev.harness.widget.R
import com.almostdev.harness.widget.databinding.ActivityConfigureBinding
import dagger.Module
import dagger.Provides

@Module
class WidgetConfigureModule {
    @Provides
    fun provideBinding(activity: WidgetConfigureActivity): ActivityConfigureBinding {
        return DataBindingUtil.setContentView(activity, R.layout.activity_configure)
    }
}