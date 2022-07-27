package com.yuricfurusho.architecturetemplate2022.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ContractorsScreen(vm: ContractorsViewModel) {
//    ContractorList(ContractorUIDummyData.contractorList)
    val contractorListUI = vm.contractorList.collectAsState().value.map {
        ContractorItemUIBuilder().from(it)
    }
    ContractorList(contractorListUI)
}

@Composable
fun ContractorList(contractorList: List<ContractorItemUI>) {
    LazyColumn {
        items(contractorList) { contractor ->
            ContractorItem(contractor)
        }
    }
}

@Composable
fun ContractorItem(contractor: ContractorItemUI) {
    Row(modifier = Modifier.background(contractor.categoryColour)) {
        Text(
            text = contractor.name,
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        )
        Image(
            contentDescription = contractor.cityName,
            painter = painterResource(id = contractor.cityImage),
            modifier = Modifier
                .padding(end = 16.dp, start = 4.dp)
                .size(100.dp)
        )
    }
}
