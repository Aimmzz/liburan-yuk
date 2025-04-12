package com.aimcode.liburanyuk.favorite

import androidx.lifecycle.ViewModel
import com.aimcode.liburanyuk.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism()
}