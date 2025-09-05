package com.example.a03_alanbauza;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtDetalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnOnClick = findViewById(R.id.btnOnClick);
        Button btnOnLongClick = findViewById(R.id.btnOnLongClick);

        EditText textField = findViewById(R.id.textField);
        EditText textFieldDos = findViewById(R.id.textFieldDos);

        Button btnOnTouch = findViewById(R.id.btnOnTouch);
        txtDetalle = (TextView) findViewById(R.id.txtDetalle);
        txtDetalle = findViewById(R.id.txtDetalle);
        btnOnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtDetalle.setText("Evento onClick");
                Toast.makeText(MainActivity.this, "onClick!", Toast.LENGTH_SHORT).show();
            }
        });

        btnOnLongClick.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                txtDetalle.setText("Evento onLongClick");
                Toast.makeText(MainActivity.this, "onLongClick!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        textField.setOnFocusChangeListener((view, hasFocus) -> {
            if (hasFocus) {
                txtDetalle.setText("Evento OnFocus:Focuseado!");
                Toast.makeText(this, "Evento onFocus:Focuseado", Toast.LENGTH_SHORT).show();
            } else {
                txtDetalle.setText("Evento OnFocus:Ignorao!");
                Toast.makeText(this, "Evento onFocus:Ignorado", Toast.LENGTH_SHORT).show();
            }
        });

        textFieldDos.setOnFocusChangeListener((view, hasFocus) -> {
            if (hasFocus) {
                txtDetalle.setText("Evento OnFocus:Focuseado!");
                Toast.makeText(this, "Evento onFocus:Focuseado", Toast.LENGTH_SHORT).show();
            } else {
                txtDetalle.setText("Evento OnFocus:Ignorao!");
                Toast.makeText(this, "Evento onFocus:Ignorado", Toast.LENGTH_SHORT).show();
            }
        });

        btnOnTouch.setOnTouchListener((view, motionEvent) -> {
            if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                txtDetalle.setText("Evento OnTouch:UP!");
                Toast.makeText(this, "Evento onTouch:UP", Toast.LENGTH_SHORT).show();
                return true;
            } else if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                txtDetalle.setText("Evento OnTouch:DOWN!");
                Toast.makeText(this, "Evento onTouch:DOWN", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });

    };
}