package com.almostdev.harness.widget.controller.provider

import android.appwidget.AppWidgetManager
import android.content.Context
import com.almostdev.harness.widget.di.ApplicationContext
import com.almostdev.harness.widget.presenter.MissionPresenter
import com.almostdev.harness.widget.usecase.GetMissionUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class WidgetProviderModule {
    @Provides
    @Named("userNo")
    fun provideUserNo(): Long {
        return 100L
    }

    @Provides
    fun provideAppWidgetManager(@ApplicationContext context: Context): AppWidgetManager {
        return AppWidgetManager.getInstance(context)
    }

    @Provides
    fun provideGetMissionUseCase(): GetMissionUseCase {
        return GetMissionUseCase()
    }

    @Provides
    fun provideMissionPresenter(
        @ApplicationContext context: Context,
        appWidgetManager: AppWidgetManager
    ): MissionPresenter {
        return MissionPresenter(context, appWidgetManager)
    }
}