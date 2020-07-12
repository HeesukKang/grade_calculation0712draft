package com.example.talingpractice1.grade_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt11, bt12, bt21, bt22, bt31, bt32, bt41, bt42, bt_etc;
    private Intent intent;
    TextView a2;
    double oneonetKgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        double oneonetKgs = intent.getDoubleExtra("oneonetKgs", 0);
        a2 = (TextView)findViewById(R.id.a2);

        a2.setText(Double.toString(oneonetKgs));

        bt11 = findViewById(R.id.bt11);
        bt12 = findViewById(R.id.bt12);
        bt21 = findViewById(R.id.bt21);
        bt22 = findViewById(R.id.bt22);
        bt31 = findViewById(R.id.bt31);
        bt32 = findViewById(R.id.bt32);
        bt41 = findViewById(R.id.bt41);
        bt42 = findViewById(R.id.bt42);
        bt_etc = findViewById(R.id.bt_etc);

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(MainActivity.this, oneone.class);
                startActivity(intent11);
            }
        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(MainActivity.this, onetwo.class);
                startActivity(intent12);
            }
        });

        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(MainActivity.this, twoone.class);
                startActivity(intent21);
            }
        });

        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = new Intent(MainActivity.this, twotwo.class);
                startActivity(intent22);
            }
        });

        bt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31 = new Intent(MainActivity.this, threeone.class);
                startActivity(intent31);
            }
        });

        bt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent32 = new Intent(MainActivity.this, threetwo.class);
                startActivity(intent32);
            }
        });

        bt41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent41 = new Intent(MainActivity.this, fourone.class);
                startActivity(intent41);
            }
        });

        bt42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent42 = new Intent(MainActivity.this, fourtwo.class);
                startActivity(intent42);
            }
        });

        bt_etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_etc = new Intent(MainActivity.this, etc.class);
                startActivity(intent_etc);
            }
        });
    }
}