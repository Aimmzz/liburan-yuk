package com.aimcode.liburanyuk.detail

import androidx.lifecycle.ViewModel
import com.aimcode.liburanyuk.core.domain.model.Tourism
import com.aimcode.liburanyuk.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}