package kz.education.stepeducation.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.education.stepeducation.R
import kz.education.stepeducation.data.Student

class StudentsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var textViewName: TextView? = null
    var textViewDescription: TextView? = null

    init {
        initializeViews()
    }

    fun initializeViews(){
        textViewName = itemView.findViewById(R.id.textview_viewholder_student_name)
        textViewDescription = itemView.findViewById(R.id.textview_viewholder_student_description)
    }

    fun initiateBind(student: Student){
        textViewName?.setText(student.name)
        textViewDescription?.setText(student.description)
    }
}