package com.example.tp_aplicacion_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ImageButtons de los musculos por sus IDs
        ImageButton btnPecho = findViewById(R.id.idPecho);
        ImageButton btnPierna = findViewById(R.id.idPierna);
        ImageButton btnEspalda = findViewById(R.id.idEspalda);
        ImageButton btnTriceps = findViewById(R.id.idTriceps);
        ImageButton btnAbdominales = findViewById(R.id.idAbdominales);
        ImageButton btnBiceps = findViewById(R.id.idBiceps);


        // Agrega un listener al ImageButton Pecho
        btnPecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, PechoEjercicio.class);
                startActivity(intent);
            }
        });
        // Agrega un listener al ImageButton Pecho
        btnPierna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, PiernaEjercicio.class);
                startActivity(intent);
            }
        });
        // Agrega un listener al ImageButton Pecho
        btnEspalda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, EspaldaEjercicio.class);
                startActivity(intent);
            }
        });
        // Agrega un listener al ImageButton Pecho
        btnTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, TricepsEjercicio.class);
                startActivity(intent);
            }
        }); // Agrega un listener al ImageButton Pecho
        btnAbdominales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, AbdominalesEjercicio.class);
                startActivity(intent);
            }
        });
        btnBiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, BicepsEjercicio.class);
                startActivity(intent);
            }
        });



    }
    // Otro código de la actividad principal
}
