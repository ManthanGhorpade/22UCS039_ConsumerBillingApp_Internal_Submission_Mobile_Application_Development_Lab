package com.example.consumerbillingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView welcome;
    EditText units, rate;
    Button calc;
    String cno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcome = findViewById(R.id.welcomeTxt);
        units = findViewById(R.id.units);
        rate = findViewById(R.id.rate);
        calc = findViewById(R.id.calcBtn);

        Intent i = getIntent();
        cno = i.getStringExtra("consumerNo");
        String fname = i.getStringExtra("firstName");

        welcome.setText("Welcome " + fname);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int u = Integer.parseInt(units.getText().toString());
                int r = Integer.parseInt(rate.getText().toString());
                int total = u * r;

                Intent in = new Intent(SecondActivity.this, ThirdActivity.class);
                in.putExtra("consumerNo", cno);
                in.putExtra("totalCost", String.valueOf(total));
                startActivity(in);
            }
        });
    }
}