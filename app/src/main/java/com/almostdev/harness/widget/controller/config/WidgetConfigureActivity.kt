package com.almostdev.harness.widget.controller.config

import android.appwidget.AppWidgetManager
import android.content.Intent
import android.os.Bundle
import com.almostdev.harness.widget.databinding.ActivityConfigureBinding
import dagger.android.support.DaggerAppCompatActivity
import us.band.slingring.Starter
import javax.inject.Inject

@Starter
class WidgetConfigureActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var binding: ActivityConfigureBinding

    private var appWidgetId = AppWidgetManager.INVALID_APPWIDGET_ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appWidgetId =
            intent.extras?.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId) ?: appWidgetId
        binding.appWidgetId = appWidgetId.toString()

        val resultValue = Intent()
        resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
        setResult(RESULT_OK, resultValue)
    }
}