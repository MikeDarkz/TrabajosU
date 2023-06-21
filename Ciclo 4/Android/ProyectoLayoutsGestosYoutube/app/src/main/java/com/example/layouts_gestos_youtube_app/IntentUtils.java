package com.example.layouts_gestos_youtube_app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;

public class IntentUtils {
    public static void redirigirASiguiente(Activity origen, Class<? extends Activity> destino) {
        Intent intent = new Intent(origen, destino);
        ActivityOptions options = ActivityOptions.makeCustomAnimation(origen, R.anim.slide_in, R.anim.slide_out);
        origen.startActivity(intent, options.toBundle());
    }

    public static void redirigirAAnterior(Activity origen, Class<? extends Activity> destino) {
        Intent intent = new Intent(origen, destino);
        ActivityOptions options = ActivityOptions.makeCustomAnimation(origen, R.anim.slide_anterior_in, R.anim.slide_anterior_out);
        origen.startActivity(intent, options.toBundle());
    }
}
