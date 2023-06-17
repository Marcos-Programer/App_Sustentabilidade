package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        btn_home = findViewById(R.id.img_btn_home);
        btn_tipos = findViewById(R.id.img_btn_tipo);
        btn_perfil = findViewById(R.id.img_btn_perfil);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent home = new Intent(Perfil.this, MainActivity.class);
                startActivity(home);
            }
        });

        btn_tipos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent tipos = new Intent(Perfil.this, Tipos.class);
                startActivity(tipos);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent perfil = new Intent(Perfil.this, Perfil.class);
                startActivity(perfil);
            }
        });
    }

    ImageButton btn_home;
    ImageButton btn_tipos;
    ImageButton btn_perfil;
}