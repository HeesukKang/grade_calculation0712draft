package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class twoone extends AppCompatActivity {

    private Spinner twoonecredit1, twoonecredit2, twoonecredit3, twoonecredit4, twoonecredit5, twoonecredit6, twoonecredit7, twoonecredit8, twoonecredit9, twoonecredit10;
    private Spinner twoonegrade1, twoonegrade2, twoonegrade3, twoonegrade4, twoonegrade5, twoonegrade6, twoonegrade7, twoonegrade8, twoonegrade9, twoonegrade10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoone);

        twoonecredit1 = (Spinner)findViewById(R.id.twoonecredit1);
        twoonecredit2 = (Spinner)findViewById(R.id.twoonecredit2);
        twoonecredit3 = (Spinner)findViewById(R.id.twoonecredit3);
        twoonecredit4 = (Spinner)findViewById(R.id.twoonecredit4);
        twoonecredit5 = (Spinner)findViewById(R.id.twoonecredit5);
        twoonecredit6 = (Spinner)findViewById(R.id.twoonecredit6);
        twoonecredit7 = (Spinner)findViewById(R.id.twoonecredit7);
        twoonecredit8 = (Spinner)findViewById(R.id.twoonecredit8);
        twoonecredit9 = (Spinner)findViewById(R.id.twoonecredit9);
        twoonecredit10 = (Spinner)findViewById(R.id.twoonecredit10);

        twoonegrade1 = (Spinner)findViewById(R.id.twoonegrade1);
        twoonegrade2 = (Spinner)findViewById(R.id.twoonegrade2);
        twoonegrade3 = (Spinner)findViewById(R.id.twoonegrade3);
        twoonegrade4 = (Spinner)findViewById(R.id.twoonegrade4);
        twoonegrade5 = (Spinner)findViewById(R.id.twoonegrade5);
        twoonegrade6 = (Spinner)findViewById(R.id.twoonegrade6);
        twoonegrade7 = (Spinner)findViewById(R.id.twoonegrade7);
        twoonegrade8 = (Spinner)findViewById(R.id.twoonegrade8);
        twoonegrade9 = (Spinner)findViewById(R.id.twoonegrade9);
        twoonegrade10 = (Spinner)findViewById(R.id.twoonegrade10);





    }
}
