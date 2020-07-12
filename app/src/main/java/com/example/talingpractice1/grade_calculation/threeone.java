package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class threeone extends AppCompatActivity {

    private Spinner threeonecredit1, threeonecredit2, threeonecredit3, threeonecredit4, threeonecredit5, threeonecredit6, threeonecredit7, threeonecredit8, threeonecredit9, threeonecredit10;
    private Spinner threeonegrade1, threeonegrade2, threeonegrade3, threeonegrade4, threeonegrade5, threeonegrade6, threeonegrade7, threeonegrade8, threeonegrade9, threeonegrade10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeone);

        threeonecredit1 = (Spinner)findViewById(R.id.threeonecredit1);
        threeonecredit2 = (Spinner)findViewById(R.id.threeonecredit2);
        threeonecredit3 = (Spinner)findViewById(R.id.threeonecredit3);
        threeonecredit4 = (Spinner)findViewById(R.id.threeonecredit4);
        threeonecredit5 = (Spinner)findViewById(R.id.threeonecredit5);
        threeonecredit6 = (Spinner)findViewById(R.id.threeonecredit6);
        threeonecredit7 = (Spinner)findViewById(R.id.threeonecredit7);
        threeonecredit8 = (Spinner)findViewById(R.id.threeonecredit8);
        threeonecredit9 = (Spinner)findViewById(R.id.threeonecredit9);
        threeonecredit10 = (Spinner)findViewById(R.id.threeonecredit10);

        threeonegrade1 = (Spinner)findViewById(R.id.threeonegrade1);
        threeonegrade2 = (Spinner)findViewById(R.id.threeonegrade2);
        threeonegrade3 = (Spinner)findViewById(R.id.threeonegrade3);
        threeonegrade4 = (Spinner)findViewById(R.id.threeonegrade4);
        threeonegrade5 = (Spinner)findViewById(R.id.threeonegrade5);
        threeonegrade6 = (Spinner)findViewById(R.id.threeonegrade6);
        threeonegrade7 = (Spinner)findViewById(R.id.threeonegrade7);
        threeonegrade8 = (Spinner)findViewById(R.id.threeonegrade8);
        threeonegrade9 = (Spinner)findViewById(R.id.threeonegrade9);
        threeonegrade10 = (Spinner)findViewById(R.id.threeonegrade10);





    }
}
