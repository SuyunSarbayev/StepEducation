package kz.education.stepeducation.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.education.stepeducation.R

import kotlinx.android.synthetic.main.fragment_viewpager.*
import kz.education.stepeducation.data.Student
import kz.education.stepeducation.presentation.adapter.ViewPagerStudentsAdapter

class ViewPagerFragment : Fragment() {

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