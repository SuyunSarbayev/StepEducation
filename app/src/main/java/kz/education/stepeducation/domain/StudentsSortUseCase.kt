package kz.education.stepeducation.domain

class StudentsSortUseCase {

    fun initiateSortStudentsByName(students: ArrayList<Student>) : ArrayList<Student>? {
        return students.apply { sortBy{student ->  student.name} }
    }

    fun initiateSortStudentsRandom(students: ArrayList<Student>) : ArrayList<Student>? {
        return students.apply { shuffle() }
    }
}