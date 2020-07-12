package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class fourone extends AppCompatActivity {

    private Spinner fouronecredit1, fouronecredit2, fouronecredit3, fouronecredit4, fouronecredit5, fouronecredit6, fouronecredit7, fouronecredit8, fouronecredit9, fouronecredit10;
    private Spinner fouronegrade1, fouronegrade2, fouronegrade3, fouronegrade4, fouronegrade5, fouronegrade6, fouronegrade7, fouronegrade8, fouronegrade9, fouronegrade10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourone);

        fouronecredit1 = (Spinner)findViewById(R.id.fouronecredit1);
        fouronecredit2 = (Spinner)findViewById(R.id.fouronecredit2);
        fouronecredit3 = (Spinner)findViewById(R.id.fouronecredit3);
        fouronecredit4 = (Spinner)findViewById(R.id.fouronecredit4);
        fouronecredit5 = (Spinner)findViewById(R.id.fouronecredit5);
        fouronecredit6 = (Spinner)findViewById(R.id.fouronecredit6);
        fouronecredit7 = (Spinner)findViewById(R.id.fouronecredit7);
        fouronecredit8 = (Spinner)findViewById(R.id.fouronecredit8);
        fouronecredit9 = (Spinner)findViewById(R.id.fouronecredit9);
        fouronecredit10 = (Spinner)findViewById(R.id.fouronecredit10);

        fouronegrade1 = (Spinner)findViewById(R.id.fouronegrade1);
        fouronegrade2 = (Spinner)findViewById(R.id.fouronegrade2);
        fouronegrade3 = (Spinner)findViewById(R.id.fouronegrade3);
        fouronegrade4 = (Spinner)findViewById(R.id.fouronegrade4);
        fouronegrade5 = (Spinner)findViewById(R.id.fouronegrade5);
        fouronegrade6 = (Spinner)findViewById(R.id.fouronegrade6);
        fouronegrade7 = (Spinner)findViewById(R.id.fouronegrade7);
        fouronegrade8 = (Spinner)findViewById(R.id.fouronegrade8);
        fouronegrade9 = (Spinner)findViewById(R.id.fouronegrade9);
        fouronegrade10 = (Spinner)findViewById(R.id.fouronegrade10);





    }
}
