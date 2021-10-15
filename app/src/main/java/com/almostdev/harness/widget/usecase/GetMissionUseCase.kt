package com.almostdev.harness.widget.usecase

class GetMissionUseCase(val outputPort: OutputPort) {
    fun execute() {

    }

    interface OutputPort {
        fun onSelectMission(mission: Mission);
    }
}
