package com.almostdev.harness.widget.controller.provider

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.RemoteViews
import com.almostdev.harness.widget.R
import com.almostdev.harness.widget.controller.config.WidgetConfigureActivity
import com.almostdev.harness.widget.usecase.GetMissionUseCase
import dagger.android.AndroidInjection
import javax.inject.Inject

class WidgetProvider : AppWidgetProvider() {

    @Inject
    lateinit var widgetManager: AppWidgetManager

    @Inject
    lateinit var getMissionUseCase: GetMissionUseCase

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        AndroidInjection.inject(this, context)
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        Log.d("WidgetProvider", "#onUpdate() called")
        appWidgetIds.forEach { appWidgetId ->
            // Create an Intent to launch ExampleActivity
            val pendingIntent: PendingIntent = Intent(context, WidgetConfigureActivity::class.java)
                .let { PendingIntent.getActivity(context, 0, it, 0) }

            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            val views: RemoteViews = RemoteViews(context.packageName, R.layout.widget_weekly)
                .apply {
                    setOnClickPendingIntent(R.id.hello, pendingIntent)
                }

            // Tell the AppWidgetManager to perform an update on the current app widget
            widgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}