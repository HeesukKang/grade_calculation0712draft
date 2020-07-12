package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class twotwo extends AppCompatActivity {

    private Spinner twotwocredit1, twotwocredit2, twotwocredit3, twotwocredit4, twotwocredit5, twotwocredit6, twotwocredit7, twotwocredit8, twotwocredit9, twotwocredit10;
    private Spinner twotwograde1, twotwograde2, twotwograde3, twotwograde4, twotwograde5, twotwograde6, twotwograde7, twotwograde8, twotwograde9, twotwograde10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twotwo);

        twotwocredit1 = (Spinner)findViewById(R.id.twotwocredit1);
        twotwocredit2 = (Spinner)findViewById(R.id.twotwocredit2);
        twotwocredit3 = (Spinner)findViewById(R.id.twotwocredit3);
        twotwocredit4 = (Spinner)findViewById(R.id.twotwocredit4);
        twotwocredit5 = (Spinner)findViewById(R.id.twotwocredit5);
        twotwocredit6 = (Spinner)findViewById(R.id.twotwocredit6);
        twotwocredit7 = (Spinner)findViewById(R.id.twotwocredit7);
        twotwocredit8 = (Spinner)findViewById(R.id.twotwocredit8);
        twotwocredit9 = (Spinner)findViewById(R.id.twotwocredit9);
        twotwocredit10 = (Spinner)findViewById(R.id.twotwocredit10);

        twotwograde1 = (Spinner)findViewById(R.id.twotwograde1);
        twotwograde2 = (Spinner)findViewById(R.id.twotwograde2);
        twotwograde3 = (Spinner)findViewById(R.id.twotwograde3);
        twotwograde4 = (Spinner)findViewById(R.id.twotwograde4);
        twotwograde5 = (Spinner)findViewById(R.id.twotwograde5);
        twotwograde6 = (Spinner)findViewById(R.id.twotwograde6);
        twotwograde7 = (Spinner)findViewById(R.id.twotwograde7);
        twotwograde8 = (Spinner)findViewById(R.id.twotwograde8);
        twotwograde9 = (Spinner)findViewById(R.id.twotwograde9);
        twotwograde10 = (Spinner)findViewById(R.id.twotwograde10);





    }
}
