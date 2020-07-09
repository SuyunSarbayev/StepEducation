package kz.education.stepeducation.presentation.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kz.education.stepeducation.R
import kz.education.stepeducation.presentation.adapter.StudentsAdapter
import kz.education.stepeducation.data.Student

import kotlinx.android.synthetic.main.fragment_students.*
import kz.education.stepeducation.presentation.base.BaseFragment
import kz.education.stepeducation.presentation.contract.StudentsFragmentContract
import kz.education.stepeducation.presentation.presenters.StudentsFragmentPresenter

class StudentsFragment :
    BaseFragment(),
    StudentsFragmentContract.View,
    View.OnClickListener{
    override fun initializeLayout(): Int {
        return R.layout.fragment_students
    }

    //Student
    //ViewHolder
    //Adapter

    // Interface
    // View
    // Presenter
    // Model

    var students: ArrayList<Student> = ArrayList() // Контейнер с деталями

    var studentsAdapter: StudentsAdapter? = null // Рабочий на конвеере

    lateinit var presenter: StudentsFragmentPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeViews()
        initializePresenter()
        initializeLayoutManager()
        initializeAdapter()
        presenter.initializeData()
    }

    override fun initializePresenter() {
        presenter = StudentsFragmentPresenter()
        presenter.attach(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_fragment_students_action -> {
                presenter.initiateSortStudentsByName()
                Log.d("CALLED", "INVOKED")
            }
        }
    }

    override fun initializeViews(){
        recyclerview_fragment_students?.visibility = View.VISIBLE
    }

    override fun initializeLayoutManager(){
        recyclerview_fragment_students?.layoutManager = LinearLayoutManager(context)
    }

    override fun initializeAdapter(){
        studentsAdapter = StudentsAdapter(context, students)
        recyclerview_fragment_students?.adapter = studentsAdapter
    }

    override fun processData(students: ArrayList<Student>) {
        this.students.clear()
        this.students.addAll(students)
    }

    override fun initiateUpdateAdapter() {
        studentsAdapter?.notifyDataSetChanged()
    }

    override fun initializeListeners() {
        button_fragment_students_action?.setOnClickListener(this)
    }

    override fun initializeArguments() {
        Log.d("ARGUMENT DATA: ", arguments?.getString("DATA") ?: "EMPTY DATA")
    }

    override fun initializeDependencies() {}
}