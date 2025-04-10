package com.aimcode.liburanyuk.home

import androidx.lifecycle.ViewModel
import com.aimcode.liburanyuk.core.domain.usecase.TourismUseCase


class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism()
}