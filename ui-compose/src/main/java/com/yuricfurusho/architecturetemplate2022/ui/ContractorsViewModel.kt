package com.yuricfurusho.architecturetemplate2022.ui

import androidx.lifecycle.ViewModel
import com.yuricfurusho.usecase.Contractor
import com.yuricfurusho.usecase.ContractorDummyData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ContractorsViewModel : ViewModel() {

    //TODO simplify mutable
    private val _contractorList = MutableStateFlow(ContractorDummyData.contractorList)
    val contractorList: StateFlow<List<Contractor>> = _contractorList

    //TODO add refresh
    //TODO add loadNextPage
}
