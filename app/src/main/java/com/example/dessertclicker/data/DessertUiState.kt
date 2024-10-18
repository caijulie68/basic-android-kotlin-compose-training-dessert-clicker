package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    val dessertSold: Int = 0,
    val revenue: Int = 0,
    val currDessertIndex: Int = 0,
    val currDessertPrice: Int = dessertList[currDessertIndex].price,
    @DrawableRes val currDessertImageId: Int = dessertList[currDessertIndex].imageId
)
