package com.almostdev.harness.widget.presenter

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.almostdev.harness.widget.R
import com.almostdev.harness.widget.controller.config.WidgetConfigureActivity
import com.almostdev.harness.widget.usecase.Mission

class MissionPresenter(
    private val context: Context,
    private val appWidgetManager: AppWidgetManager
) {
    fun present(widgetId: Int, mission: Mission) {
        val missionViewModel = MissionViewModel(mission)

        val rootView = RemoteViews(context.packageName, R.layout.widget_weekly)
        rootView.setTextViewText(R.id.title_text_view, missionViewModel.title)
        rootView.setTextViewText(R.id.subtitle_text_view, missionViewModel.subTitle)

        val pendingIntent: PendingIntent = Intent(context, WidgetConfigureActivity::class.java)
            .let { PendingIntent.getActivity(context, 0, it, 0) }

        rootView.setOnClickPendingIntent(R.id.container, pendingIntent)

        // Tell the AppWidgetManager to perform an update on the current app widget
        appWidgetManager.updateAppWidget(widgetId, rootView)
    }
}