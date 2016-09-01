package com.jacksonmix.android.aca.daycounterfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jacksonmix.android.aca.daycounterfinal.utils.DayCounter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DayCounter mDayCounter = new DayCounter();

        int yearIn = 2016;

        int monthIn = 1;

       /* System.out.println(monthIn + "/" + yearIn + "has "
               + countDays(monthIn, yearIn) + " days."); */

        for (int month = 1; month < 13; month++) {
            for (int days = 1; days <= mDayCounter.countDays(month, yearIn); days++) {

                System.out.println(month + "/" + days + "/" + yearIn);
            }

        }

    }


}
