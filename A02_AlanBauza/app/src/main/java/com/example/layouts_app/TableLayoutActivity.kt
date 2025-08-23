package com.example.layouts_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layouts_app.R

class TableLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)
        val btnRegresar: Button = findViewById(R.id.btnRegresar)

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}