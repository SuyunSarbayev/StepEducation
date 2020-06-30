package kz.education.stepeducation.presentation.presenters

import kz.education.stepeducation.data.Student
import kz.education.stepeducation.presentation.contract.StudentsFragmentContract

class StudentsFragmentPresenter : StudentsFragmentContract.Presenter{

    var view: StudentsFragmentContract.View? = null

    override fun attach(view: StudentsFragmentContract.View) {
        this.view = view
    }

    override fun initializeData(){
        view?.processData(ArrayList<Student>().apply {
            add(Student("Alex", "Good Student"))
            add(Student("Roland", "Bad Student"))
            add(Student("Force", "Average Student"))
        })
        view?.initiateUpdateAdapter()
    }

    override fun onStop() {
        view = null
    }
}