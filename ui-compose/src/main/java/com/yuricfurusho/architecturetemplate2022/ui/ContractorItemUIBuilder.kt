package com.yuricfurusho.architecturetemplate2022.ui

import androidx.compose.ui.graphics.Color
import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.LandscaperGreen
import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.NeutralWhite
import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.PainterBlue
import com.yuricfurusho.usecase.Contractor

class ContractorItemUIBuilder() {

    fun from(contractor: Contractor) = ContractorItemUI(
        name = contractor.name,
        categoryColour = getCategoryColour(contractor.category),
        cityName = contractor.city,
        cityImage = getCityImage(contractor.category)
    )

    //TODO make strings enums
    //TODO add a neutral colour else
    private fun getCategoryColour(category: String): Color = when (category) {
        "landscape" -> LandscaperGreen
        "painter" -> PainterBlue
        else -> NeutralWhite
    }

    //TODO make strings enums
    //TODO add a neutral image for else
    private fun getCityImage(category: String): Int = when (category) {
        "Paris" -> R.drawable.paris
        "Tokyo" -> R.drawable.tokyo
        else -> R.drawable.paris
    }
}

