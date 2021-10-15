package com.almostdev.harness.widget.usecase

import java.time.LocalDate

data class Mission(
    val title: String,
    val frequency: Int,
    val startAt: Long,
    val endAt: Long,
    val confirmed: List<LocalDate>
)