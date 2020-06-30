package kz.education.stepeducation.presentation.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kz.education.stepeducation.data.Student

import kotlinx.android.synthetic.main.viewholder_student.view.*

// Каркас
class StudentsHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var context: Context? = null

    init { }

    fun initiateBind(student: Student){
        itemView?.textview_viewholder_student_name?.setText(student.name)
        itemView?.textview_viewholder_student_description?.setText(student.description)
    }
}