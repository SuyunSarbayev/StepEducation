package kz.education.stepeducation.presentation.utils

import kz.education.stepeducation.data.Student

class GarbageClass(var counter: Int) {

    lateinit var student: Student

    init {
        //student ......
    }

    fun initiateSomething(){
        counter++
    }

    fun initiateSomething2(student: Student){

    }
}