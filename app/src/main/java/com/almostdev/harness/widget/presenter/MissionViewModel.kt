package com.almostdev.harness.widget.presenter

import com.almostdev.harness.widget.usecase.Mission
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.temporal.WeekFields
import java.util.*

class MissionViewModel(mission: Mission) {
    var title: String = mission.title
    var subTitle: String = "${mission.frequency}, ${mission.startAt.format(DateTimeFormatter.ISO_DATE)} - ${mission.endAt.format(DateTimeFormatter.ISO_DATE)}"
    var startDate: LocalDate = mission.startAt
    var endDate: LocalDate = mission.endAt
}