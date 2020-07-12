package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class etc extends AppCompatActivity {

    private Spinner etc_credit1, etc_credit2, etc_credit3, etc_credit4, etc_credit5, etc_credit6, etc_credit7, etc_credit8, etc_credit9, etc_credit10;
    private Spinner etc_grade1, etc_grade2, etc_grade3, etc_grade4, etc_grade5, etc_grade6, etc_grade7, etc_grade8, etc_grade9, etc_grade10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc);

        etc_credit1 = (Spinner)findViewById(R.id.etc_credit1);
        etc_credit2 = (Spinner)findViewById(R.id.etc_credit2);
        etc_credit3 = (Spinner)findViewById(R.id.etc_credit3);
        etc_credit4 = (Spinner)findViewById(R.id.etc_credit4);
        etc_credit5 = (Spinner)findViewById(R.id.etc_credit5);
        etc_credit6 = (Spinner)findViewById(R.id.etc_credit6);
        etc_credit7 = (Spinner)findViewById(R.id.etc_credit7);
        etc_credit8 = (Spinner)findViewById(R.id.etc_credit8);
        etc_credit9 = (Spinner)findViewById(R.id.etc_credit9);
        etc_credit10 = (Spinner)findViewById(R.id.etc_credit10);

        etc_grade1 = (Spinner)findViewById(R.id.etc_grade1);
        etc_grade2 = (Spinner)findViewById(R.id.etc_grade2);
        etc_grade3 = (Spinner)findViewById(R.id.etc_grade3);
        etc_grade4 = (Spinner)findViewById(R.id.etc_grade4);
        etc_grade5 = (Spinner)findViewById(R.id.etc_grade5);
        etc_grade6 = (Spinner)findViewById(R.id.etc_grade6);
        etc_grade7 = (Spinner)findViewById(R.id.etc_grade7);
        etc_grade8 = (Spinner)findViewById(R.id.etc_grade8);
        etc_grade9 = (Spinner)findViewById(R.id.etc_grade9);
        etc_grade10 = (Spinner)findViewById(R.id.etc_grade10);





    }
}
