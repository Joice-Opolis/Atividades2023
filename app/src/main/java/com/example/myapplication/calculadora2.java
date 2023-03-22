package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculadora2 extends AppCompatActivity {
    EditText etN1;
    EditText etN2;
    Button bmais;
    Button bmenos;
    Button bmultiplica;
    Button bdivide;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
        etN1=findViewById(R.id.N1);
        etN2=findViewById(R.id.N2);
        bmais=findViewById(R.id.bmais);
        bmenos=findViewById(R.id.bmenos);
        bmultiplica=findViewById(R.id.bmultiplica);
        bdivide=findViewById(R.id.bdivide);


        bmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                int soma = num1+num2;

                Intent it = new Intent(calculadora2.this,calculadora2dados.class);
                it.putExtra("resultado",String.valueOf(soma));
                startActivity(it);

            }
        });

        bmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                int subtrair = num1-num2;

                Intent it = new Intent(calculadora2.this,calculadora2dados.class);
                it.putExtra("resultado",String.valueOf(subtrair));
                startActivity(it);

            }
        });

        bmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                int multiplicar = num1*num2;

                Intent it = new Intent(calculadora2.this,calculadora2dados.class);
                it.putExtra("resultado",String.valueOf(multiplicar));
                startActivity(it);

            }
        });

        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                int dividir = num1/num2;
                Intent it = new Intent(calculadora2.this,calculadora2dados.class);
                it.putExtra("resultado",String.valueOf(dividir));
                startActivity(it);

            }
        });
    }
}