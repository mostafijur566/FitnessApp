package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView detailsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsTxt = (TextView)findViewById(R.id.detailsTxt);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            String value = bundle.getString("tag");
            getSupportActionBar().setTitle(bundle.getString("title"));
            detailsTxt.setText(value);
        }
    }
}