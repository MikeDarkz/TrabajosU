package com.example.layouts_gestos_youtube_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ConstraintActivity extends AppCompatActivity {
    private GestureDetector gDetector;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);
        gDetector = new GestureDetector(this, new EscuchaGestos(this, Constraint2Linear.class, MainActivity.class));
        image = (ImageView) findViewById(R.id.imageView);

        final Button buttonConstraintNext = findViewById(R.id.btn01);
        buttonConstraintNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityLinear();
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            boolean cambiado = false;
            @Override
            public void onClick(View view) {
                if(!cambiado) {
                    image.setImageResource(R.drawable.android_cool);
                    cambiado = !cambiado;
                } else {
                    image.setImageResource(R.drawable.android);
                    cambiado = !cambiado;
                }
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void openActivityLinear() {
        Intent intent = new Intent(this, Constraint2Linear.class);
        ActivityOptions options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in, R.anim.slide_out);
        startActivity(intent, options.toBundle());
    }
}

