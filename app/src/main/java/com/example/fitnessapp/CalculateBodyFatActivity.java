package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateBodyFatActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderButton;

    private Button calculate;

    private EditText weightTxt, waistTxt, wristTxt, hipsTxt, forearmTxt;

    private TextView resultTxt;

    private double factor1, factor2, factor3, factor4, factor5, LeanBodyMass, BodyFatWeight, BodyFatPercentage;
    private double weight, waist, wrist, hips, forearm;

    private String result, value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_body_fat);

        getSupportActionBar().setTitle("Calculate Body Fat");

        radioGroup = (RadioGroup)findViewById(R.id.radioGrp);
        calculate = (Button)findViewById(R.id.calculate);

        weightTxt = (EditText)findViewById(R.id.weight);
        waistTxt = (EditText)findViewById(R.id.waist);
        wristTxt = (EditText)findViewById(R.id.wrist);
        hipsTxt = (EditText)findViewById(R.id.hips);
        forearmTxt = (EditText)findViewById(R.id.forearm);

        resultTxt = (TextView)findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int selectID = radioGroup.getCheckedRadioButtonId();
                    genderButton = (RadioButton) findViewById(selectID);

                    value = genderButton.getText().toString();

                    if(value.equals("Male"))
                    {
                        weight = Double.parseDouble(weightTxt.getText().toString());
                        waist = Double.parseDouble(waistTxt.getText().toString());
                        factor1 = (weight * 1.082) + 94.42;
                        factor2 = waist * 4.15;
                        LeanBodyMass = factor1 - factor2;
                        BodyFatWeight = weight - LeanBodyMass;
                        BodyFatPercentage = (BodyFatWeight * 100) / weight;

                        resultTxt.setText(String.format("You have a body fat percentage of %.2f", BodyFatPercentage));
                    }

                    else if(value.equals("Female")) {
                        weight = Double.parseDouble(weightTxt.getText().toString());
                        wrist = Double.parseDouble(wristTxt.getText().toString());
                        waist = Double.parseDouble(waistTxt.getText().toString());
                        hips = Double.parseDouble(hipsTxt.getText().toString());
                        forearm = Double.parseDouble(forearmTxt.getText().toString());

                        factor1 = (weight * 0.732) + 8.987;
                        factor2 = wrist / 3.140;
                        factor3 = waist * 0.157;
                        factor4 = hips * 0.249;
                        factor5 = forearm * 0.434;
                        LeanBodyMass = factor1 + factor2 - factor3 - factor4 + factor5;
                        BodyFatWeight = weight - LeanBodyMass;
                        BodyFatPercentage = (BodyFatWeight * 100) / weight;

                        result = String.format("You have a body fat percentage of %.2f", BodyFatPercentage);
                        resultTxt.setText(result);
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(CalculateBodyFatActivity.this, "You didn't select gender or above filed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}