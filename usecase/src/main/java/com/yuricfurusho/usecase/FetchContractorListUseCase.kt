package com.yuricfurusho.usecase

import com.yuricfurusho.domain_data.Contractor
import com.yuricfurusho.repository_interface.ContractorsRepository
import javax.inject.Inject

//TODO: yuri: maybe rename to to remove list
//TODO: yuri: remove fetch replace with get
class FetchContractorListUseCase @Inject constructor(
    private val contractorRepository: ContractorsRepository,
) {

    operator fun invoke(): List<Contractor> = contractorRepository.getContractorList()
}