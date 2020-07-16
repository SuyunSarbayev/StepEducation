package kz.education.stepeducation.data.api

import io.reactivex.Observable
import kz.education.stepeducation.data.Currency
import retrofit2.Response

class ApiImplementation : API {

    lateinit var api: API

    constructor(){
        api = ApiConnection().initializeAPI()
    }

    override fun initiateGetCurrencies(): Observable<Response<Currency>> {
        return api.initiateGetCurrencies()
    }
}