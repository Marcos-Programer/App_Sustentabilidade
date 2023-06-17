package com.example.appsustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = findViewById(R.id.img_btn_home);
        btn_tipo = findViewById(R.id.img_btn_tipo);
        btn_perfil = findViewById(R.id.img_btn_perfil);

        btn_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent home = new Intent(MainActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        btn_tipo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tipos = new Intent(MainActivity.this, Tipos.class);
                startActivity(tipos);
            }
        });

        btn_perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(MainActivity.this, Perfil.class);
                startActivity(perfil);
            }
        });

    }
    ImageButton btn_home;
    ImageButton btn_tipo;
    ImageButton btn_perfil;
}