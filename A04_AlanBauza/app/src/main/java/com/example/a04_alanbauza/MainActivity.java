package com.example.a04_alanbauza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFoto, btnHorario, btnActividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoto = findViewById(R.id.btn_foto);
        btnHorario = findViewById(R.id.btn_horario);
        btnActividades = findViewById(R.id.btn_actividades);

        // Carga el fragmento inicial al iniciar la actividad
        loadFragment(new fragment_foto());

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_foto());
            }
        });

        btnHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_horario());
            }
        });

        btnActividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_actividades());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // Inicia una transacción de fragmentos
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Reemplaza el contenido del FrameLayout con el nuevo fragmento
        transaction.replace(R.id.fragment_container, fragment);

        // Opcional: añade la transacción a la "back stack" para poder regresar con el botón "atrás"
        // transaction.addToBackStack(null);

        // Confirma los cambios
        transaction.commit();
    }
}