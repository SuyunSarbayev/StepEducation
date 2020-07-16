package kz.education.stepeducation.presentation.fragment

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import androidx.room.Room
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
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

        var observable =
            Observable.just("Hello", "This", "is", "Data")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

        var compositeDisposableObserver = CompositeDisposable()

        var observer = observable.subscribeWith(DisposableOwnObserver())

        compositeDisposableObserver.add(observer)

        compositeDisposableObserver.clear()
//        var list = stepEducationDatabase.getStudentDao().initiateGetStudents()
    }

    class DisposableOwnObserver : DisposableObserver<String>(){
        override fun onComplete() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onNext(t: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onError(e: Throwable) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    class StringObserver : Observer<String>{
        override fun onComplete() {
            Log.d("OBSERVER", "onComplete")
        }

        override fun onSubscribe(d: Disposable) {
            Log.d("OBSERVER", "onSubscribe")
        }

        override fun onNext(t: String) {
            Log.d("OBSERVER", "onNext")
        }

        override fun onError(e: Throwable) {
            Log.d("OBSERVER", "onError")
        }
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