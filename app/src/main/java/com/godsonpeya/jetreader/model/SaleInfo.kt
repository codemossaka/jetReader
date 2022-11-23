package com.godsonpeya.jetreader.model

import com.godsonpeya.jetreader.model.ListPrice
import com.godsonpeya.jetreader.model.Offer
import com.godsonpeya.jetreader.model.RetailPriceX

data class SaleInfo(
    val buyLink: String,
    val country: String,
    val isEbook: Boolean,
    val listPrice: ListPrice,
    val offers: List<Offer>,
    val retailPrice: RetailPriceX,
    val saleability: String
)