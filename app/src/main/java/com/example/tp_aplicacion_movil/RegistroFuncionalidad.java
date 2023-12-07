package com.example.tp_aplicacion_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroFuncionalidad extends AppCompatActivity {

    private LinearLayout layoutRegistros;
    private EditText editTextTitulo;
    private EditText editTextDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_registro);
        setContentView(R.layout.registro_actividades);

        editTextTitulo = findViewById(R.id.editTextTitulo);
        editTextDescripcion = findViewById(R.id.editTextDescripcion);
        Button btnAgregar = findViewById(R.id.btnAgregar);
        layoutRegistros = findViewById(R.id.layoutRegistros);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarRegistro();
            }
        });
    }

    private void agregarRegistro() {
        String titulo = editTextTitulo.getText().toString();
        String descripcion = editTextDescripcion.getText().toString();

        // Crear una nueva vista para mostrar el registro
        TextView nuevoRegistro = new TextView(this);
        nuevoRegistro.setText("Título: " + titulo + "\nDescripción: " + descripcion);

        // Agregar la nueva vista al layout de registros
        layoutRegistros.addView(nuevoRegistro);
    }
}
