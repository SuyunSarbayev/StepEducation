package kz.education.stepeducation.presentation.presenters

import kz.education.stepeducation.data.Student
import kz.education.stepeducation.domain.StudentsSortUseCase
import kz.education.stepeducation.presentation.contract.StudentsFragmentContract

class StudentsFragmentPresenter : StudentsFragmentContract.Presenter{

    var view: StudentsFragmentContract.View? = null

    var studentsSortUseCase: StudentsSortUseCase

    var students: ArrayList<Student> = ArrayList()

    constructor(){
        this.studentsSortUseCase = StudentsSortUseCase()
    }

    override fun attach(view: StudentsFragmentContract.View) {
        this.view = view
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
}