package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class fourtwo extends AppCompatActivity {

    private Spinner fourtwocredit1, fourtwocredit2, fourtwocredit3, fourtwocredit4, fourtwocredit5, fourtwocredit6, fourtwocredit7, fourtwocredit8, fourtwocredit9, fourtwocredit10;
    private Spinner fourtwograde1, fourtwograde2, fourtwograde3, fourtwograde4, fourtwograde5, fourtwograde6, fourtwograde7, fourtwograde8, fourtwograde9, fourtwograde10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourtwo);

        fourtwocredit1 = (Spinner)findViewById(R.id.fourtwocredit1);
        fourtwocredit2 = (Spinner)findViewById(R.id.fourtwocredit2);
        fourtwocredit3 = (Spinner)findViewById(R.id.fourtwocredit3);
        fourtwocredit4 = (Spinner)findViewById(R.id.fourtwocredit4);
        fourtwocredit5 = (Spinner)findViewById(R.id.fourtwocredit5);
        fourtwocredit6 = (Spinner)findViewById(R.id.fourtwocredit6);
        fourtwocredit7 = (Spinner)findViewById(R.id.fourtwocredit7);
        fourtwocredit8 = (Spinner)findViewById(R.id.fourtwocredit8);
        fourtwocredit9 = (Spinner)findViewById(R.id.fourtwocredit9);
        fourtwocredit10 = (Spinner)findViewById(R.id.fourtwocredit10);

        fourtwograde1 = (Spinner)findViewById(R.id.fourtwograde1);
        fourtwograde2 = (Spinner)findViewById(R.id.fourtwograde2);
        fourtwograde3 = (Spinner)findViewById(R.id.fourtwograde3);
        fourtwograde4 = (Spinner)findViewById(R.id.fourtwograde4);
        fourtwograde5 = (Spinner)findViewById(R.id.fourtwograde5);
        fourtwograde6 = (Spinner)findViewById(R.id.fourtwograde6);
        fourtwograde7 = (Spinner)findViewById(R.id.fourtwograde7);
        fourtwograde8 = (Spinner)findViewById(R.id.fourtwograde8);
        fourtwograde9 = (Spinner)findViewById(R.id.fourtwograde9);
        fourtwograde10 = (Spinner)findViewById(R.id.fourtwograde10);





    }
}
