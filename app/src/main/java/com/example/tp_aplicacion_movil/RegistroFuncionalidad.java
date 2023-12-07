package com.example.tp_aplicacion_movil;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RegistroFuncionalidad extends AppCompatActivity {

    private LinearLayout layoutRegistros;
    private EditText editTextTitulo;
    private EditText editTextDescripcion;
    private ArrayList<String> registros; // ArrayList para almacenar los registros

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_actividades); // Cambio a la actividad 'registro_actividades'
        editTextTitulo = findViewById(R.id.editTextTitulo);
        editTextDescripcion = findViewById(R.id.editTextDescripcion);
        Button btnAgregar = findViewById(R.id.btnAgregar);
        layoutRegistros = findViewById(R.id.layoutRegistros);
        registros = new ArrayList<>(); // Inicializar el ArrayList

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

        // Crear un nuevo registro en formato de cadena
        String nuevoRegistro = "Título: " + titulo + "\nDescripción: " + descripcion;

        // Agregar el registro al ArrayList
        registros.add(nuevoRegistro);

        // Actualizar la vista con todos los registros
        actualizarRegistros();
    }

    private void actualizarRegistros() {
        // Limpiar la vista antes de mostrar los registros actualizados
        layoutRegistros.removeAllViews();

        // Recorrer el ArrayList y agregar cada registro como un TextView al layout
        for (String registro : registros) {
            TextView textViewRegistro = new TextView(this);
            textViewRegistro.setText(registro);
            layoutRegistros.addView(textViewRegistro);
        }
    }
}
