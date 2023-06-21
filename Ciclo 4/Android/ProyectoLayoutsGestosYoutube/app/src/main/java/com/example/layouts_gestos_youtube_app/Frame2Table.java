package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Frame2Table extends AppCompatActivity {
    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_table);
        gDetector = new GestureDetector(this, new EscuchaGestos(this, Table2Relative.class, Linear2Frame.class));

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

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
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
