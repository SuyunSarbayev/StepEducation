package kz.education.stepeducation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class StudentsActivity : AppCompatActivity(){

    var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)

        initializeDefaultFragment()
        displayFragment(StudentsDetailFragment())
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