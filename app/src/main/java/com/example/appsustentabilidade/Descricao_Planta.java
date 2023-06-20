package com.example.appsustentabilidade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Descricao_Planta extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_planta);

        titulo_planta = findViewById(R.id.txt_titulo_planta);
        caracteristicas = findViewById(R.id.txt_texto_planta);
        voltar = findViewById(R.id.img_btn_voltar);
        home = findViewById(R.id.img_btn_home);
        tipos = findViewById(R.id.img_btn_tipo);
        perfil = findViewById(R.id.img_btn_perfil);

        Intent receber_dados = getIntent();

        if(receber_dados.hasExtra("ENVIAR_TITULO")){
            String titulo = receber_dados.getStringExtra("ENVIAR_TITULO");
            titulo_planta.setText(titulo);
        }
        else if(receber_dados.hasExtra("ENVIAR_DETALHE")){
            String detalhe = receber_dados.getStringExtra("ENVIAR_DETALHE");
            caracteristicas.setText(detalhe);
        }

        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(Descricao_Planta.this, MainActivity.class);
                startActivity(voltar);
            }
        });

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Descricao_Planta.this, MainActivity.class);
                startActivity(home);
            }
        });

        tipos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent tipo = new Intent(Descricao_Planta.this, Tipos.class);
                startActivity(tipo);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent perfil = new Intent(Descricao_Planta.this, Perfil.class);
                startActivity(perfil);
            }
        });


    }
    TextView titulo_planta;
    TextView caracteristicas;
    ImageButton voltar;
    ImageButton home;
    ImageButton tipos;
    ImageButton perfil;
}