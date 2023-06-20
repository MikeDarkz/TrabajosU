package com.example.redirigirapp;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Gestos extends AppCompatActivity {
    private TextView gestureText;
    private GestureDetector gDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestos_activity);

        gestureText = (TextView) findViewById(R.id.gestos);
        gDetector = new GestureDetector(this, new EscuchaGestos());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class EscuchaGestos extends GestureDetector.SimpleOnGestureListener {

        @Override
        public void onLongPress(MotionEvent e){
            gestureText.setText("Presion Larga");
        }

        @Override
        public boolean onDoubleTap(MotionEvent e){
            gestureText.setText("Doble Toque");
            return false;
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e){
            gestureText.setText("Toque Simple");
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            float ancho = Math.abs(e2.getX() - e1.getX());
            float alto = Math.abs(e2.getY() - e1.getY());

            if(ancho > alto){
                if(e2.getX() > e1.getX()){
                    gestureText.setText("Desplazamiento a la Derecha");
                } else{
                    gestureText.setText("Desplazamiento a la Izquierda");
                }
            } else{
                if(e2.getY() > e1.getY()){
                    gestureText.setText("Desplazamiento hacia Abajo");
                } else{
                    gestureText.setText("Desplazamiento hacia Arriba");
                }
            }

            return false;
        }
    }
}
