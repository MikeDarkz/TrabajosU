package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Table2Relative extends AppCompatActivity {
    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_relative);
        gDetector = new GestureDetector(this, new EscuchaGestos(this, Youtube.class, Frame2Table.class));

        final Button buttonRelativePrev = findViewById(R.id.btn08);
        buttonRelativePrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityRelative();
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void openActivityRelative() {
        Intent intent = new Intent(this, Frame2Table.class);
        startActivity(intent);
    }
}
