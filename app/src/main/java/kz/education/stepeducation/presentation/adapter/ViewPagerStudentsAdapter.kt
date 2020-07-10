package kz.education.stepeducation.presentation.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kz.education.stepeducation.domain.Student
import kz.education.stepeducation.presentation.fragment.StudentsDetailFragment
import kz.education.stepeducation.presentation.utils.Constants

class ViewPagerStudentsAdapter(fragmentManager: FragmentManager,
                               var students: ArrayList<Student>)
    : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return StudentsDetailFragment().apply {
            arguments = Bundle().apply {
                putParcelable(Constants.STUDENT, students.get(position))
            }
        }
    }

    override fun getCount(): Int {
        return students.size
    }
}