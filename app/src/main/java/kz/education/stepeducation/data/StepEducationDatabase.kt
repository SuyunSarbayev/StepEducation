package kz.education.stepeducation.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Student::class, StudentsGroup::class), version = 2)
abstract class StepEducationDatabase : RoomDatabase() {
    abstract fun getStudentDao() : StudentDao
}