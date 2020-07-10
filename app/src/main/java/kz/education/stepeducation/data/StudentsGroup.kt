package kz.education.stepeducation.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class StudentsGroup {

    @PrimaryKey
    var title: String = ""
}