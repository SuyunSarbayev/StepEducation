package kz.education.stepeducation.presentation.fragment

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import kz.education.stepeducation.R

import kotlinx.android.synthetic.main.fragment_viewpager.*
import kz.education.stepeducation.data.Student
import kz.education.stepeducation.presentation.adapter.ViewPagerStudentsAdapter
import kz.education.stepeducation.presentation.dialog.DialogHello
import java.util.*
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