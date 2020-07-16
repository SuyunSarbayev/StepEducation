package kz.education.stepeducation.domain.repository

import io.reactivex.Observable
import kz.education.stepeducation.data.Currency

interface CurrencyDomainRepository {
    fun initiateGetCurrency() : Observable<Currency>
}