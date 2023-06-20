package com.example.redirigirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);

        final Button buttonConstrainNext = findViewById(R.id.btn01);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityLinear();
            }
        });

    }

    private void openActivityLinear() {
        Intent intent = new Intent(this, Constraint2Linear.class);
        startActivity(intent);
    }
}