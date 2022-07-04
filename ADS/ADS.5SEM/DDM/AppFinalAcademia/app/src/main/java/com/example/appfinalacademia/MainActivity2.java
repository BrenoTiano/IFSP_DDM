package com.example.appfinalacademia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText EdtNome, EdtEmail, EdtPeso, EdtAltura, EdtIdade;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        EdtNome = findViewById(R.id.editTextNome);
        EdtEmail = findViewById(R.id.editTextEmail);
        EdtPeso = findViewById(R.id.editTextPeso);
        EdtAltura = findViewById(R.id.editTextAltura);
        EdtIdade = findViewById(R.id.editTextIdade);
        recebeDados();

        btnCancelar = findViewById(R.id.btnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    public void recebeDados(){
        Bundle recebeDados = getIntent().getExtras();

        if (recebeDados != null){
            String nome, email, peso, altura, idade;
            nome = recebeDados.getString("nome");
            email = recebeDados.getString("email");
            peso = recebeDados.getString("peso");
            altura = recebeDados.getString("altura");
            idade = recebeDados.getString("idade");
            if(nome.length() > 0){
                EdtNome.setText("" + nome);
            }else{
                EdtNome.setText("");
            }
            if(email.length() > 0){
                EdtEmail.setText("" + email);
            }else{
                EdtEmail.setText("");
            }
            if(peso.length() > 0){
                EdtPeso.setText("" + peso);
            }else{
                EdtPeso.setText("");
            }
            if(altura.length() > 0){
                EdtAltura.setText("" + altura);
            }else{
                EdtAltura.setText("");
            }
            if(idade.length() > 0){
                EdtIdade.setText("" + idade);
            }else{
                EdtIdade.setText("");
            }
        }else{
            return;
        }
        /*EdtNome.setText("" + nome);
        EdtEmail.setText("" + email);
        EdtPeso.setText("" + peso);
        EdtAltura.setText("" + altura);
        EdtIdade.setText("" + idade);*/
    }
}