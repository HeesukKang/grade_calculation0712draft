package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class oneone extends AppCompatActivity {

    Spinner oneonecredit1, oneonecredit2, oneonecredit3, oneonecredit4, oneonecredit5, oneonecredit6, oneonecredit7, oneonecredit8, oneonecredit9, oneonecredit10;
    Spinner oneonegrade1, oneonegrade2, oneonegrade3, oneonegrade4, oneonegrade5, oneonegrade6, oneonegrade7, oneonegrade8, oneonegrade9, oneonegrade10;
    CheckBox oneonecheck1, oneonecheck2, oneonecheck3, oneonecheck4, oneonecheck5, oneonecheck6, oneonecheck7, oneonecheck8, oneonecheck9, oneonecheck10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneone);

        oneonecredit1 = (Spinner)findViewById(R.id.oneonecredit1);
        oneonecredit2 = (Spinner)findViewById(R.id.oneonecredit2);
        oneonecredit3 = (Spinner)findViewById(R.id.oneonecredit3);
        oneonecredit4 = (Spinner)findViewById(R.id.oneonecredit4);
        oneonecredit5 = (Spinner)findViewById(R.id.oneonecredit5);
        oneonecredit6 = (Spinner)findViewById(R.id.oneonecredit6);
        oneonecredit7 = (Spinner)findViewById(R.id.oneonecredit7);
        oneonecredit8 = (Spinner)findViewById(R.id.oneonecredit8);
        oneonecredit9 = (Spinner)findViewById(R.id.oneonecredit9);
        oneonecredit10 = (Spinner)findViewById(R.id.oneonecredit10);

        ArrayAdapter Adapter1 = ArrayAdapter.createFromResource(this, R.array.credit, android.R.layout.simple_spinner_item);
        oneonecredit1.setAdapter(Adapter1);
        oneonecredit2.setAdapter(Adapter1);
        oneonecredit3.setAdapter(Adapter1);
        oneonecredit4.setAdapter(Adapter1);
        oneonecredit5.setAdapter(Adapter1);
        oneonecredit6.setAdapter(Adapter1);
        oneonecredit7.setAdapter(Adapter1);
        oneonecredit8.setAdapter(Adapter1);
        oneonecredit9.setAdapter(Adapter1);
        oneonecredit10.setAdapter(Adapter1);

        oneonegrade1 = (Spinner)findViewById(R.id.oneonegrade1);
        oneonegrade2 = (Spinner)findViewById(R.id.oneonegrade2);
        oneonegrade3 = (Spinner)findViewById(R.id.oneonegrade3);
        oneonegrade4 = (Spinner)findViewById(R.id.oneonegrade4);
        oneonegrade5 = (Spinner)findViewById(R.id.oneonegrade5);
        oneonegrade6 = (Spinner)findViewById(R.id.oneonegrade6);
        oneonegrade7 = (Spinner)findViewById(R.id.oneonegrade7);
        oneonegrade8 = (Spinner)findViewById(R.id.oneonegrade8);
        oneonegrade9 = (Spinner)findViewById(R.id.oneonegrade9);
        oneonegrade10 = (Spinner)findViewById(R.id.oneonegrade10);

        ArrayAdapter Adapter2 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        oneonegrade1.setAdapter(Adapter2);
        oneonegrade2.setAdapter(Adapter2);
        oneonegrade3.setAdapter(Adapter2);
        oneonegrade4.setAdapter(Adapter2);
        oneonegrade5.setAdapter(Adapter2);
        oneonegrade6.setAdapter(Adapter2);
        oneonegrade7.setAdapter(Adapter2);
        oneonegrade8.setAdapter(Adapter2);
        oneonegrade9.setAdapter(Adapter2);
        oneonegrade10.setAdapter(Adapter2);

        oneonecheck1 = findViewById(R.id.oneonecheck1);
        oneonecheck2 = findViewById(R.id.oneonecheck2);
        oneonecheck3 = findViewById(R.id.oneonecheck3);
        oneonecheck4 = findViewById(R.id.oneonecheck4);
        oneonecheck5 = findViewById(R.id.oneonecheck5);
        oneonecheck6 = findViewById(R.id.oneonecheck6);
        oneonecheck7 = findViewById(R.id.oneonecheck7);
        oneonecheck8 = findViewById(R.id.oneonecheck8);
        oneonecheck9 = findViewById(R.id.oneonecheck9);
        oneonecheck10 = findViewById(R.id.oneonecheck10);





    }
}
