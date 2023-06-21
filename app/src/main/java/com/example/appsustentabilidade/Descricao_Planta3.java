package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Descricao_Planta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_planta3);

        titulo_planta = findViewById(R.id.txt_titulo_planta);
        caracteristicas = findViewById(R.id.txt_texto_planta);
        voltar = findViewById(R.id.img_btn_voltar);
        home = findViewById(R.id.img_btn_home);
        tipos = findViewById(R.id.img_btn_tipo);
        perfil = findViewById(R.id.img_btn_perfil);

        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(Descricao_Planta3.this, MainActivity.class);
                startActivity(voltar);
            }
        });

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Descricao_Planta3.this, MainActivity.class);
                startActivity(home);
            }
        });

        tipos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent tipo = new Intent(Descricao_Planta3.this, Tipos.class);
                startActivity(tipo);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent perfil = new Intent(Descricao_Planta3.this, Perfil.class);
                startActivity(perfil);
            }
        });


    }
    TextView titulo_planta;
    TextView caracteristicas;
    ImageView voltar;
    ImageButton home;
    ImageButton tipos;
    ImageButton perfil;
}