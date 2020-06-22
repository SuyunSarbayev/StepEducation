package kz.education.stepeducation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StudentsActivity : AppCompatActivity(){

    var students: ArrayList<String> = ArrayList<String>()

    var buttonOne: Button? = null
    var buttonTwo: Button? = null

    TextView
    AppCompatTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        initializeViews()
        initializeListeners()

    }

    fun initializeViews(){
        buttonOne = findViewById(R.id.button_activity_students_sort_byname)
        buttonTwo = findViewById(R.id.button_activity_students_sort_random)
    }

    fun initializeListeners(){
        buttonOne?.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().apply {
                putExtra("Name", "Good")
            })
            finish()
        }

        buttonTwo?.setOnClickListener {
            setResult(Activity.RESULT_CANCELED, Intent().apply {
                putExtra("Name", "Bad")
            })
            finish()
        }
    }
}