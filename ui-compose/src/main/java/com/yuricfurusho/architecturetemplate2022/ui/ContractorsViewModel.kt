package com.yuricfurusho.architecturetemplate2022.ui

import androidx.lifecycle.ViewModel
import com.yuricfurusho.usecase.Contractor
import com.yuricfurusho.usecase.FetchContractorListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ContractorsViewModel @Inject constructor(
    private val fetchContractorListUseCase: FetchContractorListUseCase
) : ViewModel() {

    //TODO simplify mutable
    private val _contractorList = MutableStateFlow(emptyList<Contractor>())
    val contractorList: StateFlow<List<Contractor>> = _contractorList

    //TODO add refresh
    fun loadContractorList() {
        _contractorList.value = fetchContractorListUseCase()
    }
    //TODO add loadNextPage
}
