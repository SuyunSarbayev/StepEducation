package kz.education.stepeducation.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.education.stepeducation.R
import kz.education.stepeducation.adapter.StudentsAdapter
import kz.education.stepeducation.data.Student

class StudentsFragment : Fragment(){

    //Student
    //ViewHolder
    //Adapter

    var rootView: View? = null

    var students: ArrayList<Student> = ArrayList()

    var recyclerViewStudents: RecyclerView? = null

    var studentsAdapter: StudentsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView= LayoutInflater.from(context).inflate(
            R.layout.fragment_students,
                container,
                false)

        initializeViews()
        initializeData()
        initializeLayoutManager()
        initializeAdapter()

        return rootView
    }

    fun initializeViews(){
        recyclerViewStudents = rootView?.findViewById(R.id.recyclerview_fragment_students)
    }

    fun initializeLayoutManager(){
        recyclerViewStudents?.layoutManager = LinearLayoutManager(context)
    }

    fun initializeAdapter(){
        studentsAdapter = StudentsAdapter(context, students)
        recyclerViewStudents?.adapter = studentsAdapter
    }

    fun initializeData(){
        students.add(Student("Vasya", "Good Student"))
        students.add(Student("John", "Bad Student"))
        students.add(Student("Log", "Average Student"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }
}