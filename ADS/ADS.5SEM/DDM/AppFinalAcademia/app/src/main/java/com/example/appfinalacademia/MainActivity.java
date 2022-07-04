package com.example.appfinalacademia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView TxtNome, TxtEmail, TxtPeso, TxtAltura, TxtIdade;
    Button btnNovoUsuario, btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovoUsuario = findViewById(R.id.btnNovoUsuario);
        btnEditar = findViewById(R.id.btnEditar);
        TxtNome = findViewById(R.id.lblNome);
        TxtEmail = findViewById(R.id.lblEmail);
        TxtPeso = findViewById(R.id.lblPeso);
        TxtAltura = findViewById(R.id.lblAltura);
        TxtIdade = findViewById(R.id.lblIdade);

        btnNovoUsuario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ AcessarDados();}
        });
    }

    public void AcessarDados(){
        String Nome, Email, Peso, Altura, Idade;

        Nome = TxtNome.getText().toString();
        Email = TxtEmail.getText().toString();
        Peso = TxtPeso.getText().toString();
        Altura = TxtAltura.getText().toString();
        Idade = TxtIdade.getText().toString();

        /*//TESTE
        Nome = "Breno";
        Email = "breno.breno@gmail.com";
        Peso = "110 kg";
        Altura = "182cm";
        Idade = "20";*/


        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("nome",Nome);
        intent.putExtra("email",Email);
        intent.putExtra("peso",Peso);
        intent.putExtra("altura",Altura);
        intent.putExtra("idade",Idade);
        startActivity(intent);
    }


}