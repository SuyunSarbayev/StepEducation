package kz.education.stepeducation.presentation.dialog

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

import kotlinx.android.synthetic.main.dialog_hello.*
import kz.education.stepeducation.R

class DialogHello : DialogFragment(), View.OnClickListener{

    override fun onClick(v: View?) {
        Log.d("DIALOG", "hello")
    }

    var currentView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currentView = LayoutInflater.from(context).inflate(R.layout.dialog_hello, container, false)

        return currentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeListeners()
    }

    fun initializeListeners(){
        button_dialog_hello_action.setOnClickListener(this)
    }
}