package com.yuricfurusho.usecase

object ContractorDummyData {
    private val parisLandscaper = Contractor(
        name = "Landscaper from USECASE",
        city = "Paris",
        category = "landscape"
    )
    private val tokyoPainter = Contractor(
        name = "Painter from USECASE",
        city = "Tokyo",
        category = "painter"
    )

    val contractorList = mutableListOf<Contractor>()
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

