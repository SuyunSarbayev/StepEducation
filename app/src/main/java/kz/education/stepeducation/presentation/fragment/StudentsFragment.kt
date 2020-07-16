package kz.education.stepeducation.presentation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import kz.education.stepeducation.presentation.adapter.StudentsAdapter
import kz.education.stepeducation.domain.Student

import kotlinx.android.synthetic.main.fragment_students.*
import kz.education.stepeducation.data.Currency
import kz.education.stepeducation.data.api.ApiConnection
import kz.education.stepeducation.di.component.DaggerUseCaseComponent
import kz.education.stepeducation.di.module.UseCaseModule
import kz.education.stepeducation.domain.StudentsSortUseCase
import kz.education.stepeducation.presentation.base.BaseFragment
import kz.education.stepeducation.presentation.contract.StudentsFragmentContract
import kz.education.stepeducation.presentation.presenters.StudentsFragmentPresenter
import javax.inject.Inject
import retrofit2.Call
import retrofit2.Response
import kotlin.collections.ArrayList

class StudentsFragment :
    BaseFragment(),
    StudentsFragmentContract.View,
    View.OnClickListener{
    override fun initializeLayout(): Int {
        return kz.education.stepeducation.R.layout.fragment_students
    }

    //Student
    //ViewHolder
    //Adapter

    // Interface
    // View
    // Presenter
    // Model

    @Inject lateinit var studentsSortUseCase: StudentsSortUseCase

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

        DaggerUseCaseComponent
            .builder()
            .useCaseModule(UseCaseModule())
            .build()
            .inject(this)

        studentsSortUseCase.initiateSortStudentsByName(ArrayList())


        initializeViews()
        initializePresenter()
        initializeLayoutManager()
        initializeAdapter()

        presenter.initiateRequestCurrencies()
        presenter.initializeData()
    }

    override fun initializePresenter() {
        presenter = StudentsFragmentPresenter()
        presenter.attach(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            kz.education.stepeducation.R.id.button_fragment_students_action -> {
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