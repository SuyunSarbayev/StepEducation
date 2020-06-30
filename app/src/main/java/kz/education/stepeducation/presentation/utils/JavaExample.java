package kz.education.stepeducation.presentation.utils;

import android.util.Log;

public class JavaExample {
    public static void main(String[] args) {

    }

    public void initiateExperiment(){
        Log.d("CALLED", "HERE");
        String playVariable = null;
        new KotlinExample().initiateExperiment(playVariable);
    }
}
