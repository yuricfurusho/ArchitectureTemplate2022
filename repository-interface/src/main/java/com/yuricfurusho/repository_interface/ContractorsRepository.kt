package com.yuricfurusho.repository_interface

import com.yuricfurusho.domain_data.Contractor

//TODO yuri: rename to remove s
interface ContractorsRepository {
    fun getContractorList() : List<Contractor>
}