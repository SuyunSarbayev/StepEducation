package kz.education.stepeducation.di.component

import dagger.Component
import kz.education.stepeducation.di.module.UseCaseModule
import kz.education.stepeducation.domain.StudentsSortUseCase
import kz.education.stepeducation.presentation.fragment.StudentsFragment

@Component(modules = arrayOf(UseCaseModule::class))
interface UseCaseComponent {
    fun initiateReturnStudentsUseCase(): StudentsSortUseCase

    fun inject(studentsFragment: StudentsFragment)
}