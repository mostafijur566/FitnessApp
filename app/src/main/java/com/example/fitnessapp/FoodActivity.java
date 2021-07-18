package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends AppCompatActivity {

    private ListView listView;

    private String[] Items, details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        getSupportActionBar().setTitle("Nutrition or Tips");

        listView = (ListView)findViewById(R.id.listView);

        Items = getResources().getStringArray(R.array.title_story);
        details = getResources().getStringArray(R.array.details_story);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample_view, R.id.textViewID, Items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(FoodActivity.this, DetailsActivity.class);
                    intent.putExtra("tag", details[position]);
                    intent.putExtra("title", Items[position]);
                    startActivity(intent);
            }
        });
    }
}