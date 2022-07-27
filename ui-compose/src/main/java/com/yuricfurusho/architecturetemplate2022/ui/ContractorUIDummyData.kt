package com.yuricfurusho.architecturetemplate2022.ui

import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.LandscaperGreen
import com.yuricfurusho.architecturetemplate2022.ui.ui.theme.PainterBlue
object ContractorUIDummyData {
    private val parisLandscaper = ContractorItemUI(
        name = "Landscaper HardCoded",
        cityImage = R.drawable.paris,
        cityName = "Paris",
        categoryColour = LandscaperGreen
    )
    private val tokyoPainter = ContractorItemUI(
        name = "Painter HardCoded",
        cityImage = R.drawable.tokyo,
        cityName = "Tokyo",
        categoryColour = PainterBlue
    )

    val contractorList = mutableListOf<ContractorItemUI>()
        .apply {
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
            add(parisLandscaper)
            add(tokyoPainter)
        }
}

