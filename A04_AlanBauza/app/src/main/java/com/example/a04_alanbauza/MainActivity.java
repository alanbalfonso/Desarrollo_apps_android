package com.example.a04_alanbauza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAnimacion, btnComics, btnDrama, btnComedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnimacion = findViewById(R.id.btn_animacion);
        btnComics = findViewById(R.id.btn_comics);
        btnDrama = findViewById(R.id.btn_drama);
        btnComedia = findViewById(R.id.btn_comedia);

        // Carga el fragmento inicial al iniciar la actividad
        loadFragment(new fragment_animacion());

        btnAnimacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_animacion());
            }
        });

        btnComics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_comics());
            }
        });

        btnDrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_drama());
            }
        });

        btnComedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new fragment_comedia());
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