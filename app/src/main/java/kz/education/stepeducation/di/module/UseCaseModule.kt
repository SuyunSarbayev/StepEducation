package kz.education.stepeducation.di.module

import dagger.Module
import dagger.Provides
import kz.education.stepeducation.domain.StudentsSortUseCase

@Module
class UseCaseModule {

    @Provides
    fun providesStudentsSortUseCase() : StudentsSortUseCase{
        return StudentsSortUseCase()
    }
}