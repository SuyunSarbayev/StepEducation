package kz.education.stepeducation.data.api

import kz.education.stepeducation.data.Currency
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("latest")
    fun initiateGetCurrencies() : Call<Currency>
}