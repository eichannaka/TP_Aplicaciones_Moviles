package com.example.tp_aplicacion_movil;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resto de tu código actual
        ImageButton btnPecho = findViewById(R.id.idPecho);
        ImageButton btnPierna = findViewById(R.id.idPierna);
        ImageButton btnEspalda = findViewById(R.id.idEspalda);
        ImageButton btnTriceps = findViewById(R.id.idTriceps);
        ImageButton btnAbdominales = findViewById(R.id.idAbdominales);
        ImageButton btnBiceps = findViewById(R.id.idBiceps);

        // Agregar listeners a los ImageButtons existentes

        btnPecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Configurar intent para iniciar la nueva actividad
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
    public void goToRegistroActividadesLayout(View view) {
        Intent intent = new Intent(MainActivity.this, RegistroActivity.class);
        startActivity(intent);
    }

    // Otro código de la actividad

}
