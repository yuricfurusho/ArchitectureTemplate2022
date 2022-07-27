package com.yuricfurusho.usecase

import javax.inject.Inject

class FetchContractorListUseCase @Inject constructor() {

    operator fun invoke(): MutableList<Contractor> = ContractorDummyData.contractorList
}