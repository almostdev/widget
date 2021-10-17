package com.almostdev.harness.widget.usecase

class GetMissionUseCase {
    fun execute(userNo: Long, outputPort : (Mission) -> Unit) {
        outputPort.invoke(Mission("testMission", 1))
    }
}
