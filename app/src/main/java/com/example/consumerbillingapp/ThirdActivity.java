package com.example.consumerbillingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView resultConsumer, resultCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        resultConsumer = findViewById(R.id.resultConsumer);
        resultCost = findViewById(R.id.resultCost);

        Intent i = getIntent();

        resultConsumer.setText("Consumer Number: " + i.getStringExtra("consumerNo"));
        resultCost.setText("Total Cost: " + i.getStringExtra("totalCost"));
    }
}