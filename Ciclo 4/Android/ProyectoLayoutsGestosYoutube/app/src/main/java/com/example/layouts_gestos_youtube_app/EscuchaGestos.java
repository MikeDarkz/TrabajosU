package com.example.layouts_gestos_youtube_app;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class EscuchaGestos extends GestureDetector.SimpleOnGestureListener {
    private Activity activityOrigen;
    private Class<? extends Activity> activityDestinoSiguiente, activityDestinoAnterior;
    public EscuchaGestos(Activity origen, Class<? extends Activity> destinoSiguiente, Class<? extends Activity> destinoAnterior){
        this.activityOrigen = origen;
        this.activityDestinoSiguiente = destinoSiguiente;
        this.activityDestinoAnterior = destinoAnterior;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
        float ancho = Math.abs(e2.getX() - e1.getX());
        float alto = Math.abs(e2.getY() - e1.getY());

        if(ancho > alto) {
            if (e2.getX() > e1.getX()) {
                IntentUtils.redirigirAAnterior(this.activityOrigen, this.activityDestinoAnterior);
            } else {
                IntentUtils.redirigirASiguiente(this.activityOrigen, this.activityDestinoSiguiente);
            }
        }

        return false;
    }

}
