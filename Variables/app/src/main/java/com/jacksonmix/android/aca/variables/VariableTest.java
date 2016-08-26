package com.jacksonmix.android.aca.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VariableTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_test);


        int distance = 430;
        float batSpeed = 112;
        double pitchSpeed = 98.7;
        char pitchNumber = 5;
        boolean homeRun = true;
        long exitSpeed = 105;
        short batWeight = 32;
        byte batLength = 34;

        System.out.println("distance: " + distance);
        System.out.println("batSpeed: " + batSpeed);
        System.out.println("pitchSpeed: " + pitchSpeed);
        System.out.println("pitchNumber: " + pitchNumber);
        System.out.println("homeRun: " + homeRun);
        System.out.println("exitSpeed: " + exitSpeed);
        System.out.println("batWeight: " + batWeight);
        System.out.println("batLength: " + batLength);









        }


    }
}
