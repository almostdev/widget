package com.almostdev.harness.widget.di

import com.almostdev.harness.widget.controller.main.MainActivity
import com.almostdev.harness.widget.controller.main.MainModule
import com.almostdev.harness.widget.controller.config.WidgetConfigureActivity
import com.almostdev.harness.widget.controller.config.WidgetConfigureModule
import com.almostdev.harness.widget.controller.provider.WidgetProvider
import com.almostdev.harness.widget.controller.provider.WidgetProviderModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidComponentBindingModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [WidgetConfigureModule::class])
    abstract fun contributeWidgetConfigureActivity(): WidgetConfigureActivity

    @ContributesAndroidInjector(modules = [WidgetProviderModule::class])
    abstract fun contributeWidgetProvider(): WidgetProvider
}