package kz.education.stepeducation.presentation.fragment

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.room.Room
import kz.education.stepeducation.R

import kotlinx.android.synthetic.main.fragment_viewpager.*
import kz.education.stepeducation.data.StepEducationDatabase
import kz.education.stepeducation.domain.Student
import kz.education.stepeducation.presentation.adapter.ViewPagerStudentsAdapter
import kz.education.stepeducation.presentation.dialog.DialogHello
import kotlin.collections.ArrayList

class ViewPagerFragment : Fragment(), DatePickerDialog.OnDateSetListener {
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var rootView: View? = null

    var students: ArrayList<Student> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = LayoutInflater.from(context).inflate(R.layout.fragment_viewpager, container, false)

        var dialogHello = DialogHello()
        dialogHello.show(activity!!.supportFragmentManager, dialogHello.javaClass.name)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeStudentsData()
        initializeViewPagerAdapter()

        var stepEducationDatabase = Room.databaseBuilder(
            context!!,
            StepEducationDatabase::class.java,
            "StepEducationDatabase")
            .allowMainThreadQueries()
            .build()
//        stepEducationDatabase.getStudentDao().initiateInsertStudent(kz.education.stepeducation.data.Student().apply {
//            name = "John"
//        })
//        stepEducationDatabase.getStudentDao().initiateInsertStudent(kz.education.stepeducation.data.Student().apply {
//            name = "Martin"
//        })
//        stepEducationDatabase.getStudentDao().initiateInsertStudent(kz.education.stepeducation.data.Student().apply {
//            name = "Von"
//        })
        var list = stepEducationDatabase.getStudentDao().initiateGetStudents()
        System.out.println("STUDENTS " + list.toString())
    }

    fun initializeStudentsData(){
        students.add(Student())
        students.add(Student())
        students.add(Student())
    }

    fun initializeViewPagerAdapter(){
        viewpager_fragment_viewpager?.adapter =
            ViewPagerStudentsAdapter(activity?.supportFragmentManager!!, students)

    }
}