package com.almostdev.harness.widget.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, AndroidComponentBindingModule::class])
interface ApplicationComponent : AndroidInjector<WidgetHarnessApplication> {
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<WidgetHarnessApplication>
}