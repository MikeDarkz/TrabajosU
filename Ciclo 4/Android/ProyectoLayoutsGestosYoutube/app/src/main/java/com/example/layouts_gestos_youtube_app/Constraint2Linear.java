package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Constraint2Linear extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_linear);

        final Button buttonLinearNext = findViewById(R.id.btn03);
        buttonLinearNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityFrame();
            }
        });

        final Button buttonLinearPrev = findViewById(R.id.btn02);
        buttonLinearPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityConstraint();
            }
        });

    }

    private void openActivityConstraint() {
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }

    private void openActivityFrame() {
        Intent intent = new Intent(this, Linear2Frame.class);
        startActivity(intent);
    }
}
