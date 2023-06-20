package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tipos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);

        // Instânciando os objetos
        btn_home = findViewById(R.id.img_btn_home);
        btn_tipos = findViewById(R.id.img_btn_tipo);
        btn_perfil = findViewById(R.id.img_btn_perfil);


        // Botões NavBar
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Tipos.this, MainActivity.class);
                startActivity(home);
            }
        });

        btn_tipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent tipos = new Intent(Tipos.this, Tipos.class);
                startActivity(tipos);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent perfil = new Intent(Tipos.this, Perfil.class);
                startActivity(perfil);
            }
        });
    }
    ImageButton btn_home;
    ImageButton btn_tipos;
    ImageButton btn_perfil;
}