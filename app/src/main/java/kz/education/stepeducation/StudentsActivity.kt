package kz.education.stepeducation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class StudentsActivity : AppCompatActivity(){

    lateinit var fragmentManager: FragmentManager

    var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)

        initializeFragmentManager()
        initializeDefaultFragment()
    }

    fun initializeFragmentManager() {
        fragmentManager = supportFragmentManager
    }

    fun initializeDefaultFragment(){
        if(currentFragment == null){
            currentFragment = StudentsFragment()

            fragmentManager.beginTransaction()
                .add(R.id.relativelayout_activity_students_fragment_container, currentFragment!!)
                .commit()
        }
    }
}