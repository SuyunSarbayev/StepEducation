package kz.education.stepeducation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var buttonAction: Button? = null
    var textviewStatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE", "onCreate")
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    override fun onStart() {
        Log.d("LIFE", "onStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.d("LIFE", "onRestart")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("LIFE", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LIFE", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("LIFE", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("LIFE", "onDestroy")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("LIFE", "onSaveInstanceState")
        outState.putString("MESSAGE", "DATA")
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outState.putString("MESSAGE", "DATA")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d("LIFE", "onRestoreInstanceState")
        Log.d("MESSAGE", savedInstanceState.getString("MESSAGE") ?: "")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?) {
        Log.d("LIFE", "persistent onRestoreInstanceState")
        Log.d("MESSAGE", savedInstanceState?.getString("MESSAGE") ?: "")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }


    fun initializeViews(){
        buttonAction = findViewById(R.id.button_activity_main_update_status)
        textviewStatus = findViewById(R.id.textview_activity_main_status)
    }

    fun initializeListeners(){
        buttonAction!!.setOnClickListener(View.OnClickListener {
            initiateStudentsActivityTransition()
//            textviewStatus!!.setText(getString(R.string.acitvity_main_textview_status_pressed))
//            textviewStatus!!.setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
        })
    }

    fun initiateStudentsActivityTransition(){
        startActivity(Intent(this, StudentsActivity::class.java))
    }
}
