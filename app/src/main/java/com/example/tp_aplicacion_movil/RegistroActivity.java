package com.example.tp_aplicacion_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    private LinearLayout layoutRegistro;
    private EditText editTextTitulo;
    private EditText editTextDescripcion;
    private int contadorRegistro = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        layoutRegistro = findViewById(R.id.layout_registro);
        editTextTitulo = findViewById(R.id.editTextTitulo);
        editTextDescripcion = findViewById(R.id.editTextDescripcion);
        Button btnAgregar = findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarRutina();
            }
        });
    }

    private void agregarRutina() {
        String titulo = editTextTitulo.getText().toString().trim();
        String descripcion = editTextDescripcion.getText().toString().trim();

        if (!titulo.isEmpty() && !descripcion.isEmpty()) {
            contadorRegistro++;

            LinearLayout nuevaRutinaLayout = new LinearLayout(this);
            nuevaRutinaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            nuevaRutinaLayout.setOrientation(LinearLayout.VERTICAL);
            nuevaRutinaLayout.setPadding(8, 8, 8, 8);

            // Crear un shape programáticamente para el fondo del LinearLayout
            GradientDrawable border = new GradientDrawable();
            border.setCornerRadius(8); // Radio de las esquinas
            nuevaRutinaLayout.setBackground(border);

            TextView tvTitulo = new TextView(this);
            tvTitulo.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            tvTitulo.setText("Registro " + contadorRegistro + ": " + titulo);
            tvTitulo.setTextSize(18);
            tvTitulo.setTypeface(null, Typeface.BOLD);

            TextView tvDescripcion = new TextView(this);
            tvDescripcion.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            tvDescripcion.setText(descripcion);
            tvDescripcion.setTextSize(14);

            nuevaRutinaLayout.addView(tvTitulo);
            nuevaRutinaLayout.addView(tvDescripcion);

            layoutRegistro.addView(nuevaRutinaLayout);
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        editTextTitulo.getText().clear();
        editTextDescripcion.getText().clear();
    }
}
