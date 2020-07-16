package kz.education.stepeducation.presentation.presenters

import android.util.Log
import io.reactivex.observers.DisposableObserver
import kz.education.stepeducation.data.Currency
import kz.education.stepeducation.domain.Student
import kz.education.stepeducation.domain.StudentsSortUseCase
import kz.education.stepeducation.domain.ucecase.GetCurrenciesUseCase
import kz.education.stepeducation.presentation.contract.StudentsFragmentContract

class StudentsFragmentPresenter : StudentsFragmentContract.Presenter{

    var view: StudentsFragmentContract.View? = null

    var studentsSortUseCase: StudentsSortUseCase

    var students: ArrayList<Student> = ArrayList()

    var getCurrenciesUseCase: GetCurrenciesUseCase

    constructor(){
        this.studentsSortUseCase = StudentsSortUseCase()
        this.getCurrenciesUseCase = GetCurrenciesUseCase()
    }

    override fun attach(view: StudentsFragmentContract.View) {
        this.view = view
    }

    override fun initiateRequestCurrencies() {
        getCurrenciesUseCase.execute(CurrenciesObserver())
    }

    override fun initializeData(){
        view?.processData(students.apply {
            add(Student("Alex", "Good Student"))
            add(Student("Roland", "Bad Student"))
            add(Student("Force", "Average Student"))
        })
        view?.initiateUpdateAdapter()
    }

    override fun initiateSortStudentsByName() {
        studentsSortUseCase.initiateSortStudentsByName(students)
        view?.processData(students)
        view?.initiateUpdateAdapter()
    }

    override fun initiateSortStudentsRandom() {
        studentsSortUseCase.initiateSortStudentsRandom(students)
        view?.processData(students)
        view?.initiateUpdateAdapter()
    }

    override fun onStop() {
        view = null
    }

    class CurrenciesObserver : DisposableObserver<Currency>(){
        override fun onComplete() {
            Log.d("DATA", "onComplete")
        }

        override fun onNext(t: Currency) {
            Log.d("DATA", "onNext")
        }

        override fun onError(e: Throwable) {
            Log.d("DATA", "onError")
        }

    }
}