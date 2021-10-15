package com.almostdev.harness.widget.controller.provider

import android.appwidget.AppWidgetManager
import android.content.Context
import com.almostdev.harness.widget.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class WidgetProviderModule {
    @Provides
    fun provideAppWidgetManager(@ApplicationContext context: Context): AppWidgetManager {
        return AppWidgetManager.getInstance(context)
    }
}