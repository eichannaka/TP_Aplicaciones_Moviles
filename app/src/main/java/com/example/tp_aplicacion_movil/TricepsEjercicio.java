package com.example.tp_aplicacion_movil;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TricepsEjercicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_triceps);
        ImageButton backButton = findViewById(R.id.id_btn_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TricepsEjercicio.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}