package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class WorkoutActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 60000; //1 min
    private boolean timerRunning;

    private Button start;
    private TextView timer, txtDetails;

    private String workoutName;
    private GifImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().hide();

        start = (Button)findViewById(R.id.start);
        timer = findViewById(R.id.timer);
        img = (GifImageView) findViewById(R.id.img);
        txtDetails = (TextView)findViewById(R.id.details);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            workoutName = bundle.getString("tag");

            if(workoutName.equals("exercise2"))
            {
                img.setImageResource(R.drawable.exersice_2);
                txtDetails.setText(getResources().getString(R.string.pose2));
            }

            else if(workoutName.equals("exercise3"))
            {
                img.setImageResource(R.drawable.exersice_3);
                txtDetails.setText(getResources().getString(R.string.pose3));
            }

            else if(workoutName.equals("exercise4"))
            {
                img.setImageResource(R.drawable.exersice_4);
                txtDetails.setText(getResources().getString(R.string.pose4));
            }

            else if(workoutName.equals("exercise5"))
            {
                img.setImageResource(R.drawable.exersice_5);
                txtDetails.setText(getResources().getString(R.string.pose5));
            }

            else if(workoutName.equals("exercise6"))
            {
                img.setImageResource(R.drawable.exersice_6);
                txtDetails.setText(getResources().getString(R.string.pose6));
            }

            else if(workoutName.equals("exercise7"))
            {
                img.setImageResource(R.drawable.exersice_7);
                txtDetails.setText(getResources().getString(R.string.pose7));
            }

            else if(workoutName.equals("exercise8"))
            {
                img.setImageResource(R.drawable.exersice_8);
                txtDetails.setText(getResources().getString(R.string.pose8));
            }

            else if(workoutName.equals("exercise9"))
            {
                img.setImageResource(R.drawable.exersice_9);
                txtDetails.setText(getResources().getString(R.string.pose9));
            }

            else if(workoutName.equals("exercise10"))
            {
                img.setImageResource(R.drawable.exersice_10);
                txtDetails.setText(getResources().getString(R.string.pose10));
            }

            else if(workoutName.equals("exercise11"))
            {
                img.setImageResource(R.drawable.exersice_11);
                txtDetails.setText(getResources().getString(R.string.pose11));
            }

            else if(workoutName.equals("exercise12"))
            {
                img.setImageResource(R.drawable.exersice_12);
                txtDetails.setText(getResources().getString(R.string.pose12));
            }

            else if(workoutName.equals("exercise13"))
            {
                img.setImageResource(R.drawable.exersice_13);
                txtDetails.setText(getResources().getString(R.string.pose13));
            }

            else if(workoutName.equals("exercise14"))
            {
                img.setImageResource(R.drawable.exersice_14);
                txtDetails.setText(getResources().getString(R.string.pose14));
            }

            else if(workoutName.equals("exercise15"))
            {
                img.setImageResource(R.drawable.exersice_15);
                txtDetails.setText(getResources().getString(R.string.pose15));
            }
        }


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop();
            }
        });
    }

    private void startStop()
    {
        if(timerRunning)
        {
            stopTimer();
        }

        else {
            startTimer();
        }
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMilliseconds = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();

        start.setText("PAUSE");

        timerRunning = true;
    }

    private void stopTimer() {
        countDownTimer.cancel();
        start.setText("START");
        timerRunning = false;
    }

    private void updateTimer()
    {
        int minutes = (int)timeLeftInMilliseconds / 60000;
        int seconds = (int)timeLeftInMilliseconds % 60000 / 1000;

        String timeleftText;

        timeleftText = "" + minutes;
        timeleftText += ":";
        if(seconds < 10)
            timeleftText += "0";
        timeleftText += seconds;

        timer.setText(timeleftText);
    }

}