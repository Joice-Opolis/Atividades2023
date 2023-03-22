package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculadora2dados extends AppCompatActivity {
    EditText resultado;
    Button bvoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2dados);
        resultado=findViewById(R.id.resultado);
        bvoltar=findViewById(R.id.bvoltar);

        Intent it = getIntent();
        String resultado2 = it.getStringExtra("resultado");
        resultado.setText(resultado2);

        bvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(calculadora2dados.this,calculadora2.class);
                startActivity(in);
            }
        });


    }

}


