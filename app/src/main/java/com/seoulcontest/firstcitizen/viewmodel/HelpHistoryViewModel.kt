package com.seoulcontest.firstcitizen.viewmodel

import androidx.databinding.ObservableField
import com.seoulcontest.firstcitizen.data.vo.GetReportHistory
import com.seoulcontest.firstcitizen.data.vo.Request

class HelpHistoryViewModel {

    var reportHistory  = ObservableField<GetReportHistory>() // 제보 히스토리 정보를 가지고 있는 변수
    var request = ObservableField<Request>() // 의뢰 정보를 가지고 있는 변수



    companion object {
        private var INSTANCE: HelpHistoryViewModel? = null

        fun getInstance() = INSTANCE ?: HelpHistoryViewModel().apply {
            INSTANCE = this
        }
    }
}