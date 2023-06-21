package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Linear2Frame extends AppCompatActivity {
    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_frame);
        gDetector = new GestureDetector(this, new EscuchaGestos(this, Frame2Table.class, Constraint2Linear.class));

        final Button buttonFrameNext = findViewById(R.id.btn05);
        buttonFrameNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityTable();
            }
        });

        final Button buttonFramePrev = findViewById(R.id.btn04);
        buttonFramePrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityLinear();
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void openActivityTable() {
        Intent intent = new Intent(this, Frame2Table.class);
        startActivity(intent);
    }

    private void openActivityLinear() {
        Intent intent = new Intent(this, Constraint2Linear.class);
        startActivity(intent);
    }
}