package com.example.redirigirapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Frame2Table extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_table);

        final Button buttonTableNext = findViewById(R.id.btn07);
        buttonTableNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityRelative();
            }
        });

        final Button buttonTablePrev = findViewById(R.id.btn06);
        buttonTablePrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityFrame();
            }
        });

    }

    private void openActivityRelative() {
        Intent intent = new Intent(this, Table2Relative.class);
        startActivity(intent);
    }

    private void openActivityFrame() {
        Intent intent = new Intent(this, Linear2Frame.class);
        startActivity(intent);
    }
}
