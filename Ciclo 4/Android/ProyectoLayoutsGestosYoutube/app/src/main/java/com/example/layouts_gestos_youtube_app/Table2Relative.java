package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Table2Relative extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_relative);

        final Button buttonRelativePrev = findViewById(R.id.btn08);
        buttonRelativePrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityRelative();
            }
        });

    }

    private void openActivityRelative() {
        Intent intent = new Intent(this, Frame2Table.class);
        startActivity(intent);
    }
}
