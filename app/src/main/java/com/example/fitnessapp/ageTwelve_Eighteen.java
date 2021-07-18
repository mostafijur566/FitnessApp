package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

public class ageTwelve_Eighteen extends AppCompatActivity {

    private LinearLayout exercise1, exercise2, exercise3, exercise4, exercise5, exercise6, exercise7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_twelve_eighteen);

        getSupportActionBar().setTitle("Age 12-18");

        exercise1 = (LinearLayout) findViewById(R.id.exercise1);
        exercise2 = (LinearLayout) findViewById(R.id.exercise2);
        exercise3 = (LinearLayout) findViewById(R.id.exercise3);
        exercise4 = (LinearLayout) findViewById(R.id.exercise4);
        exercise5 = (LinearLayout) findViewById(R.id.exercise5);
        exercise6 = (LinearLayout) findViewById(R.id.exercise6);
        exercise7 = (LinearLayout) findViewById(R.id.exercise7);

        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                startActivity(intent);
            }
        });

        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise2");
                startActivity(intent);
            }
        });

        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise3");
                startActivity(intent);
            }
        });

        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise4");
                startActivity(intent);
            }
        });

        exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise5");
                startActivity(intent);
            }
        });

        exercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise6");
                startActivity(intent);
            }
        });

        exercise7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageTwelve_Eighteen.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise7");
                startActivity(intent);
            }
        });
    }
}