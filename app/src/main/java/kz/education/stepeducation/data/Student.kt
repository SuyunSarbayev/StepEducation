package kz.education.stepeducation.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
    entity = StudentsGroup::class,
    parentColumns = arrayOf("title"),
    childColumns = arrayOf("groupTitle"),
    onDelete = CASCADE)))
class Student {

    @PrimaryKey
    var name: String = ""

    var groupTitle: String = ""

    override fun toString(): String {
        return "Student(name='$name')"
    }

}