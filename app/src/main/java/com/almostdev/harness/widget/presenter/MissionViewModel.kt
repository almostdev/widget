package com.almostdev.harness.widget.presenter

import org.threeten.bp.LocalDate
import org.threeten.bp.temporal.WeekFields
import java.util.*

class MissionViewModel {
    var title: String = ""
    var subTitle: String = ""
    var startDate: LocalDate = LocalDate.now().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1)
    var endDate: LocalDate = LocalDate.now().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 7)


}