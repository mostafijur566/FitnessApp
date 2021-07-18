package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ageEighteen_SeventyFive extends AppCompatActivity {

    private LinearLayout exercise8, exercise9, exercise10, exercise11, exercise12, exercise13, exercise14, exercise15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_eighteen_seventy_five);
        getSupportActionBar().setTitle("Age 18-75");

        exercise8 = (LinearLayout)findViewById(R.id.exercise8);
        exercise9 = (LinearLayout)findViewById(R.id.exercise9);
        exercise10 = (LinearLayout)findViewById(R.id.exercise10);
        exercise11 = (LinearLayout)findViewById(R.id.exercise11);
        exercise12 = (LinearLayout)findViewById(R.id.exercise12);
        exercise13 = (LinearLayout)findViewById(R.id.exercise13);
        exercise14 = (LinearLayout)findViewById(R.id.exercise14);
        exercise15 = (LinearLayout)findViewById(R.id.exercise15);

        exercise8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise8");
                startActivity(intent);
            }
        });

        exercise9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise9");
                startActivity(intent);
            }
        });

        exercise10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise10");
                startActivity(intent);
            }
        });

        exercise11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise11");
                startActivity(intent);
            }
        });

        exercise12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise12");
                startActivity(intent);
            }
        });

        exercise13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise13");
                startActivity(intent);
            }
        });

        exercise14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise14");
                startActivity(intent);
            }
        });

        exercise15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ageEighteen_SeventyFive.this, WorkoutActivity.class);
                intent.putExtra("tag", "exercise15");
                startActivity(intent);
            }
        });
    }
}