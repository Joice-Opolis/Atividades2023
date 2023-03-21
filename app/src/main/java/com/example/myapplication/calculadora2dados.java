package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class calculadora2dados extends AppCompatActivity {
    EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2dados);
        resultado=findViewById(R.id.resultado);

        Intent it = getIntent();
        String resultado2 = it.getStringExtra("resultado");
        resultado.setText(resultado2);
    }
}