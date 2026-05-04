package com.example.consumerbillingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText cno, fname, pass;
    Button save;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cno = findViewById(R.id.dbcno);
        fname = findViewById(R.id.dbfname);
        pass = findViewById(R.id.dbpass);
        save = findViewById(R.id.saveBtn);

        db = new DatabaseHelper(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertData(cno.getText().toString(), fname.getText().toString(), pass.getText().toString());
                Intent i = new Intent(RegisterActivity.this, DisplayActivity.class);
                startActivity(i);
            }
        });
    }
}