package com.example.appsustentabilidade;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Descricao_Planta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_planta);

        titulo_planta = findViewById(R.id.txt_titulo_planta);
        caracteristicas = findViewById(R.id.txt_texto_planta);

        Intent receber_dados = getIntent();
        String titulo = receber_dados.getStringExtra(MainActivity.ENVIAR_TITULO);
        titulo_planta.setText(titulo);
    }
    TextView titulo_planta;
    TextView caracteristicas;
}