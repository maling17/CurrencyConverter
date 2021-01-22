package com.kresna.currencyconverter.data.models

import com.google.gson.annotations.SerializedName

data class CurrencyResponse(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("rates")
	val rates: Rates? = null,

	@field:SerializedName("base")
	val base: String? = null
)

