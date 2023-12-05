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

        // Encuentra tus ImageButtons por sus IDs
        ImageButton btnPecho = findViewById(R.id.idPecho);

        // Agrega un listener al ImageButton
        btnPecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configura el intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, PechoEjercicio.class);
                startActivity(intent);
            }
        });
    }
    // Otro código de la actividad principal
}
