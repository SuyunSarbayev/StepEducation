package kz.education.stepeducation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kz.education.stepeducation.R
import kz.education.stepeducation.fragment.StudentsDetailFragment
import kz.education.stepeducation.fragment.StudentsFragment

class StudentsActivity : AppCompatActivity(){

    var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)

        initializeDefaultFragment()
    }

    fun initializeDefaultFragment(){
        if(currentFragment == null){
            currentFragment = StudentsFragment()
            displayFragment(currentFragment!!)
        }
    }

    fun displayFragment(fragment: Fragment){

        this.currentFragment = fragment
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        supportFragmentManager.executePendingTransactions()
        fragmentTransaction.add(
            R.id.relativelayout_activity_students_fragment_container,
            fragment!!,
            fragment?.javaClass?.name ?: "")

        fragmentTransaction.addToBackStack("Name")
        fragmentTransaction.commit()

    }
}