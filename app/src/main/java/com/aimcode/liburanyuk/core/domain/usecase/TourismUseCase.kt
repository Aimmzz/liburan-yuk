package com.aimcode.liburanyuk.core.domain.usecase

import androidx.lifecycle.LiveData
import com.aimcode.liburanyuk.core.data.Resource
import com.aimcode.liburanyuk.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}