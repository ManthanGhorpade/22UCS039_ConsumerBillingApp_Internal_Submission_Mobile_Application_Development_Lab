package com.example.consumerbillingapp;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView show1, show2, show3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        show1 = findViewById(R.id.show1);
        show2 = findViewById(R.id.show2);
        show3 = findViewById(R.id.show3);

        DatabaseHelper db = new DatabaseHelper(this);
        Cursor c = db.getData();

        if (c.moveToFirst()) {
            show1.setText("Consumer Number: " + c.getString(0));
            show2.setText("First Name: " + c.getString(1));
            show3.setText("Password: " + c.getString(2));
        }
    }
}