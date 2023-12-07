package com.example.tp_aplicacion_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class RegistroAGregar extends AppCompatActivity {

    private static final String PREFS_NAME = "MisActividades";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_registro);

        // Código para agregar una actividad (ejemplo)
        // Supongamos que obtienes los detalles de la actividad desde alguna vista

        String nuevaActividad = obtenerDetallesActividad(); // Método para obtener los detalles de la actividad

        // Guardar la nueva actividad en SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Set<String> actividades = sharedPreferences.getStringSet("actividades", new HashSet<>());
        actividades.add(nuevaActividad);
        editor.putStringSet("actividades", actividades);
        editor.apply();
    }

    // Otros métodos y lógica de tu actividad
}
