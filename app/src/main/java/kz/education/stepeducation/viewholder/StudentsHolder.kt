package kz.education.stepeducation.viewholder

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.education.stepeducation.R
import kz.education.stepeducation.data.Student

class StudentsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var context: Context? = null

    var textViewName: TextView? = null
    var textViewDescription: TextView? = null

    init {
        initializeViews()
    }

    fun initializeViews(){
        textViewName.setText(context.getString(R.string.viewholder_student_name_header, "Kirill"))
        textViewName = itemView.findViewById(R.id.textview_viewholder_student_name)
        textViewDescription = itemView.findViewById(R.id.textview_viewholder_student_description)
    }

    fun initiateBind(student: Student){
        textViewName?.setText(student.name)
        textViewDescription?.setText(student.description)
    }
}