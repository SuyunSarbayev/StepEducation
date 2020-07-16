package kz.education.stepeducation.domain.ucecase

import io.reactivex.Observable
import kz.education.stepeducation.data.Currency
import kz.education.stepeducation.data.repository.CurrencyRepository
import kz.education.stepeducation.domain.base.BaseNetworkUseCase
import kz.education.stepeducation.domain.repository.CurrencyDomainRepository

class GetCurrenciesUseCase : BaseNetworkUseCase<Currency> {

    var currencyDomainRepository: CurrencyDomainRepository

    constructor(){
        currencyDomainRepository = CurrencyRepository()
    }

    override fun initiateCreateObservable(): Observable<Currency> {
        return currencyDomainRepository.initiateGetCurrency()
    }
}