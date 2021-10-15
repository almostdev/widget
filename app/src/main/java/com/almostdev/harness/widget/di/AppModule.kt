package com.almostdev.harness.widget.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    @ApplicationContext
    fun provideContext(application: WidgetHarnessApplication): Context {
        return application.applicationContext
    }
}