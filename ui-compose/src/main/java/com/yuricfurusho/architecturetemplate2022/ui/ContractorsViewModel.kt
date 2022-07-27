package com.yuricfurusho.architecturetemplate2022.ui

import androidx.lifecycle.ViewModel
import com.yuricfurusho.usecase.ContractorDummyData

class ContractorsViewModel : ViewModel() {

    private val _contractorList = ContractorDummyData.contractorList
    val contractorList = _contractorList

}
