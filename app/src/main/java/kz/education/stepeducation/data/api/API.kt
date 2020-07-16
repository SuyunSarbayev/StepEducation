package kz.education.stepeducation.data.api

import io.reactivex.Observable
import kz.education.stepeducation.data.Currency
import retrofit2.Response
import retrofit2.http.GET

interface API {
    @GET("latest")
    fun initiateGetCurrencies() : Observable<Response<Currency>>
}