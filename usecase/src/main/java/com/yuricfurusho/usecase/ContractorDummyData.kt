package com.yuricfurusho.usecase

object ContractorDummyData {
    private val parisLandscaper = Contractor(
        name = "Landscaper from VM",
        city = "Paris",
        category = "landscape"
    )
    private val tokyoPainter = Contractor(
        name = "Painter from VM",
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

