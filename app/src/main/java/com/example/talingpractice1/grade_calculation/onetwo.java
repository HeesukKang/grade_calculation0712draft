package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class onetwo extends AppCompatActivity {

    private Spinner onetwocredit1, onetwocredit2, onetwocredit3, onetwocredit4, onetwocredit5, onetwocredit6, onetwocredit7, onetwocredit8, onetwocredit9, onetwocredit10;
    private Spinner onetwograde1, onetwograde2, onetwograde3, onetwograde4, onetwograde5, onetwograde6, onetwograde7, onetwograde8, onetwograde9, onetwograde10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetwo);

        onetwocredit1 = (Spinner)findViewById(R.id.onetwocredit1);
        onetwocredit2 = (Spinner)findViewById(R.id.onetwocredit2);
        onetwocredit3 = (Spinner)findViewById(R.id.onetwocredit3);
        onetwocredit4 = (Spinner)findViewById(R.id.onetwocredit4);
        onetwocredit5 = (Spinner)findViewById(R.id.onetwocredit5);
        onetwocredit6 = (Spinner)findViewById(R.id.onetwocredit6);
        onetwocredit7 = (Spinner)findViewById(R.id.onetwocredit7);
        onetwocredit8 = (Spinner)findViewById(R.id.onetwocredit8);
        onetwocredit9 = (Spinner)findViewById(R.id.onetwocredit9);
        onetwocredit10 = (Spinner)findViewById(R.id.onetwocredit10);

        onetwograde1 = (Spinner)findViewById(R.id.onetwograde1);
        onetwograde2 = (Spinner)findViewById(R.id.onetwograde2);
        onetwograde3 = (Spinner)findViewById(R.id.onetwograde3);
        onetwograde4 = (Spinner)findViewById(R.id.onetwograde4);
        onetwograde5 = (Spinner)findViewById(R.id.onetwograde5);
        onetwograde6 = (Spinner)findViewById(R.id.onetwograde6);
        onetwograde7 = (Spinner)findViewById(R.id.onetwograde7);
        onetwograde8 = (Spinner)findViewById(R.id.onetwograde8);
        onetwograde9 = (Spinner)findViewById(R.id.onetwograde9);
        onetwograde10 = (Spinner)findViewById(R.id.onetwograde10);





    }
}
