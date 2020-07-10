package kz.education.stepeducation.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
public interface StudentDao {

    @Insert
    fun initiateInsertStudent(student: Student)

    @Query("SELECT * FROM student")
    fun initiateGetStudents() : List<Student>
}