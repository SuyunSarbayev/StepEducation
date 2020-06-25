package kz.education.stepeducation.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.education.stepeducation.R
import kz.education.stepeducation.data.Student
import kz.education.stepeducation.viewholder.StudentsHolder

// Рабочии на конвеере
class StudentsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    var context: Context? = null
    lateinit var students: ArrayList<Student>

    constructor(context: Context?, students: ArrayList<Student>){
        this.context = context
        this.students = students
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        Log.d("Adapter", "onCreateViewHolder")
        var view = LayoutInflater.from(context).inflate(R.layout.viewholder_student, parent, false)
        return StudentsHolder(view)
    }

    override fun getItemCount(): Int {
        return students?.size ?: 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("Adapter", "onBindViewHolder")
        (holder as StudentsHolder).initiateBind(students.get(position))
    }
}