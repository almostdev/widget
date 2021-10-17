package com.almostdev.harness.widget.controller.provider

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import com.almostdev.harness.widget.presenter.MissionPresenter
import com.almostdev.harness.widget.usecase.GetMissionUseCase
import dagger.android.AndroidInjection
import javax.inject.Inject
import javax.inject.Named

class WidgetProvider : AppWidgetProvider(){

    @Inject
    @Named("userNo")
    var userNo: Long = 0L

    @Inject
    lateinit var getMissionUseCase: GetMissionUseCase

    @Inject
    lateinit var missionPresenter: MissionPresenter

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        AndroidInjection.inject(this, context)
        val appWidgetId = intent.getIntExtra(
            AppWidgetManager.EXTRA_APPWIDGET_ID,
            AppWidgetManager.INVALID_APPWIDGET_ID
        )
        getMissionUseCase.execute(userNo) {
            missionPresenter.present(appWidgetId, it)
        }
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        getMissionUseCase.execute(202020) { mission ->
            appWidgetIds.forEach { id ->
                missionPresenter.present(id, mission)
            }
        }
    }
}