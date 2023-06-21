package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Constraint2Linear extends AppCompatActivity {
    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_linear);
        gDetector = new GestureDetector(this, new EscuchaGestos(this, Linear2Frame.class, ConstraintActivity.class));
        ImageView imageView = findViewById(R.id.imageView2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageView.startAnimation(animation);

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

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
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
