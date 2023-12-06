
package com.example.tp_aplicacion_movil;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Referencias a los elementos del diseño XML
        emailEditText = findViewById(R.id.idMailET);
        passwordEditText = findViewById(R.id.idContraET);
        loginButton = findViewById(R.id.id_btn_inicioSesion);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el texto de los EditText
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Verificar si el correo electrónico o la contraseña están vacíos
                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                    // Mostrar mensaje de advertencia
                    Toast.makeText(LoginActivity.this, "Tenes que completar ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Ambos campos están completos, proceder a la actividad principal
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    // Aquí podrías agregar lógica adicional si es necesario
                }
            }
        });
    }
}
