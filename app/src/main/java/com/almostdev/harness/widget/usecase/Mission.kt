package com.almostdev.harness.widget.usecase

import org.threeten.bp.LocalDate
import org.threeten.bp.temporal.WeekFields
import java.util.*

data class Mission(
    val title: String,
    val frequency: Int,
    val startAt: LocalDate = LocalDate.now().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1),
    val endAt: LocalDate = LocalDate.now().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 7),
    val confirmed: List<LocalDate> = listOf()
)