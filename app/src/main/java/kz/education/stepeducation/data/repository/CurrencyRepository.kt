package kz.education.stepeducation.data.repository

import io.reactivex.Observable
import kz.education.stepeducation.data.Currency
import kz.education.stepeducation.data.api.ApiImplementation
import kz.education.stepeducation.domain.repository.CurrencyDomainRepository

class CurrencyRepository : CurrencyDomainRepository {

    var apiImplementation: ApiImplementation

    constructor(){
        apiImplementation = ApiImplementation()
    }

    override fun initiateGetCurrency(): Observable<Currency> {
        return apiImplementation.initiateGetCurrencies()
            .map { response ->
                if(response.isSuccessful){
                    response.body()
                }else{
                    throw Exception()
                }
            }
    }
}