package kz.education.stepeducation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StudentsActivity : AppCompatActivity(){

    var students: ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
//        students.add("Grigoriy")
//        (0..15).forEach{index ->
//            System.out.println(students.get(index))
//        }
//        students.forEach { student ->
//            System.out.println(student)
//        }
//        System.out.println()
    }
}