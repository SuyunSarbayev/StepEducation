package kz.education.stepeducation.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Student::class), version = 1)
abstract class StepEducationDatabase : RoomDatabase() {
    abstract fun getStudentDao() : StudentDao
}