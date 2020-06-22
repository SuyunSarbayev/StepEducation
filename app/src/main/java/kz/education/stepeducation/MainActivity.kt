package kz.education.stepeducation

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.os.PersistableBundle
import android.telephony.SmsManager
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    var buttonAction: Button? = null
    var textviewStatus: TextView? = null

    var REQUEST_CODE_ONE = 1
    var REQUEST_CODE_TWO = 2

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE", "onCreate")

//        Intent(kz.package.stepeducation, StudentsActivity.class) ----> ActivityManager ---->
//        Manifest (StudentsActivity) ----> StudentsActivity.class ----> onCreate() ----> new page!

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
        Log.d("LIFE", savedInstanceState.getString("MESSAGE") ?: "")
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
//        textviewStatus = findViewById(R.id.textview_activity_main_status)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initializeListeners(){
        buttonAction!!.setOnClickListener(View.OnClickListener {
//            textviewStatus!!.setText("")
//            if(initiateCheckPermission()){
//                initiateSendSMS("77081170832")
//            }else{
//                initiateRequestPermission()
//            }
            initiateStudentsActivityTransition()
//            textviewStatus!!.setText(getString(R.string.acitvity_main_textview_status_pressed))
//            textviewStatus!!.setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
        })
    }

    fun initiateSendSMS(phone: String){
        var smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phone, null,"sms-message", null,null)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateRequestPermission(){
        requestPermissions(Array<String>(1){android.Manifest.permission.SEND_SMS}, 101)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateCheckPermission() : Boolean{
        return checkSelfPermission(android.Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when(requestCode){
            101 -> {
                if(grantResults.size >= 1){
                    initiateSendSMS("77081170832")
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            REQUEST_CODE_ONE -> {
                when(resultCode){
                    Activity.RESULT_OK -> {
                        Log.d("DATA", data?.getStringExtra("Name"))
                    }
                    Activity.RESULT_CANCELED -> {
                        Log.d("DATA IS BAD", data?.getStringExtra("Name"))
                    }
                }
            }
            REQUEST_CODE_TWO -> {

            }
        }
    }

    fun initiateStudentsActivityTransition(){
        startActivityForResult(Intent(this, StudentsActivity::class.java), REQUEST_CODE_ONE)
    }

    fun initiateStudentsActivityTransitionSecond(){
        startActivityForResult(Intent(this, StudentsActivity::class.java), REQUEST_CODE_TWO)
    }
}
