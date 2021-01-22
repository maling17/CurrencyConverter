package com.kresna.currencyconverter.main

import com.kresna.currencyconverter.data.CurrencyApi
import com.kresna.currencyconverter.data.models.CurrencyResponse
import com.kresna.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base:String):Resource<CurrencyResponse>


}