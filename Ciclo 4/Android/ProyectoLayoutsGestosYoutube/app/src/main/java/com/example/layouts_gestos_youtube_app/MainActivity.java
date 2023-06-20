package com.example.layouts_gestos_youtube_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button2Layouts = findViewById(R.id.btn_layouts);
        button2Layouts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { openLayouts(); }
        });
        final Button button2Gestos = findViewById(R.id.btn_gestos);
        button2Gestos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { openGestos(); }
        });
        final Button button2IFrameYoutube = findViewById(R.id.btn_youtube);
        button2IFrameYoutube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { openYoutubeApp(); }
        });

    }

    private void openLayouts() {
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }

    private void openGestos() {
        Intent intent = new Intent(this, Gestos.class);
        startActivity(intent);
    }

    private void openYoutubeApp() {
        Intent intent = new Intent(this, Youtube.class);
        startActivity(intent);
    }
}
