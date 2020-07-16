package kz.education.stepeducation.presentation.contract

import kz.education.stepeducation.domain.Student
import kz.education.stepeducation.presentation.base.BaseContract

interface StudentsFragmentContract {

    interface View : BaseContract.BaseView{
        fun initializePresenter()

        fun initializeLayoutManager()

        fun initializeAdapter()

        fun initiateUpdateAdapter()

        fun processData(students: ArrayList<Student>)
    }

    interface Presenter : BaseContract.BasePresenter<View>{
        fun initializeData()

        fun initiateSortStudentsByName()

        fun initiateRequestCurrencies()

        fun initiateSortStudentsRandom()
    }
}